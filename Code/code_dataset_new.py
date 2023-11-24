import os.path
import json

from torch_geometric.data import Data
from transformers import AutoTokenizer, AutoModel

import re
import glob
import pandas as pd

import torch
import numpy as np



def handleJavaCode(filename, code_range):
    """
    Extract his code and his comments for each node,
    1. filename is the original file;
    2. code-range is the range of this node
    """
    with open(filename, 'r') as f:
        file = f.read()
        file_list = file.replace("\t", " ").split("\n")
        range_file_list = []

        beginLine = code_range["beginLine"] - 2
        beginColumn = code_range["beginColumn"]
        endLine = code_range["endLine"] - 2
        endColumn = code_range["endColumn"]

        if beginLine < 0 or endLine < 0:
            return [], []
        if beginLine == endLine:
            for i in range(0, len(file_list)):
                if i == beginLine:
                    range_file_list.append(file_list[i][beginColumn - 1:endColumn])
        else:
            # print(len(file_list))
            for i in range(0, len(file_list)):
                if i == beginLine:
                    range_file_list.append(file_list[i][beginColumn - 1:])
                elif i == endLine:
                    range_file_list.append(file_list[i][0: endColumn])
                elif i > beginLine and i < endLine:
                    range_file_list.append(file_list[i])
            # print("kkk")

        nl_list = []
        code_list = []

        for str in range_file_list:
            if str.find("//") != -1:
                nl_list.append(str)
            elif str.find("*") != -1 and str.find("/*(MInterface)*/") == -1 and str.find("* 100 )") == -1 \
                    and str.find("t1.*, t2.*") == -1 and str.find("inner_query.*") == -1 and str.find(
                "SELECT *") == -1 and str.find("SELECT * ") == -1 \
                    and str.find("count(*)") == -1 and str.find("2.0 * ") == -1 and str.find(
                "bodyWeight * 2.0") == -1 and str.find("bodyWeight*-1)") == -1 \
                    and str.find(" - 1.0) * ") == -1 and str.find(")*(") == -1 and str.find(
                "/* Here we' go! */") == -1 and str.find(" * 12 )") == -1 \
                    and str.find("select *") == -1 and str.find("/*Notation.findNotation") == -1 and str.find(
                "*=") == -1 and str.find("* 100 )") == -1 and str.count("*") != 1:
                nl_list.append(str)
            else:
                code_list.append(str)

        return nl_list, code_list


def codeEmbedding(nl_list, code_list, tokenizer, model):
    """
    CodeEmbedding the extracted data
    """
    # print("begin to embedding")

    code = ""
    nl = ""
    for str in code_list:
        code = code + str

    for str in nl_list:
        nl = nl + str

    code_tokens = tokenizer.tokenize(code)
    nl_tokens = tokenizer.tokenize(nl)
    token_list = []
    token_embeddings = []
    tokens = [tokenizer.cls_token] + nl_tokens + [tokenizer.sep_token] + code_tokens + [tokenizer.sep_token]
    token_list = cutToken(tokens, token_list)
    for token in token_list:
        token_id = tokenizer.convert_tokens_to_ids(token)
        context_embeddings = model(torch.tensor(token_id)[None, :])[0]
        token_embeddings.append(context_embeddings)

    torch_tensor = torch.cat(token_embeddings, dim=1)

    return torch_tensor.tolist()[0]


def cutToken(tokens, token_list):
    """
    Cut tokens which are too long
    """
    if len(tokens) > 500:
        token_list.append(tokens[0:500])
        tokens = tokens[500: len(tokens)]
        cutToken(tokens, token_list)
    else:
        token_list.append(tokens)
    return token_list


def one_hot_node_type(node_type):
    """
     Handle 68 kinds of nodes with One-Hot
    """
    node_type = node_type.replace("com.github.javaparser.ast.", "")

    hot_dict = {'AssertStmt': 0, 'BreakStmt': 1, 'ContinueStmt': 2, 'DoStmt': 3, 'ExplicitConstructorInvocationStmt': 4,
                'ExpressionStmt': 5, 'ForEachStmt': 6, 'ForStmt': 7, 'LabeledStmt': 8, 'LocalClassDeclarationStmt': 9,
                'ReturnStmt': 10,
                'SwitchEntry': 11, 'SwitchStmt': 12, 'ThrowStmt': 13, 'WhileStmt': 14, 'MethodDeclaration': 15,
                'ConstructorDeclaration': 16, 'CatchStmt': 17,
                'IfStmt': 18, 'ElseIfStmt': 19, 'ElseStmt': 20, 'TryStmt': 21,
                'FinallyStmt': 22, 'JavadocComment': 23, 'LineComment': 24, 'BlockComment': 25 }

    index = hot_dict[node_type]
    all_zero = np.zeros(len(hot_dict.keys()), dtype=int)
    node_type_one_hot = all_zero.copy()
    node_type_one_hot[index] = 1
    # print(node_type_one_hot)
    return list(node_type_one_hot)


def get_directory_files(directory):
    return [os.path.basename(file) for file in glob.glob(f"{directory}/*.json")]


def write_pkl(data_frame: pd.DataFrame, path, file_name):
    data_frame.to_pickle(path + file_name)


