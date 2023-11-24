import os.path
import operator
import torch
import pandas as pd
from dig.xgraph.evaluation import XCollector
from matplotlib import pyplot as plt

from Code.code_dataset_new import get_one_sample
from Code.configures import data_args, model_args
from Code.DMon import DMon
from load_dataset import CodeDataset
from explainer.gnnexplainer import GNNExplainer
from utils.explaining_configures import x_args
from dig.xgraph.models import GCN_2l_mask

def DatasetLoading(pkl_path):
    """
        --- module ---
        load dataset (pkl file),
        return a CodeDataset object,
        which can be used in classification task
    """
    pkl_file = pd.read_pickle(pkl_path)
    input_file = pkl_file["input"]  # dataset - data file
    raw_file = pkl_file["file"]  # dataset - raw file
    dataset = CodeDataset(input_file, raw_file)
    return dataset


def ModelLoading(model, device):
    """
        --- module ---
        load model (gnn model with the best performance)
    """
    checkpoint_best = torch.load(
        os.path.join("../Code", "checkpoint", "code_hh", "dmon_best_2.pth"))
    model.update_state_dict(checkpoint_best['net'])
    model.to(device)
    model.eval()


def Classification(model, dataset, graph_index):
    """
        --- module ---
        feed data into model for classification task
        return prediction: 0 -- readable; 1 -- neutral; 2 -- unreadable
    """
    # get each graph
    data_input, data_raw = dataset[graph_index]
    print("Explaining graph: ", data_raw['graph_name'])

    # 选择图进行解释以及可视化
    probs, _ = model(data_input)
    # get prediction result
    prediction = probs.squeeze().argmax(-1).item()

    return prediction

def classification_one(model, data_input, data_raw):
    print("Explaining graph: ", data_raw['graph_name'])

    # 选择图进行解释以及可视化
    probs, _ = model(data_input)
    # get prediction result
    prediction = probs.squeeze().argmax(-1).item()

    return prediction


def Visualization(explainer, final_result, data, data_raw, node_idx, x_collector, ROOT_DIR):
    """
        --- module ---
        visualize explanation
    """
    walks = final_result['edge_masks']
    masks = final_result['hard_edge_masks']
    related_preds = final_result['related_preds']

    x_collector.collect_data(masks,
                             related_preds,
                             data.y)

    node_labels = getlabels(data_raw)

    critical_edges = []
    if x_args.vis:
        gt_label = data.y
        if x_args.walk:
            labeled_walks = walks
            labeled_walks['score'] = labeled_walks['score'][:, gt_label]
            ax, G, critical_edges = explainer.visualize_graph(node_idx=0 if node_idx is None else node_idx, edge_index=data.edge_index,
                                              edge_mask=masks[gt_label],
                                              y=data.x[:, 0] if node_idx is None else data.y, node_labels=node_labels, edge_types=data_raw['edge_types'])
        else:
            ax, G, critical_edges = explainer.visualize_graph(node_idx=0 if node_idx is None else node_idx, edge_index=data.edge_index,
                                              edge_mask=masks[gt_label],
                                              y=data.x[:, 0] if node_idx is None else data.y, node_labels=node_labels, edge_types=data_raw['edge_types'])
        ax.set_title(f'{x_args.explainer}\nF: {x_collector.fidelity:.4f}  S: {x_collector.sparsity:.4f}')
        graph_name = data_raw['graph_name']
        if x_args.save_fig:
            print('save fig as:', os.path.join(ROOT_DIR, 'visual_results', f'{graph_name}.png'))
            plt.savefig(os.path.join(ROOT_DIR, 'visual_results', f'{graph_name}.png'), dpi=500)
        else:
            plt.show()

    return critical_edges


def getlabels(data_raw):
    """
        mark all nodes with labels
    """

    index = data_raw["graph_nodes_codes"]

    nodes_types = data_raw['graph_nodes_type']

    loop = ['DoStmt', 'ForEachStmt', 'ForStmt', 'WhileStmt', 'BreakStmt', 'ContinueStmt']
    branch = ['SwitchEntry', 'SwitchStmt', 'IfStmt', 'ElseIfStmt', 'ElseStmt']
    exception = ['TryStmt', 'CatchStmt', 'FinallyStmt', 'ThrowStmt', 'AssertStmt']
    other = ['ExpressionStmt', 'LabeledStmt', 'LocalClassDeclarationStmt',
             'ReturnStmt', 'ExplicitConstructorInvocationStmt',
             'JavadocComment', 'LineComment', 'BlockComment']
    declaration = ['MethodDeclaration', 'ConstructorDeclaration']

    all_node_types = loop + branch + exception + other + declaration

    loop_type = ['D', 'FE', 'F', 'W', 'B', 'C']
    branch_type = ['SE', 'S', 'I', 'EI', 'El']
    exception_type = ['T', 'Ca', 'Fi', 'Th', 'A']
    other_type = ['E', 'L', 'LCD', 'R', 'CI', 'DC', 'LC', 'BC']
    declaration_type = ['MD', 'CD']
    type_labels = loop_type + branch_type + exception_type + other_type + declaration_type

    node_labels = {}
    for i in range(len(index)):
        # node_labels[i] = type_labels[all_node_types.index(nodes_types[i])]
        node_labels[i] = str(index[i][1]['beginLine'] - 1) + ":" + type_labels[all_node_types.index(nodes_types[i])]

    return node_labels

