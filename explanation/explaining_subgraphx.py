import os.path
import operator
import torch
import pandas as pd
from Code.configures import data_args, model_args
from Code.DMon import DMon
from load_dataset import CodeDataset
from explainer.subgraphX import SubgraphX, find_closest_node_result, PlotUtils
from Code.load_dataset import get_cross_dataloader
from dig.xgraph.models import GCN_2l_mask
from dig.xgraph.method import subgraphx
import csv


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
    """
    # get each graph
    data_input, data_raw = dataset[graph_index]
    print("Explaining graph: ", data_raw['graph_name'])

    # 选择图进行解释以及可视化
    probs, _ = model(data_input)
    # get prediction result
    prediction = probs.squeeze().argmax(-1).item()

    return prediction


def Explain(explainer, prediction, data, max_nodes):
    """
        --- module ---
        explainer gives explanation based on prediction of gnn
    """
    _, explanation_results, related_preds = \
        explainer(data, max_nodes=max_nodes)
    result = find_closest_node_result(explanation_results[prediction], max_nodes=max_nodes)
    # store edge list
    edge_list = []
    raw_egdeList = result.data.edge_index.numpy().tolist()
    for j in range(len(raw_egdeList[0])):
        edge_list.append((raw_egdeList[0][j], raw_egdeList[1][j]))

    return result, explanation_results, related_preds, edge_list


def ExposedSource(explaining_result, data_raw, edgeList, data_record):
    """
        --- module ---
        get explanations: important index, important edges, code snippets
    """
    # find all the critical nodes and code snippets
    # for importantIndex in explaining_result.coalition:
    #     print("(", importantIndex, ")", end="\n")
    #     for element in range(2, 4):
    #         for step_find in range(len(data_raw["graph_nodes_codes"][int(importantIndex)][element])):
    #             print('\033[0:34m' + data_raw["graph_nodes_codes"][int(importantIndex)][element][step_find] + '\033[m')
    # find all the critical edges
    node_code_info = data_raw['graph_nodes_codes']
    CriticalEdges = [(node_code_info[n_frm][1]['beginLine'] - 1, node_code_info[n_to][1]['beginLine'] - 1) for (n_frm, n_to) in explaining_result.ori_graph.edges() if
                n_frm in explaining_result.coalition and n_to in explaining_result.coalition]
    CriticalEdgesRaw = [(n_frm, n_to) for (n_frm, n_to) in explaining_result.ori_graph.edges() if
                n_frm in explaining_result.coalition and n_to in explaining_result.coalition]
    # for EdgeTuple1, index in zip(edgeList, range(len(edgeList))):
    #     for CriticalTuple in CriticalEdges:
    #         EdgeTupleConfer = (node_code_info[EdgeTuple1[0]][1]['beginLine'], node_code_info[EdgeTuple1[1]][1]['beginLine'])
    #         if operator.eq(EdgeTupleConfer, CriticalTuple):
    #             print(EdgeTupleConfer, " index: ", index, " Type: ", data_raw['edge_types'][index])
    for criticalindex in range(len(CriticalEdges)):
        # find index of edge in all edges
        index = edgeList.index(CriticalEdgesRaw[criticalindex])
        print(f"{CriticalEdges[criticalindex]}, Type: {data_raw['edge_types'][index]}")
    row_data = [data_raw['graph_name'], len(node_code_info), len(edgeList), len(explaining_result.coalition), len(CriticalEdges)]
    data_record.append(row_data)
    print("Nodes: ", len(node_code_info), "; ", "Edges: ", len(edgeList), "; ", "Critical Nodes: ", len(explaining_result.coalition), "; ", "Critical Edges: ", len(CriticalEdges))


def recordInCSV(data_record):
    """
        this function writes each row of data into a single csv
    """
    file_path = '../statistics_readable.csv'
    file_exists = os.path.exists(file_path)
    with open(file_path, mode='w', newline='') as f:
        writer = csv.writer(f)

        if not file_exists or os.path.getsize(file_path) == 0:
            writer.writerow(["Graph Name", "Num of Nodes", "Num of Edges", "Num of Critical Nodes", "Num of Critical Edges"])
        for row in data_record:
            writer.writerow(row)
    print(f"Data written to {file_path}")

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
    # save final result
    save_dir = os.path.join('../newResults/readable')
    if not os.path.isdir(save_dir):
        os.mkdir(save_dir)

    # ----- 回避训练用的数据集，打开训练数据集看看哪些是被用于训练的 ------
    dataloader_list, dataloaderfull_list = get_cross_dataloader(data_args)
    # 选第几折
    dataloader_exposed = dataloaderfull_list[1]
    train_graphs_set = set()
    for train_graph in dataloader_exposed['train']:
        for graph in train_graph['graph_name']:
            train_graphs_set.add(graph)

    # ----- module: feed graph data into trained model for classification task ------
    # final result
    final_result = []
    # 指定某图
    # data_name = "Scalabrino125.java"
    data_dir = "../Dataset/Readable"
    # 判断选择图是否是训练集中的图数据
    # if data_name in train_graphs_set:
    #     print("------ This graph is in training set ------")
    # else:
    #     print("------ This graph is not in training set ------")

    data_record = []
    # loop 200 graphs in the dataset
    for i in range(200):
        # get each graph
        data_input, data_raw = dataset[i]
        # 选择图进行解释以及可视化
        if os.path.exists(os.path.join(data_dir, data_raw['graph_name'])):
            if data_raw['graph_name'] in train_graphs_set:
                print("------ This graph is in training set ------")
            else:
                print("------ This graph is not in training set ------")
            # ----- module: load explainer ------
            explainer = SubgraphX(gnnNets, num_classes=3, device=device, explain_graph=False,
                                  reward_method='mc_l_shapley', save_dir=save_dir, filename=data_raw["graph_name"])

            # ----- module: classification ------
            prediction = Classification(gnnNets, dataset, i)
            # 目前只考虑对unreadable数据集中的图解释
            if prediction == 2:
                print("------ Model believe it is unreadable ------")
            elif prediction == 1:
                print("------ Model believe it is neutral ------")
            elif prediction == 0:
                print("------ Model believe it is readable ------")

            # ----- module: explain ------
            max_node = data_input.num_nodes // 2
            explaining_result, results, related_preds, edge_list = Explain(explainer, prediction, data_input, max_node)
            final_result.append(related_preds[prediction])

            # ----- module: visualization ------
            plotutils = PlotUtils(dataset_name='code_readability')
            explainer.visualization(results, prediction=prediction, max_nodes=max_node,
                                    plot_utils=plotutils, data_raw=data_raw,
                                    edge_list=edge_list, save_dir=save_dir)

            # ----- module: expose source code ------
            ExposedSource(explaining_result, data_raw, edge_list, data_record)

    return data_record


if __name__ == '__main__':
    # max nodes control the critical nodes in the graph
    data_record = ExplainingPipeline()
    # recordInCSV(data_record)
    print("ok!")