def ConvertToGraph(json_content):
    STMT = ['AssertStmt', 'BreakStmt', 'ContinueStmt', 'DoStmt', 'ExplicitConstructorInvocationStmt',
            'ExpressionStmt', 'ForEachStmt', 'ForStmt', 'LabeledStmt', 'LocalClassDeclarationStmt', 'ReturnStmt',
            'SwitchEntry', 'SwitchStmt', 'ThrowStmt', 'WhileStmt', 'MethodDeclaration', 'ConstructorDeclaration',
            'CatchClause']
    # IfStmt, ElseIfStmt, ElseStmt, TryStmt, CatchStmt, FinallyStmt

    EXPR = ['VariableDeclarationExpr', 'Parameter','NameExpr']
    COMMENT = ['JavadocComment', 'LineComment', 'BlockComment']
    TYPES = STMT + EXPR + COMMENT

    Node_type = []
    Node_range = []

    # loopKeys 的graph是要遍历这个graph里面所有的子节点，它自己有无！已经被处理过了
    def loopKeys(graph, key):
        # 情况1： 节点是个list，这里就需要多重处理，因为相当于多个情况2
        if isinstance(graph[key], list):
            # graph[key]是个list，里面有好多个item
            for item in graph[key]:
                createGraph(item, key)

        # 情况2： 节点是个dict
        elif isinstance(graph[key], dict):
            createGraph(graph[key], key)

    # 这里的name是这个graph对应的supergraph下面的key
    def createGraph(graph, name):

        # 只有是节点！，才会递归
        if "!" in graph.keys():
            noneName = graph["!"].split(".")[-1]

            if noneName in TYPES:
                if noneName == "CatchClause":
                    Node_type.append("CatchStmt")
                else:
                    Node_type.append(noneName)

                Node_range.append(graph["range"])
                for k in graph.keys():
                    loopKeys(graph, k)

            elif noneName == "TryStmt":
                Node_type.append(noneName)
                try_range = graph["tryBlock"]["range"]
                try_range["beginColumn"] = graph["range"]["beginColumn"]
                Node_range.append(try_range)

                # 手动进入一层。。
                for key in graph.keys():
                    if key == "finallyBlock":
                        subgraph = graph["finallyBlock"]
                        Node_type.append("FinallyStmt")

                        fin_range = subgraph["range"]
                        fin_range["beginColumn"] = 0
                        Node_range.append(fin_range)

                        for k in subgraph.keys():
                            loopKeys(subgraph, k)

                    else:  # 110 comment
                        loopKeys(graph, key)

            elif noneName == "IfStmt":

                # 如果是if stmt，记住，这个最上面的if的范围是它的thenStmt
                if name == "elseStmt":
                    noneName = "ElseIfStmt"

                then_range = graph["thenStmt"]["range"]
                condition = graph["condition"]["range"]
                if_range = {"beginLine": graph["range"]["beginLine"], "beginColumn": graph["range"]["beginColumn"],
                            "endLine": then_range["endLine"], "endColumn": then_range["endColumn"]}
                Node_type.append(noneName)
                Node_range.append(if_range)

                for k in graph.keys():
                    loopKeys(graph, k)

            elif noneName == "BlockStmt" and name == "elseStmt":
                else_range = graph["range"]
                else_range["beginColumn"] = 0
                Node_range.append(else_range)
                Node_type.append("ElseStmt")

                for k in graph.keys():
                    loopKeys(graph, k)

            else:
                for k in graph.keys():
                    loopKeys(graph, k)

    createGraph(json_content, "graph")

    return {"node_type": Node_type, "node_range": Node_range}


def json_parse_to_graph(N_PATHS_AST, R_PATHS_AST, U_PATHS_AST):
    """
       Convert json file to Graph Representation
    """
    n_dataset_files = get_directory_files(N_PATHS_AST)
    r_dataset_files = get_directory_files(R_PATHS_AST)
    u_dataset_files = get_directory_files(U_PATHS_AST)

    graph_list = []
    target_list = []
    code_filename_list = []

    for json_file in r_dataset_files:
        with open(os.path.join(R_PATHS_AST, json_file)) as f:
            print(json_file)
            content = json.load(f)
            graph = ConvertToGraph(content)
            graph_list.append(graph)
            target_list.append(0)
            code_filename_list.append(os.path.join(R_PATHS_AST, json_file.replace(".json", ".java")))

    for json_file in n_dataset_files:
        with open(os.path.join(N_PATHS_AST, json_file)) as f:
            print(json_file)
            content = json.load(f)
            graph = ConvertToGraph(content)
            graph_list.append(graph)
            target_list.append(1)
            code_filename_list.append(os.path.join(N_PATHS_AST, json_file.replace(".json", ".java")))

    for json_file in u_dataset_files:
        with open(os.path.join(U_PATHS_AST, json_file)) as f:
            print(json_file)
            content = json.load(f)
            graph = ConvertToGraph(content)
            graph_list.append(graph)
            target_list.append(2)
            code_filename_list.append(os.path.join(U_PATHS_AST, json_file.replace(".json", ".java")))

    return graph_list, target_list, code_filename_list