def ExposedSource(critical_edges, data_raw):
    """
        --- module ---
        present all the critical edges and nodes with corresponding code snippets
    """
    print(critical_edges)
    critical_nodes = []
    for edge in critical_edges:
        if edge[0] not in critical_nodes:
            critical_nodes.append(edge[0])
        if edge[1] not in critical_nodes:
            critical_nodes.append(edge[1])

    # find all the critical nodes and code snippets
    for importantIndex in critical_nodes:
        print("(", importantIndex, ")", end="\n")
        for element in range(2, 4):
            for step_find in range(len(data_raw["graph_nodes_codes"][int(importantIndex)][element])):
                print('\033[0:34m' + data_raw["graph_nodes_codes"][int(importantIndex)][element][step_find] + '\033[m')

def ExplainingPipeline():
    """
        the entire pipeline of explanation; the classification task is based on graph
    """

    # ----- module: load dataset ------
    device = torch.device('cuda:0' if torch.cuda.is_available() else 'cpu')  # initialize device
    dataset = DatasetLoading("input.pkl")

    # ----- module: load trained model (mainly hgcn, rgcn or ...) ------
    # 1. create model
    gnnNets = DMon(data_args, model_args)
    # 2. load best performance state
    ModelLoading(gnnNets, device)

    # ----- module: feed graph data into trained model for classification task ------
    # final result
    final_result = {}
    # loop 200 graphs in the dataset
    for i in range(200):
        # get each graph
        data_input, data_raw = dataset[i]
        # 选择图进行解释以及可视化
        if "Scalabrino20.java" in data_raw["graph_name"]:
            # ----- module: load explainer ------
            explainer = GNNExplainer(gnnNets, explain_graph=True)

            # view prediction
            prediction = Classification(gnnNets, dataset, i)
            if prediction == 2:
                print("------ Correct prediction ------")
            else:
                print("------ Incorrect prediction ------")
                if prediction == 1:
                    print("------ The model believes it is Neutral ------")
                else:
                    print("------ The model believes it is Readable ------")

            # ----- module: explain ------
            edge_masks, hard_edge_masks, related_preds = explainer(data_input,
                                                                   node_idx=None, sparsity=0.7, num_classes=3)
            final_result = {'edge_masks': edge_masks, 'hard_edge_masks': hard_edge_masks, 'related_preds': related_preds}

            # ----- module: visualization ------
            explain_collector = XCollector()
            root_dir = '../newResults/gnnexplainer'
            critical_edges = Visualization(explainer=explainer, final_result=final_result, node_idx=None, data=data_input, data_raw=data_raw,
                          x_collector=explain_collector, ROOT_DIR=root_dir)

            # ----- module: exposed source ------
            ExposedSource(critical_edges, data_raw)

    return final_result

def ExplainOneExample(data_input, data_raw, sparsity):
    device = torch.device('cuda:0' if torch.cuda.is_available() else 'cpu')  # initialize device

    # ----- module: load trained model (mainly hgcn, rgcn or ...) ------
    # 1. create model
    gnnNets = DMon(data_args, model_args)
    # 2. load best performance state
    ModelLoading(gnnNets, device)

    # ----- module: feed graph data into trained model for classification task ------

    # ----- module: load explainer ------
    explainer = GNNExplainer(gnnNets, explain_graph=True)

    # view prediction
    prediction = classification_one(gnnNets, data_input=data_input, data_raw=data_raw)
    if prediction == 2:
        print("------ Correct prediction ------")
    else:
        print("------ Incorrect prediction ------")
        if prediction == 1:
            print("------ The model believes it is Neutral ------")
        else:
            print("------ The model believes it is Readable ------")

    # ----- module: explain ------
    edge_masks, hard_edge_masks, related_preds = explainer(data_input,
                                                           node_idx=None, sparsity=sparsity, num_classes=3)
    final_result = {'edge_masks': edge_masks, 'hard_edge_masks': hard_edge_masks, 'related_preds': related_preds}

    # ----- module: visualization ------
    explain_collector = XCollector()
    root_dir = '../newResults/gnnexplainer'
    critical_edges = Visualization(explainer=explainer, final_result=final_result, node_idx=None, data=data_input,
                                   data_raw=data_raw,
                                   x_collector=explain_collector, ROOT_DIR=root_dir)

    # ----- module: exposed source ------
    ExposedSource(critical_edges, data_raw)

    return final_result


if __name__ == '__main__':
    # data_raw, data_input = get_one_sample(
    #     "../Dataset/Readable/Scalabrino11.json",
    #     "../Dataset/Readable/Scalabrino11.java")

    data_raw, data_input = get_one_sample(
        "../Dataset/1000/CoDesc-blocks-json/Test45.json",
        "../Dataset/1000/CoDesc-blocks-merged/Test45.java")



    final = ExplainOneExample(data_input=data_input, data_raw=data_raw, sparsity=0.7)

    # print(ExplainingPipeline())
