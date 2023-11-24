import os.path
import operator
import torch
import pandas as pd
from Code.configures import data_args, model_args
from Code.DMon import DMon
from load_dataset import CodeDataset
from explanation.explainer.subgraphX import SubgraphX, find_closest_node_result, PlotUtils
from Code.load_dataset import get_cross_dataloader
from dig.xgraph.models import GCN_2l_mask
from dig.xgraph.method import subgraphx
from Code.code_dataset_new import get_one_sample
import numpy as np
import matplotlib.pyplot as plt


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


def Classification_one(model, data_input, data_raw):
    """
        --- module ---
        feed data into model for classification task
    """

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


def ExposedSource(explaining_result, data_raw, edgeList):
    """
        --- module ---
        get explanations: important index, important edges, code snippets
    """
    # find all the critical nodes and code snippets
    for importantIndex in explaining_result.coalition:
        print("(", importantIndex, ")", end="\n")
        for element in range(2, 4):
            for step_find in range(len(data_raw["graph_nodes_codes"][int(importantIndex)][element])):
                print('\033[0:34m' + data_raw["graph_nodes_codes"][int(importantIndex)][element][step_find] + '\033[m')
    # find all the critical edges
    node_code_info = data_raw['graph_nodes_codes']
    CriticalEdges = [(node_code_info[n_frm][1]['beginLine'] - 1, node_code_info[n_to][1]['beginLine'] - 1) for
                     (n_frm, n_to) in explaining_result.ori_graph.edges() if
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


def ExplainingPipeline(max_nodes):
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
    save_dir = os.path.join('../newResults',
                            f"{model_args.model_name}")
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
    data_name = "Scalabrino200.java"
    # 判断选择图是否是训练集中的图数据
    if data_name in train_graphs_set:
        print("------ This graph is in training set ------")
    else:
        print("------ This graph is not in training set ------")
    # loop 200 graphs in the dataset
    for i in range(200):
        # get each graph
        data_input, data_raw = dataset[i]
        # 选择图进行解释以及可视化
        if data_name in data_raw["graph_name"]:
            # ----- module: load explainer ------
            explainer = SubgraphX(gnnNets, num_classes=3, device=device, explain_graph=False,
                                  reward_method='mc_l_shapley', save_dir=save_dir, filename=data_raw["graph_name"])

            # ----- module: classification ------
            prediction = Classification(gnnNets, dataset, i)
            # 目前只考虑对unreadable数据集中的图解释
            if prediction == 2:
                print("------ Correct prediction ------")
            else:
                print("------ Incorrect prediction ------")
                if prediction == 1:
                    print("------ The model believes it is Neutral ------")
                else:
                    print("------ The model believes it is Readable ------")

            # ----- module: explain ------
            explaining_result, results, related_preds, edge_list = Explain(explainer, prediction, data_input, max_nodes)
            final_result.append(related_preds[prediction])

            # ----- module: visualization ------
            plotutils = PlotUtils(dataset_name='code_readability')
            explainer.visualization(results, prediction=prediction, max_nodes=max_nodes,
                                    plot_utils=plotutils, data_raw=data_raw,
                                    edge_list=edge_list, save_dir=save_dir)

            # ----- module: expose source code ------
            ExposedSource(explaining_result, data_raw, edge_list)

    return final_result


def one_sample(max_nodes, data_input, data_raw):
    # ----- module: load dataset ------
    device = torch.device('cuda:0' if torch.cuda.is_available() else 'cpu')  # initialize device
    # ----- module: load trained model (mainly hgcn, rgcn or ...) ------
    # 1. create model
    gnnNets = DMon(data_args, model_args)
    # 2. load best performance state
    ModelLoading(gnnNets, device)
    # save final result
    save_dir = os.path.join('../newResults',
                            f"{model_args.model_name}")
    if not os.path.isdir(save_dir):
        os.mkdir(save_dir)

    explainer = SubgraphX(gnnNets, num_classes=3, device=device, explain_graph=False,
                          reward_method='mc_l_shapley', save_dir=save_dir, filename=data_raw["graph_name"])

    # ----- module: classification ------
    prediction = Classification_one(gnnNets, data_input, data_raw)
    print(prediction)
    # 目前只考虑对unreadable数据集中的图解释
    if prediction == 2:
        print("------ Correct prediction ------")
    else:
        print("------ Incorrect prediction ------")
        if prediction == 1:
            print("------ The model believes it is Neutral ------")
        else:
            print("------ The model believes it is Readable ------")

    # ----- module: explain ------
    explaining_result, results, related_preds, edge_list = Explain(explainer, prediction, data_input, max_nodes)

    final_result = related_preds[prediction]

    # ----- module: visualization ------
    plotutils = PlotUtils(dataset_name='code_readability')
    explainer.visualization(results, prediction=prediction, max_nodes=max_nodes,
                            plot_utils=plotutils, data_raw=data_raw,
                            edge_list=edge_list, save_dir=save_dir)

    ExposedSource(explaining_result, data_raw, edge_list)

    return final_result


def predictionScript(start, end):
    device = torch.device('cuda:0' if torch.cuda.is_available() else 'cpu')
    gnnNets = DMon(data_args, model_args)
    ModelLoading(gnnNets, device)

    for i in range(start, end):
        json_path = os.path.join("../Dataset/1000/CoDesc-blocks-json",
                                 f"Test{i}.json")
        java_path = os.path.join("../Dataset/1000/CoDesc-blocks-merged",
                                 f"Test{i}.java")
        if os.path.exists(json_path) and os.path.exists(java_path):
            data_raw, data_input = get_one_sample(json_path, java_path)
            prediction = Classification_one(gnnNets, data_input, data_raw)
            print(prediction)
            if prediction == 0:
                print("------ Incorrect Prediction ------")
                print("The model believes Test ", i, " is Readable")
            elif prediction == 1:
                print("------ Incorrect Prediction ------")
                print("The model believes Test ", i, " is Neutral")
            elif prediction == 2:
                print('\033[0:34m' + "!!!!!! Correct Prediction !!!!!!" + '\033[m')
                print('\033[0:34m' + "Test " + str(i) + " is unreadable" + '\033[m')

        else:
            continue


def EvaluateDataset(max_nodes):
    # ----- module: load dataset ------
    device = torch.device('cuda:0' if torch.cuda.is_available() else 'cpu')  # initialize device
    dataset = DatasetLoading("input.pkl")

    # ----- module: load trained model (mainly hgcn, rgcn or ...) ------
    # 1. create model
    gnnNets = DMon(data_args, model_args)
    # 2. load best performance state
    ModelLoading(gnnNets, device)
    # save final result
    save_dir = os.path.join('../newResults',
                            f"{model_args.model_name}")
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
    final_result_fidelity = []
    final_result_sparsity = []
    # 指定某图
    data_name = "Scalabrino200.java"
    # 判断选择图是否是训练集中的图数据
    if data_name in train_graphs_set:
        print("------ This graph is in training set ------")
    else:
        print("------ This graph is not in training set ------")
    # loop 200 graphs in the dataset
    for i in range(200):
        print("----- Current Step " + str(i) + " -----")
        # get each graph
        data_input, data_raw = dataset[i]
        # 选择图进行解释以及可视化
        # ----- module: load explainer ------
        explainer = SubgraphX(gnnNets, num_classes=3, device=device, explain_graph=False,
                              reward_method='mc_l_shapley', save_dir=save_dir, filename=data_raw["graph_name"])

        # ----- module: classification ------
        prediction = Classification(gnnNets, dataset, i)
        # 目前只考虑对unreadable数据集中的图解释
        if prediction == 2:
            print("------ Correct prediction ------")
        else:
            print("------ Incorrect prediction ------")
            if prediction == 1:
                print("------ The model believes it is Neutral ------")
            else:
                print("------ The model believes it is Readable ------")

        # ----- module: explain ------
        explaining_result, results, related_preds, edge_list = Explain(explainer, prediction, data_input, max_nodes)

        final_result_fidelity.append(related_preds[prediction]['fidelity'])
        final_result_sparsity.append(related_preds[prediction]['sparsity'])

    return np.mean(final_result_fidelity), np.mean(final_result_sparsity)


def drawLineGraph(fidelity_results, sparsity_results, F_gnn_results, S_gnn_results):
    # mpl.rcParams['font.sans-serif'] = ['SimHei']

    x_axis_data = sparsity_results
    y_axis_data = fidelity_results

    x_axis_data2 = S_gnn_results
    y_axis_data2 = F_gnn_results

    # plot中参数的含义分别是横轴值，纵轴值，颜色，透明度和标签
    plt.plot(x_axis_data, y_axis_data, 'ro-', color='#4169E1', alpha=0.8, label='SubgraphX')
    plt.plot(x_axis_data2, y_axis_data2, 'ro-', color='#FF8000', alpha=0.8, label='GNNExplainer')


    # 添加标题和标签
    plt.title('Processed Dataset')
    plt.legend()

    plt.xlabel("Sparsity")
    plt.ylabel("Fidelity")
    # 显示图形
    plt.show()
    # 保存该图片


if __name__ == '__main__':
    # final = ExplainingPipeline(8)
    # print(final)

    data_raw, data_input = get_one_sample(
        "../Dataset/1000/CoDesc-blocks-json/Test9.json",
        "../Dataset/1000/CoDesc-blocks-merged/Test9.java")

    # data_raw, data_input = get_one_sample(
    #     "../Dataset/Readable/Scalabrino11.json",
    #     "../Dataset/Readable/Scalabrino11.java")

    # data_raw, data_input = get_one_sample(
    #     "../Dataset/Extra Snippets/after-process-json/sample1.json",
    #     "../Dataset/Extra Snippets/after-process/sample1.java")

    result = one_sample(15, data_input, data_raw)

    # predictionScript(163, 180)

    # max_nodes = [18, 15, 12, 9, 6]
    # fidelity_results = [0.43108256988227367, 0.43118572227656843, 0.42865799739956856, 0.42051329553127287, 0.4089443155378103]
    # sparsity_results = [0.25004820411432077, 0.28649755315687064, 0.3400141493451148, 0.429533748014728, 0.5552325740800774]
    # gnn_fidelity_results = [0.0989, 0.0960, 0.0898, 0.0789, 0.0645]
    # gnn_sparsity_results = [0.2500, 0.2864, 0.3400, 0.4295, 0.5552]
    # # for m_node in max_nodes:
    # #     fidelity_mean, sparsity_mean = EvaluateDataset(m_node)
    # #     fidelity_results.append(fidelity_mean)
    # #     sparsity_results.append(sparsity_mean)
    # # print(fidelity_results)
    # # print(sparsity_results)
    # drawLineGraph(fidelity_results=fidelity_results, sparsity_results=sparsity_results,
    #               F_gnn_results=gnn_fidelity_results, S_gnn_results=gnn_sparsity_results)