def addEdges(graph, fileName, target):
    node_type = graph["node_type"]  # node type
    node_range = graph["node_range"]  # node range

    edge_list = [[], []]
    edge_types = []

    print("==================", fileName, "=============")

    # 在标数据流的时候有两种节点，一种是申明，一种是使用，申明都在前面
    node_declaration_list = []
    node_assign_list = []
    # 用来加控制流
    node_stmt_list = []

    for i in range(len(node_range)):

        nl, code = handleJavaCode(fileName, node_range[i])

        if 'NameExpr' in node_type[i]:
            node_assign_list.append([node_type[i], node_range[i], re.split(' |\.|\)|\(|\[|\]|\=|,', "".join(code))])

        elif 'VariableDeclarationExpr' in node_type[i] \
                or node_type[i] == 'Parameter':
            node_declaration_list.append(
                [node_type[i], node_range[i], re.split(' |\.|\)|\(|\[|\]|\=|,', "".join(code))])

        else:
            node_stmt_list.append([node_type[i], node_range[i], nl, code])

    node_declaration_list.sort(key=lambda x: (x[1]["beginLine"], -int(x[1]["endLine"]), x[1]["endColumn"]))
    node_assign_list.sort(key=lambda x: (x[1]["beginLine"], -int(x[1]["endLine"]),  x[1]["endColumn"]))
    node_stmt_list.sort(key=lambda x: (x[1]["beginLine"], -int(x[1]["endLine"]),  x[1]["endColumn"]))

    # ADD CONTROL FLOWS
    control_line_list = []
    if len(node_stmt_list) > 1:
        for i in range(len(node_stmt_list) - 1):
            control_line_list.append([node_stmt_list[i][1]['beginLine'] - 1, node_stmt_list[i + 1][1]['beginLine'] - 1])

    remove_line, add_line = AddControlByHand(fileName)

    for line in remove_line:
        control_line_list.remove(line)

    for line in add_line:
        control_line_list.append(line)

    for line in control_line_list:
        edge_list[0].append(findIndex(node_stmt_list, line[0], fileName))
        edge_list[1].append(findIndex(node_stmt_list, line[1], fileName))
        edge_types.append('Control')

    # ADD Data FLOWS
    data_edge_list = DataEdgeHandle(node_declaration_list, node_assign_list)
    for line in data_edge_list:
        edge_list[0].append(findIndex(node_stmt_list, line[0], fileName))
        edge_list[1].append(findIndex(node_stmt_list, line[1], fileName))
        edge_types.append('Data')

    # ADD AST FLOWS
    stmt_list = []
    for i in range(len(node_stmt_list)):
        stmt_list.append([i, "", [node_stmt_list[i][1]["beginLine"], node_stmt_list[i][1]["endLine"]]])

    edge_list, edge_types = ast_edges_handle(stmt_list, edge_list, edge_types)

    node_type = []
    for node in node_stmt_list:
        node_type.append(node[0])

    newGraph = {"node": node_stmt_list, "node_type": node_type, "edge_type": edge_types, "edge_list": edge_list,
                "file_name": fileName, "target": target}

    return newGraph


def embedNode(newGraph, tokenizer, model):

    node_info_list = []

    for i in range(len(newGraph["node"])):

        node_embedding = codeEmbedding(newGraph["node"][i][2], newGraph["node"][i][3], tokenizer, model)  # 通过bert后
        node_embedding = np.array(node_embedding)
        node_embedding = np.mean(node_embedding, axis=0)

        node_type_one_hot = one_hot_node_type(newGraph["node"][i][0])
        node_info = np.concatenate((node_embedding.tolist(), node_type_one_hot), axis=0)
        node_info_list.append(node_info)


    x = torch.tensor(node_info_list)
    x = x.to(torch.float32)
    y = torch.tensor([newGraph["target"]])
    edge_index = torch.tensor(newGraph["edge_list"])
    graph_data = Data(x = x, edge_index = edge_index, y = y)

    newGraph["graph_data"] = graph_data
    newGraph["node_info"] = x

    return newGraph


def DataEdgeHandle(declaration_list, assign_list):
    data_flow_edge_list = []
    for decl in declaration_list:
        value = decl[2]
        value = [i for i in value if i != '']
        # value = filter(None, value)
        if 'static' in value:
            value.remove('static')
        if 'final' in value:
            value.remove('final')

        data_flow = []
        flag = True
        for assign in assign_list:
            if value[1] in assign[2]:
                if flag:
                    data_flow.append(decl[1]['beginLine'] - 1)
                    data_flow.append(assign[1]['beginLine'] - 1)
                    flag = False
                else:
                    data_flow.append(assign[1]['beginLine'] - 1)

        data_flow = list(set(data_flow))
        data_flow.sort()
        for j in range(len(data_flow) - 1):
            data_flow_edge_list.append([data_flow[j], data_flow[j + 1]])

    return data_flow_edge_list


def findIndex(stmt_node_list, line, fileName):
    for node in stmt_node_list:
        if node[1]["beginLine"] == line + 1:
            return stmt_node_list.index(node)

    else:
        return findIndex(stmt_node_list, line - 1, fileName)


def ast_edges_handle(node_stmt_list, edge_list, edge_type):
    """
        process ast edges, parallel methods cannot be handled well
    """
    # store ast edges
    node_ast_edges = edge_list
    original_node_id = []
    destination_node_id = []
    # 一个一个stmt节点遍历检查
    for pointer in range(len(node_stmt_list)):
        # 将每一个遍历点作为一个destination node，然后寻找original node
        destination_pointer = pointer
        # 第一个点不是destination
        if destination_pointer == 0:
            continue

        else:
            # 从第二个节点开始要往上寻找把当前节点包住的节点(beginline, endline)
            # 关键是往上寻找那个最近的比当前节点endline大的节点

            # 放入destination node list
            # 考虑是不是开头几行有comment
            if pointer == 1:
                if node_stmt_list[pointer - 1][2][1] > node_stmt_list[pointer][2][1]:
                    destination_node_id.append(node_stmt_list[pointer][0])
            else:
                destination_node_id.append(node_stmt_list[pointer][0])
            while destination_pointer >= 0:
                if node_stmt_list[pointer][2][1] < node_stmt_list[destination_pointer][2][1]:
                    original_node_id.append(node_stmt_list[destination_pointer][0])
                    # 找到就终止循环
                    break
                else:
                    destination_pointer = destination_pointer - 1
                    if destination_pointer == -1:
                        destination_node_id.remove(node_stmt_list[pointer][0])

    edge_list[0] = edge_list[0] + original_node_id
    edge_list[1] = edge_list[1] + destination_node_id

    for _ in original_node_id:
        edge_type.append("AST")

    return edge_list, edge_type


def AddControlByHand(fileName):
    add_line = []
    remove_line = []

    # ==================Unreadable前10个==================
    if "Scalabrino7.java" in fileName:
        add_line = [[7, 10], [14, 35], [20, 35], [28, 35], [30, 20]]
        remove_line = [[8, 10], [30, 35]]

    elif "Scalabrino8.java" in fileName:
        add_line = [[11, 32], [13, 19], [15, 19], [19, 25], [21, 25], [27, 11], [28, 11]]
        remove_line = [[28, 32]]

    elif "Scalabrino15.java" in fileName:
        add_line = [[2, 38], [6, 8], [8, 30], [9, 27], [11, 21], [14, 16], [15, 33], [19, 38], [22, 33], [25, 33],
                    [25, 2], [28, 2], [34, 2]]
        remove_line = [[7, 8], [15, 16], [19, 21], [25, 27], [28, 30], [31, 33]]

    elif "Scalabrino28.java" in fileName:
        add_line = [[13, 18], [18, 22], [28, 33]]
        remove_line = []

    elif "Scalabrino34.java" in fileName:
        add_line = [[7, 10], [14, 40], [34, 37], [38, 14]]
        remove_line = [[8, 10], [38, 40]]

    elif "Scalabrino36.java" in fileName:
        add_line = [[2, 5], [5, 9]]
        remove_line = [[3, 5], [6, 9]]

    elif "Scalabrino43.java" in fileName:
        add_line = [[2, 11], [3, 7], [12, 19], [14, 19], [19, 26], [21, 26]]
        remove_line = [[8, 11]]

    elif "Scalabrino49.java" in fileName:
        add_line = [[3, 12]]
        remove_line = []

    elif "Scalabrino50.java" in fileName:
        add_line = [[7, 25], [9, 12], [12, 7], [17, 12], [20, 12], [25, 28]]
        remove_line = [[20, 25]]


    elif "Scalabrino68.java" in fileName:
        add_line = [[11, 15]]
        remove_line = []

    # ==================Unreadable后40个==================
    elif "Scalabrino69.java" in fileName:

        add_line = [[23, 26]]
        remove_line = []

    elif "Scalabrino74.java" in fileName:

        add_line = [[2, 10], [6, 5], [5, 10]]
        remove_line = [[6, 10]]

    elif "Scalabrino84.java" in fileName:

        add_line = [[13, 18], [22, 25], [25, 28]]
        remove_line = [[16, 18], [23, 25], [26, 28]]

    elif "Scalabrino89.java" in fileName:

        add_line = [[7, 14], [14, 17], [17, 20], [20, 25]]
        remove_line = [[18, 20], [23, 25]]

    elif "Scalabrino96.java" in fileName:

        add_line = []
        remove_line = []

    elif "Scalabrino97.java" in fileName:

        add_line = [[22, 30]]
        remove_line = []

    elif "Scalabrino98.java" in fileName:

        add_line = [[20, 29]]
        remove_line = []

    elif "Scalabrino109.java" in fileName:

        add_line = [[2, 33]]
        remove_line = [[30, 33]]

    elif "Scalabrino111.java" in fileName:

        add_line = [[4, 7], [9, 13], [13, 17], [17, 22]]
        remove_line = [[5, 7], [10, 13], [14, 17], [19, 22]]

    elif "Scalabrino125.java" in fileName:

        add_line = [[6, 10], [10, 17]]
        remove_line = [[15, 17]]

    elif "Scalabrino126.java" in fileName:

        add_line = [[18, 22], [20, 18]]
        remove_line = []

    elif "Scalabrino127.java" in fileName:

        add_line = []
        remove_line = []

    elif "Scalabrino132.java" in fileName:

        add_line = [[18, 21]]
        remove_line = [[19, 21]]

    elif "Scalabrino135.java" in fileName:

        add_line = []
        remove_line = []

    elif "Scalabrino137.java" in fileName:

        add_line = [[13, 22], [22, 29], [20, 13], [16, 20]]
        remove_line = []

    elif "Scalabrino140.java" in fileName:

        add_line = [[11, 14], [20, 23], [23, 29], [25, 29], [31, 37]]
        remove_line = []

    elif "Scalabrino142.java" in fileName:

        add_line = []
        remove_line = []

    elif "Scalabrino146.java" in fileName:

        add_line = [[14, 20], [20, 26]]
        remove_line = []

    elif "Scalabrino148.java" in fileName:

        add_line = []
        remove_line = []

    elif "Scalabrino149.java" in fileName:

        add_line = [[10, 9], [39, 9]]
        remove_line = []

    elif "Scalabrino154.java" in fileName:

        add_line = [[16, 25], [17, 20], [26, 29]]
        remove_line = [[22, 25]]


    elif "Scalabrino155.java" in fileName:

        add_line = [[2, 30], [4, 15], [6, 12], [15, 30], [16, 30], [10, 30], [12, 30], [13, 30], [7, 30], [36, 34],
                    [38, 34]]
        remove_line = [[10, 12], [13, 15]]


    elif "Scalabrino157.java" in fileName:

        add_line = [[5, 9], [10, 14], [15, 20]]
        remove_line = [[8, 9], [12, 14], [18, 20]]

    elif "Scalabrino158.java" in fileName:

        add_line = []
        remove_line = []

    elif "Scalabrino162.java" in fileName:

        add_line = []
        remove_line = []

    elif "Scalabrino163.java" in fileName:

        add_line = []
        remove_line = []

    elif "Scalabrino167.java" in fileName:

        add_line = []
        remove_line = []

    elif "Scalabrino170.java" in fileName:

        add_line = [[18, 22]]
        remove_line = []

    elif "Scalabrino173.java" in fileName:

        add_line = [[12, 15], [16, 18], [17, 22]]
        remove_line = [[17, 18]]

    elif "Scalabrino177.java" in fileName:

        add_line = []
        remove_line = []

    elif "Scalabrino178.java" in fileName:

        add_line = []
        remove_line = []

    elif "Scalabrino179.java" in fileName:

        add_line = []
        remove_line = []

    elif "Scalabrino180.java" in fileName:

        add_line = [[20, 23], [21, 20]]
        remove_line = []

    elif "Scalabrino181.java" in fileName:

        add_line = [[20, 27], [25, 34]]
        remove_line = [[25, 27]]

    elif "Scalabrino192.java" in fileName:

        add_line = []
        remove_line = []

    elif "Scalabrino194.java" in fileName:

        add_line = []
        remove_line = []

    elif "Scalabrino196.java" in fileName:

        add_line = []
        remove_line = []

    elif "Scalabrino197.java" in fileName:

        add_line = [[7, 19], [20, 33], [17, 7], [23, 19], [30, 19], [33, 19], [34, 19]]
        remove_line = [[30, 33]]

    elif "Scalabrino198.java" in fileName:

        add_line = [[6, 28], [8, 11], [11, 14], [14, 24], [9, 14]]
        remove_line = [[9, 11], [22, 24], [25, 28]]

    elif "Scalabrino200.java" in fileName:

        add_line = []
        remove_line = []


    # ==================Neutral前30个==================

    elif "Scalabrino2.java" in fileName:
        add_line = [[8, 12], [14, 19], [15, 22], [16, 29], [17, 29], [19, 29], [20, 29]]
        remove_line = [[10, 12], [17, 19], [27, 29]]

    elif "Scalabrino3.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino9.java" in fileName:
        add_line = [[20, 19], [22, 19], [29, 19]]

    elif "Scalabrino10.java" in fileName:
        add_line = [[4, 11], [11, 20], [20, 24], [6, 9], [10, 20], [13, 16]]
        remove_line = [[10, 11]]

    elif "Scalabrino12.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino13.java" in fileName:
        add_line = [[3, 7], [8, 21], [13, 8], [15, 8]]

    elif "Scalabrino14.java" in fileName:
        add_line = [[7, 19], [9, 15], [21, 23], [16, 7], [24, 19], [21, 19], [22, 19], [10, 7], [9, 7]]
        remove_line = [[10, 15], [16, 19], [22, 23]]

    elif "Scalabrino17.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino18.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino19.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino20.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino21.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino23.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino24.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino26.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino27.java" in fileName:
        add_line = [[2, 20], [4, 11], [12, 15], [22, 26], [31, 34], [35, 20], [32, 20], [16, 2], [13, 2], [5, 2]]
        remove_line = [[13, 15], [16, 20], [32, 34]]

    elif "Scalabrino29.java" in fileName:
        add_line = [[2, 13], [13, 20], [6, 10]]
        remove_line = [[10, 13]]

    elif "Scalabrino30.java" in fileName:
        add_line = [[2, 20], [3, 13]]
        remove_line = [[17, 20]]

    elif "Scalabrino31.java" in fileName:
        add_line = [[4, 13], [13, 16], [16, 19], [23, 21]]
        remove_line = [[23, 25]]

    elif "Scalabrino33.java" in fileName:
        add_line = [[13, 25], [14, 25], [16, 20], [17, 25], [20, 23], [21, 25]]
        remove_line = [[23, 25]]

    elif "Scalabrino37.java" in fileName:
        add_line = [[5, 8], [4, 11]]
        remove_line = [[8, 10]]

    elif "Scalabrino44.java" in fileName:
        add_line = [[15, 20], [22, 38], [26, 22], [27, 26]]
        remove_line = [[33, 38]]

    elif "Scalabrino46.java" in fileName:
        add_line = [[15, 23], [23, 26], [27, 12], [24, 12], [18, 15], [20, 15]]

    elif "Scalabrino47.java" in fileName:
        add_line = [[7, 15]]

    elif "Scalabrino51.java" in fileName:
        add_line = [[11, 16], [16, 24], [14, 8], [21, 8], [27, 8]]
        remove_line = [[14, 16], [21, 24]]

    elif "Scalabrino52.java" in fileName:
        add_line = [[3, 8], [8, 2], [4, 3], [9, 8]]
        remove_line = []

    elif "Scalabrino56.java" in fileName:
        add_line = [[9, 13], [24, 28], [11, 9], [26, 24]]
        remove_line = [[11, 13], [26, 28]]

    elif "Scalabrino57.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino58.java" in fileName:
        add_line = [[34, 37], [37, 4]]

    elif "Scalabrino59.java" in fileName:
        add_line = []
        remove_line = []

    # ==================Neutral后30-70==================

    elif "Scalabrino60.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino61.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino62.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino63.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino64.java" in fileName:
        add_line = [[8, 13]]

    elif "Scalabrino66.java" in fileName:
        add_line = [[33, 17], [24, 17], [21, 27]]
        remove_line = [[24, 27]]

    elif "Scalabrino70.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino71.java" in fileName:
        add_line = [[6, 9], [7, 6], [25, 31], [31, 35]]
        remove_line = [[28, 31]]

    elif "Scalabrino72.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino75.java" in fileName:
        add_line = [[18, 27]]

    elif "Scalabrino78.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino80.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino82.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino83.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino85.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino86.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino87.java" in fileName:
        add_line = [[7, 19], [10, 7], [16, 10], [11, 15]]
        remove_line = [[13, 15]]

    elif "Scalabrino88.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino90.java" in fileName:
        add_line = [[6, 36], [7, 6], [32, 6]]
        remove_line = [[32, 36]]

    elif "Scalabrino93.java" in fileName:
        add_line = [[23, 28]]

    elif "Scalabrino94.java" in fileName:
        add_line = [[16, 21]]

    elif "Scalabrino95.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino99.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino100.java" in fileName:
        add_line = [[10, 14]]

    elif "Scalabrino101.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino102.java" in fileName:
        add_line = [[14, 17]]
        remove_line = [[15, 17]]

    elif "Scalabrino103.java" in fileName:
        add_line = [[7, 18]]

    elif "Scalabrino104.java" in fileName:
        add_line = [[9, 13]]

    elif "Scalabrino105.java" in fileName:
        add_line = [[3, 2]]

    elif "Scalabrino106.java" in fileName:
        add_line = [[9, 22], [23, 27], [33, 32], [16, 22], [25, 32]]
        remove_line = [[25, 27]]

    elif "Scalabrino107.java" in fileName:
        add_line = [[2, 7], [7, 12], [12, 18], [18, 23], [23, 26], [26, 29]]
        remove_line = [[5, 7], [10, 12], [16, 18], [21, 23], [24, 26], [27, 29]]

    elif "Scalabrino108.java" in fileName:
        add_line = [[2, 5], [5, 9], [9, 13], [13, 19], [19, 25], [25, 30], [30, 35]]
        remove_line = [[3, 5], [7, 9], [11, 13], [17, 19], [23, 25], [28, 30], [33, 35]]

    elif "Scalabrino110.java" in fileName:
        add_line = [[19, 13], [24, 33], [13, 23]]
        remove_line = [[19, 23]]

    elif "Scalabrino112.java" in fileName:
        add_line = [[7, 11], [13, 17]]
        remove_line = [[9, 11], [15, 17]]

    elif "Scalabrino115.java" in fileName:
        add_line = [[7, 10], [8, 6]]
        remove_line = [[8, 10]]

    elif "Scalabrino116.java" in fileName:
        add_line = [[7, 16], [11, 15]]
        remove_line = [[15, 16]]

    elif "Scalabrino117.java" in fileName:
        add_line = [[10, 15], [16, 21], [22, 27], [33, 37]]
        remove_line = [[13, 15], [19, 21], [25, 27]]

    elif "Scalabrino118.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino120.java" in fileName:
        add_line = [[3, 15], [6, 9], [10, 15], [12, 10]]
        remove_line = [[7, 9]]

    elif "Scalabrino121.java" in fileName:
        add_line = [[16, 28], [33, 37], [19, 23], [23, 16], [25, 16], [37, 30], [39, 30]]

    # ==================Neutral后30个==================

    elif "Scalabrino199.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino195.java" in fileName:
        add_line = [[6, 9], [9, 12], [12, 15], [15, 22], [22, 29]]
        remove_line = []

    elif "Scalabrino193.java" in fileName:
        add_line = [[2, 15], [3, 6]]
        remove_line = [[4, 6], [7, 15]]

    elif "Scalabrino190.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino189.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino188.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino186.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino185.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino183.java" in fileName:
        add_line = [[13, 24], [14, 20]]
        remove_line = [[21, 24]]

    elif "Scalabrino182.java" in fileName:
        add_line = [[9, 18]]
        remove_line = []

    elif "Scalabrino176.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino175.java" in fileName:
        add_line = [[30, 35]]
        remove_line = []

    elif "Scalabrino174.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino172.java" in fileName:
        add_line = [[4, 6], [10, 20], [27, 31], [33, 36]]
        remove_line = []

    elif "Scalabrino171.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino166.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino161.java" in fileName:
        add_line = [[13, 22], [15, 18], [18, 13], [19, 13]]
        remove_line = []

    elif "Scalabrino159.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino156.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino147.java" in fileName:
        add_line = [[5, 8], [8, 14], [14, 20]]
        remove_line = [[6, 8]]

    elif "Scalabrino145.java" in fileName:
        add_line = [[9, 14]]
        remove_line = []

    elif "Scalabrino143.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino138.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino136.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino134.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino131.java" in fileName:
        add_line = []
        remove_line = []


    elif "Scalabrino130.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino128.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino124.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino122.java" in fileName:
        add_line = [[7, 16], [9, 21], [11, 21], [13, 21], [16, 21]]
        remove_line = [[13, 16]]

    #     ===================Readable前40=============

    elif "Scalabrino1.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino4.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino5.java" in fileName:
        add_line = []
        remove_line = []


    elif "Scalabrino6.java" in fileName:
        add_line = [[7, 12], [12, 17]]
        remove_line = [[9, 12], [14, 17]]


    elif "Scalabrino11.java" in fileName:
        add_line = []
        remove_line = []


    elif "Scalabrino16.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino22.java" in fileName:
        add_line = [[6, 19], [8, 19], [10, 19], [12, 19]]
        remove_line = [[16, 19]]

    elif "Scalabrino25.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino32.java" in fileName:
        add_line = [[12, 15], [15, 18]]
        remove_line = [[13, 15], [16, 18]]


    elif "Scalabrino35.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino38.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino39.java" in fileName:
        add_line = [[10, 13], [13, 16], [16, 19]]
        remove_line = [[11, 13], [14, 16], [17, 19]]

    elif "Scalabrino40.java" in fileName:
        add_line = [[10, 13], [13, 16], [17, 20], [20, 23], [25, 39], [29, 26], [26, 25], [34, 26], [30, 26], [26, 25]]
        remove_line = [[11, 13], [14, 16], [18, 20], [21, 23], [31, 34], [35, 39]]

    elif "Scalabrino41.java" in fileName:
        add_line = [[17, 37], [35, 17], [21, 34], [25, 28], [38, 40], [23, 21], [28, 21], [29, 21]]
        remove_line = [[29, 34], [35, 37], [38, 40]]

    elif "Scalabrino42.java" in fileName:
        add_line = [[14, 17], [17, 21], [21, 24], [24, 27], [27, 30], [30, 33]]
        remove_line = [[15, 17], [18, 20], [22, 24], [25, 27], [28, 30], [31, 33]]

    elif "Scalabrino45.java" in fileName:
        add_line = [[5, 19]]
        remove_line = []

    elif "Scalabrino48.java" in fileName:
        add_line = [[6, 33], [7, 33], [12, 33], [15, 24], [17, 21], [14, 12], [21, 12], [26, 12], [27, 12]]
        remove_line = [[20, 21], [22, 24], [27, 32]]

    elif "Scalabrino53.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino54.java" in fileName:
        add_line = [[2, 6], [6, 16], [16, 19], [19, 22], [11, 15], [13, 11]]
        remove_line = [[4, 6], [13, 15], [15, 16], [18, 19], [21, 22]]

    elif "Scalabrino55.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino65.java" in fileName:
        add_line = [[3, 9]]
        remove_line = []

    elif "Scalabrino67.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino73.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino76.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino77.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino79.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino81.java" in fileName:
        add_line = [[5, 8]]
        remove_line = [[6, 8]]

    elif "Scalabrino91.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino92.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino113.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino114.java" in fileName:
        add_line = [[10, 13], [13, 17], [17, 20], [20, 23], [23, 26], [26, 29]]
        remove_line = [[11, 13], [14, 16], [18, 20], [21, 23], [24, 26], [27, 29]]

    elif "Scalabrino119.java" in fileName:
        add_line = [[6, 38]]
        remove_line = [[36, 38]]

    elif "Scalabrino123.java" in fileName:
        add_line = [[2, 15]]
        remove_line = [[12, 15]]

    elif "Scalabrino129.java" in fileName:
        add_line = [[11, 14], [12, 19]]
        remove_line = [[12, 14]]

    elif "Scalabrino133.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino139.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino141.java" in fileName:
        add_line = [[4, 7], [8, 11]]
        remove_line = []

    elif "Scalabrino144.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino150.java" in fileName:
        add_line = [[3, 6]]
        remove_line = [[4, 6]]

    elif "Scalabrino151.java" in fileName:
        add_line = [[5, 17], [9, 13], [20, 29], [24, 29]]
        remove_line = []

    #     ===============R后10==============
    elif "Scalabrino152.java" in fileName:
        add_line = [[4, 7], [37, 12]]
        remove_line = [[19, 21], [25, 27], [30, 32], [37, 40]]

    elif "Scalabrino153.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino160.java" in fileName:
        add_line = [[6, 9]]

    elif "Scalabrino164.java" in fileName:
        add_line = [[10, 18], [11, 14], [19, 24]]
        remove_line = [[12, 14], [15, 18], [22, 24]]

    elif "Scalabrino165.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino168.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino169.java" in fileName:
        add_line = [[3, 6], [6, 9], [9, 12], [13, 18], [18, 21]]
        remove_line = [[4, 6], [7, 9], [10, 12], [15, 18], [19, 21]]

    elif "Scalabrino184.java" in fileName:
        add_line = [[8, 13], [13, 17]]

    elif "Scalabrino187.java" in fileName:
        add_line = []
        remove_line = []

    elif "Scalabrino191.java" in fileName:
        add_line = []
        remove_line = []

    # ---------------- manual code snippets ------------------
    elif "sample1.java" in fileName:
        add_line = []
        remove_line = []

    elif "sample3.java" in fileName:
        add_line = []
        remove_line = [[6, 9]]

    elif "sample6.java" in fileName:
        add_line = [[7, 9], [11, 13], [13, 15], [15, 17]]
        remove_line = [[8, 9], [12, 13], [14, 15], [16, 17]]

    elif "sample7.java" in fileName:
        add_line = [[13, 15], [15, 17], [17, 19], [19, 25]]
        remove_line = [[14, 15], [16, 17], [18, 19], [22, 24], [24, 25], [27, 30]]

    elif "sample9.java" in fileName:
        add_line = []
        remove_line = [[10, 11], [12, 13], [14, 15], [16, 20]]

    elif "sample10.java" in fileName:
        add_line = []
        remove_line = [[8, 11]]

    elif "sample12.java" in fileName:
        add_line = []
        remove_line = [[10, 13], [14, 17]]

    elif "sample16.java" in fileName:
        add_line = [[11, 8], [15, 77], [26, 77], [37, 34], [39, 34], [45, 44], [56, 53], [58, 53], [66, 63], [73, 77]]
        remove_line = [[11, 13], [15, 17], [22, 24], [26, 28], [37, 38], [48, 49], [56, 57], [73, 75]]

    elif "Test3-process.java" in fileName:
        add_line = [[9, 3], [32, 37], [31, 34], [29, 39], [40, 43], [37, 26], [45, 26], [50, 53], [59, 87],
                    [71, 66], [68, 70], [69, 66], [66, 75], [81, 87]]
        remove_line = [[9, 15], [15, 18], [32, 34], [37, 39], [41, 43], [45, 50], [51, 53], [54, 58], [69, 70],
                       [71, 75], [81, 82], [83, 87]]

    elif "Test1.java" in fileName:
        add_line = []
        remove_line = []

    elif "Test9.java" in fileName:
        add_line = [[13, 10], [20, 10], [10, 26], [29, 33], [40, 42], [41, 37]]
        remove_line = [[10, 12], [20, 26], [26, 28], [31, 33], [33, 35], [41, 42]]

    elif "Test45.java" in fileName:
        add_line = [[6, 4], [8, 4], [21, 20], [24, 20], [28, 36]]
        remove_line = [[8, 12], [24, 26], [37, 40]]

    elif "Test166.java" in fileName:
        add_line = [[6, 11], [7, 15], [16, 19], [33, 28], [33, 37]]
        remove_line = [[7, 11], [19, 21], [21, 23], [37, 40]]

    return remove_line, add_line

def get_one_sample(json_path, java_path):
    tokenizer = AutoTokenizer.from_pretrained("microsoft/codebert-base")
    model = AutoModel.from_pretrained("microsoft/codebert-base")
    with open(os.path.join("", json_path)) as f:
        json_file = json.load(f)
    graph = ConvertToGraph(json_file)
    graph = addEdges(graph, java_path, 2)
    newGraph = embedNode(graph, tokenizer, model)
    data_raw = {"graph_name": newGraph['file_name'].split("/")[-1], "graph_nodes_codes": newGraph['node'], "graph_nodes_type": newGraph['node_type'],"edge_types": newGraph['edge_type']}
    data_input = newGraph['graph_data']

    return data_raw, data_input


if __name__ == "__main__":
    N_PATHS_AST = "Dataset/Neutral"
    R_PATHS_AST = "Dataset/Readable"
    U_PATHS_AST = "Dataset/Unreadable"
    tokenizer = AutoTokenizer.from_pretrained("microsoft/codebert-base")
    model = AutoModel.from_pretrained("microsoft/codebert-base")
    graph_list, target_list, code_filename_list = json_parse_to_graph(N_PATHS_AST, R_PATHS_AST, U_PATHS_AST)

    graph_input = []
    target_input = []
    graph_raw_code_nodes = []

    for i in range(len(graph_list)):
        # if "Scalabrino152.java" in code_filename_list[i]:
        newGraph = addEdges(graph_list[i], code_filename_list[i], target_list[i])
        newGraph = embedNode(newGraph, tokenizer, model)
        graph_raw_code_nodes.append(
            {"graph_name": newGraph['file_name'].split("/")[-1], "graph_nodes_codes": newGraph['node'],
                 "graph_nodes_type": newGraph['node_type'],
                 "edge_types": newGraph['edge_type']})

        graph_input.append(newGraph['graph_data'])
        print(newGraph['graph_data'])
        target_input.append(newGraph['target'])

    pkl_data = {"file": graph_raw_code_nodes, "input": graph_input, "target": target_input}
    cpg_dataset = pd.DataFrame(pkl_data)

    write_pkl(cpg_dataset[["file", "input", "target"]], "", f"input.pkl")
    print("Build pkl Successfully")

    #################################################################
    # with open(os.path.join("", "/Users/grey/Documents/readability/Explaining/Dataset/Unreadable/Scalabrino15.json")) as f:
    #     json_file = json.load(f)
    # graph = ConvertToGraph(json_file)
    # graph = addEdges(graph, "/Users/grey/Documents/readability/Explaining/Dataset/Unreadable/Scalabrino15.java", 2)
    # graph = embedNode(graph, tokenizer, model)
    #
    # graph_raw_code_nodes.append(
    #         {"graph_name": graph['file_name'].split("/")[-1], "graph_nodes_codes": graph['node'],
    #              "graph_nodes_type": graph['node_type'],
    #              "edge_types": graph['edge_type']})
    # graph_input.append(graph['graph_data'])
    # pkl_data = {"file": graph_raw_code_nodes, "input": graph_input, "target": target_input}
    # cpg_dataset = pd.DataFrame(pkl_data)





