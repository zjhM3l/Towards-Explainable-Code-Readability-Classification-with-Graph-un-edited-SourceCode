import os.path
import json

import torch
from torch_geometric.data import Data
from transformers import AutoTokenizer, AutoModel

import re
import numpy as np
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
                "*=") == -1 and str.find("* 100 )") == -1:
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

    hot_dict = {'ArrayCreationLevel': 0, 'CompilationUnit': 1, 'Modifier': 2, 'ClassOrInterfaceDeclaration': 3,
                'ConstructorDeclaration': 4, 'MethodDeclaration': 5, 'Parameter': 6,
                'VariableDeclarator': 7, 'BlockComment': 8, 'JavadocComment': 9,
                'LineComment': 10, 'ArrayAccessExpr': 11, 'ArrayCreationExpr': 12,
                'ArrayInitializerExpr': 13, 'AssignExpr': 14, 'BinaryExpr': 15,
                'BooleanLiteralExpr': 16, 'CastExpr': 17, 'CharLiteralExpr': 18, 'ClassExpr': 19,
                'ConditionalExpr': 20, 'DoubleLiteralExpr': 21, 'EnclosedExpr': 22,
                'FieldAccessExpr': 23, 'InstanceOfExpr': 24, 'IntegerLiteralExpr': 25,
                'LongLiteralExpr': 26, 'MarkerAnnotationExpr': 27, 'MemberValuePair': 28,
                'MethodCallExpr': 29, 'Name': 30, 'NameExpr': 31, 'NormalAnnotationExpr': 32,
                'NullLiteralExpr': 33, 'ObjectCreationExpr': 34, 'SimpleName': 35,
                'SingleMemberAnnotationExpr': 36, 'StringLiteralExpr': 37, 'SuperExpr': 38,
                'ThisExpr': 39, 'UnaryExpr': 40, 'VariableDeclarationExpr': 41,
                'AssertStmt': 42,
                'BlockStmt': 43, 'BreakStmt': 44, 'CatchClause': 45, 'ContinueStmt': 46,
                'DoStmt': 47, 'EmptyStmt': 48, 'ExplicitConstructorInvocationStmt': 49,
                'ExpressionStmt': 50, 'ForEachStmt': 51, 'ForStmt': 52, 'IfStmt': 53,
                'LabeledStmt': 54, 'LocalClassDeclarationStmt': 55, 'ReturnStmt': 56,
                'SwitchEntry': 57,
                'SwitchStmt': 58, 'ThrowStmt': 59, 'TryStmt': 60,
                'WhileStmt': 61,
                'ArrayType': 62,
                'ClassOrInterfaceType': 63, 'PrimitiveType': 64, 'TypeParameter': 65,
                'VoidType': 66,
                'WildcardType': 67, 'ElseStmt': 68, 'ElseIfStmt': 69, 'FinallyStmt': 70, 'CatchStmt': 71}

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
            'SwitchEntry', 'SwitchStmt', 'ThrowStmt', 'WhileStmt', 'MethodDeclaration']
    EXPR = ['AssignExpr', 'MethodCallExpr', 'BinaryExpr', 'UnaryExpr', 'VariableDeclarationExpr', 'Parameter']
    COMMENT = ['JavadocComment', 'LineComment', 'BlockComment']
    TYPES = STMT + EXPR + COMMENT

    graph_raw = json_content["types"][0]["members"][0]

    Vertice_type = []
    Vertice_info = []
    Edge_list = [[], []]
    Edge_type = []

    def loopKeys(graph, key, index):
        # 情况1： 节点是个list，这里就需要多重处理，因为相当于多个情况2
        if isinstance(graph[key], list):
            # graph[key]是个list，里面有好多个item
            for item in graph[key]:
                createGraph(item, key, index)

        # 情况2： 节点是个dict
        elif isinstance(graph[key], dict):
            createGraph(graph[key], key, index)

    def createGraph(graph, name, index):

        # 只有是节点！，才会递归
        if "!" in graph.keys():
            noneName = graph["!"].split(".")[-1]

            if noneName in TYPES:
                Vertice_type.append(noneName)
                Vertice_info.append(graph["range"])
                node_id = len(Vertice_type) - 1
                if index != -1:
                    Edge_list[0].append(index)
                    Edge_list[1].append(node_id)
                    Edge_type.append("AST")

                for k in graph.keys():
                    loopKeys(graph, k, node_id)


            elif "TryStmt" in noneName:
                Vertice_type.append(noneName)
                try_range = graph["tryBlock"]["range"]
                try_range["beginColumn"] = try_range["beginColumn"] - 9
                Vertice_info.append(try_range)

                node_id = len(Vertice_type) - 1
                if index != -1:
                    Edge_list[0].append(index)
                    Edge_list[1].append(node_id)
                    Edge_type.append("AST")

                # 手动进入一层。。
                for key in graph.keys():
                    # 如果这个key是"catchClause"，然后又不为空
                    if "catchClause" in key:
                        for catch in graph["catchClauses"]:
                            subgraph = catch
                            Vertice_type.append("CatchStmt")
                            catch_range = subgraph["range"]
                            catch_range["beginColumn"] = catch_range["beginColumn"]
                            Vertice_info.append(catch_range)

                            sub_node_id = len(Vertice_type) - 1
                            if index != -1:
                                Edge_list[0].append(node_id)
                                Edge_list[1].append(sub_node_id)
                                Edge_type.append("AST")

                            for k in subgraph.keys():
                                loopKeys(subgraph, k, sub_node_id)

                    elif key == "finallyBlock":
                        subgraph = graph["finallyBlock"]
                        Vertice_type.append("FinallyStmt")

                        fin_range = subgraph["range"]
                        fin_range["beginColumn"] = fin_range["beginColumn"] - 25
                        Vertice_info.append(fin_range)

                        sub_node_id = len(Vertice_type) - 1
                        if index != -1:
                            Edge_list[0].append(node_id)
                            Edge_list[1].append(sub_node_id)
                            Edge_type.append("AST")

                        for k in subgraph.keys():
                            loopKeys(subgraph, k, sub_node_id)

                    elif key == "":
                        subgraph = graph[""]
                        Vertice_type.append("FinallyStmt")

                        fin_range = subgraph["range"]
                        fin_range["beginColumn"] = fin_range["beginColumn"] - 25
                        Vertice_info.append(fin_range)

                        sub_node_id = len(Vertice_type) - 1
                        if index != -1:
                            Edge_list[0].append(node_id)
                            Edge_list[1].append(sub_node_id)
                            Edge_type.append("AST")

                        for k in subgraph.keys():
                            loopKeys(subgraph, k, sub_node_id)

                    else:
                        loopKeys(graph, key, node_id)

            elif "IfStmt" in noneName:

                # 如果是if stmt，记住，这个最上面的if的范围是它的thenStmt

                if name == "elseStmt":
                    noneName = "ElseIfStmt"

                then_range = graph["thenStmt"]["range"]
                condition = graph["condition"]["range"]
                if_range = {"beginLine": condition["beginLine"], "beginColumn": condition["beginColumn"] - 8,
                            "endLine": then_range["endLine"], "endColumn": then_range["endColumn"]}
                Vertice_type.append(noneName)
                Vertice_info.append(if_range)

                node_id = len(Vertice_type) - 1
                if index != -1:
                    Edge_list[0].append(index)
                    Edge_list[1].append(node_id)
                    Edge_type.append("AST")

                for k in graph.keys():
                    loopKeys(graph, k, node_id)

            elif "BlockStmt" in noneName and name == "elseStmt":
                else_range = graph["range"]
                else_range["beginColumn"] = else_range["beginColumn"] - 9
                Vertice_info.append(else_range)
                Vertice_type.append("ElseStmt")

                node_id = len(Vertice_type) - 1
                if index != -1:
                    Edge_list[0].append(index)
                    Edge_list[1].append(node_id)
                    Edge_type.append("AST")

                for k in graph.keys():
                    loopKeys(graph, k, node_id)


            else:
                Vertice_type.append(noneName)
                Vertice_info.append(graph["range"])
                node_id = len(Vertice_type) - 1
                if index != -1:
                    Edge_list[0].append(index)
                    Edge_list[1].append(node_id)
                    Edge_type.append("AST")

                for k in graph.keys():
                    loopKeys(graph, k, node_id)

    createGraph(graph_raw, "graph", -1)

    return {"node_type": Vertice_type, "node_range": Vertice_info, "edge_list": Edge_list, "edge_type": Edge_type}


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


def graph_to_input(graph, fileName, target, tokenizer, model):
    """
       Convert Graph to Vector Data for train and test, adding extra Extra in this process
       这里的操作对象是一个图

    """
    node_type = graph["node_type"]  # node type
    node_range = graph["node_range"]  # node range

    edge_list = graph["edge_list"]
    edge_types = graph["edge_type"]

    # 保存着这个图的所有节点，上面是所有节点信息的embedding，下面是type的one hot
    node_embedding_list = []
    node_one_hot_list = []

    print("==================", fileName, "=============")

    # 在标数据流的时候有两种节点，一种是申明，一种是使用，申明都在前面
    node_declaration_list = []
    node_assign_list = []
    # 用来加控制流
    node_stmt_list = []
    # 包含comment所有
    all_node_list = []

    raw_code_list = []

    for i in range(len(node_range)):

        # 通过node range获得node在真实代码中是哪几行，并获得raw—code 以及 raw-code 通过bert后的结果
        code_range = node_range[i]
        nl_list, code_list = handleJavaCode(fileName, code_range)
        raw_code = nl_list + code_list
        raw_code_list.append(raw_code)  # 原代码
        node_embedding = codeEmbedding(nl_list, code_list, tokenizer, model)  # 通过bert后
        node_embedding_list.append(node_embedding)

        node_type_one_hot = one_hot_node_type(node_type[i])
        node_one_hot_list.append(node_type_one_hot)

        if 'AssignExpr' in node_type[i] \
                or 'MethodCallExpr' in node_type[i] \
                or 'BinaryExpr' in node_type[i] \
                or 'UnaryExpr' in node_type[i]:

            node_assign_list.append(
                [i, node_type[i], [code_range["beginLine"] - 1, code_range["endLine"] - 1],
                 re.split(' |\.|\)|\(|\[|\]|\=', "".join(code_list)), code_list])

            all_node_list.append(
                [i, node_type[i].split(".")[-1], [code_range["beginLine"] - 1, code_range["endLine"] - 1], code_list])

        elif 'VariableDeclarationExpr' in node_type[i] \
                or node_type[i] == 'Parameter':
            node_declaration_list.append(
                [i, node_type[i], [code_range["beginLine"] - 1, code_range["endLine"] - 1],
                 re.split(' |\.|\)|\(|\[|\]|\=', "".join(code_list)), code_list])

            all_node_list.append(
                [i, node_type[i], [code_range["beginLine"] - 1, code_range["endLine"] - 1], code_list])
        else:
            node_stmt_list.append(
                [i, node_type[i], [code_range["beginLine"] - 1, code_range["endLine"] - 1], code_list])
            all_node_list.append(
                [i, node_type[i], [code_range["beginLine"] - 1, code_range["endLine"] - 1], code_list])

    node_declaration_list.sort(key=lambda x: (x[2][0], x[2][1]))
    node_assign_list.sort(key=lambda x: (x[2][0], x[2][1]))
    node_stmt_list.sort(key=lambda x: (x[2][0], x[2][1]))
    all_node_list.sort(key=lambda x: (x[2][0], x[2][1]))

    # edge_types = []
    # edge_list = [[],[]]
    # # ADD LOGIC FLOWS
    # if len(all_node_list) > 1:
    #     for i in range(len(all_node_list) - 1):
    #         edge_list[0].append(all_node_list[i][0])
    #         edge_list[1].append(all_node_list[i + 1][0])
    #         edge_types.append("LOGIC")

    data_edge_list = DataEdgeHandle(node_declaration_list, node_assign_list)
    for data_edge in data_edge_list:
        edge_list[0].append(data_edge[0])
        edge_list[1].append(data_edge[1])
        edge_types.append("DATA")

    control_edge_list = [[], []]
    # ADD CONTROL FLOWS
    if len(node_stmt_list) > 1:
        for i in range(len(node_stmt_list) - 1):
            control_edge_list[0].append(node_stmt_list[i][0])
            control_edge_list[1].append(node_stmt_list[i + 1][0])

    remove_edge, add_edge = AddControlByHand(fileName, node_stmt_list)

    for edge in remove_edge:
        control_edge_list[0].remove(edge[0])
        control_edge_list[1].remove(edge[1])

    for edge in add_edge:
        control_edge_list[0].append(edge[0])
        control_edge_list[1].append(edge[1])

    for i in range(len(control_edge_list[0])):
        edge_list[0].append(control_edge_list[0][i])
        edge_list[1].append(control_edge_list[1][i])
        edge_types.append("CONTROL")

    # print(node_type)
    # print()
    # print(raw_code_list)
    # print()
    # print(edge_list)
    # print()
    # print(edge_types)

    return node_type, raw_code_list, node_embedding_list, edge_list, edge_types, target, node_one_hot_list


def DataEdgeHandle(declaration_list, assign_list):
    """
       Handle Extra Data Edge, three ways tested in Ablation Study
    """

    data_flow_edge_list = []

    # TYPE 1
    for decl in declaration_list:
        data_flow = []
        flag = False
        for assign in assign_list:
            if decl[3][1] in assign[3]:
                flag = True
                data_flow.append(assign[0])
        if flag:
            data_flow.insert(0, decl[0])
            for j in range(len(data_flow) - 1):
                data_flow_edge_list.append([data_flow[j], data_flow[j + 1]])

    # # TYPE 2
    # for decl in declaration_list:
    #     data_flow = []
    #     flag = False
    #     for assign in assign_list:
    #         if decl[2][1] in assign[2]:
    #             flag = True
    #             data_flow.append(assign[0])
    #     if flag:
    #         data_flow.insert(0, decl[0])
    #         for j in range(len(data_flow) - 1):
    #             data_flow_edge_list.append([data_flow[0], data_flow[j + 1]])
    #
    # # TYPE 3
    # for decl in declaration_list:
    #     data_flow = []
    #     flag = False
    #     for assign in assign_list:
    #         if decl[2][1] in assign[2]:
    #             flag = True
    #             data_flow.append(assign[0])
    #     if flag:
    #         data_flow.insert(0, decl[0])
    #         for j in range(len(data_flow) - 1):
    #             data_flow_edge_list.append([data_flow[j], data_flow[j + 1]])
    #             if [data_flow[0], data_flow[j + 1]] not in data_flow_edge_list:
    #                 data_flow_edge_list.append([data_flow[0], data_flow[j + 1]])

    return data_flow_edge_list


def findIndex(stmt_node_list, line):
    for node in stmt_node_list:
        if node[2][0] == line:
            return node[0]


def AddControlByHand(fileName, stmt_node_list):
    remove_edge = []
    add_edge = []
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
        remove_line = [[5, 13], [17, 20]]

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
        remove_line = [[16, 20], [33, 38]]

    elif "Scalabrino46.java" in fileName:
        add_line = [[15, 23], [23, 26], [27, 12], [24, 12], [18, 15], [20, 15]]

    elif "Scalabrino47.java" in fileName:
        add_line = [[7, 15]]

    elif "Scalabrino51.java" in fileName:
        add_line = [[11, 16], [16, 24], [14, 8], [21, 8], [27, 8]]
        remove_line = [[14, 16], [21, 24]]

    elif "Scalabrino52.java" in fileName:
        add_line = [[3, 8], [8, 2], [4, 3], [9, 8]]
        remove_line = [[4, 8]]

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
        remove_line = [[6, 8], [8, 10], [10, 12], [12, 14], [14, 16], [16, 19]]

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
        remove_line = [[13, 17]]

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

    for line in add_line:
        add_edge.append([findIndex(stmt_node_list, line[0]), findIndex(stmt_node_list, line[1])])

    for line in remove_line:
        remove_edge.append([findIndex(stmt_node_list, line[0]), findIndex(stmt_node_list, line[1])])

    return remove_edge, add_edge


if __name__ == "__main__":
    N_PATHS_AST = "Data/Neutral"
    R_PATHS_AST = "Data/Readable"
    U_PATHS_AST = "Data/Unreadable"
    tokenizer = AutoTokenizer.from_pretrained("microsoft/codebert-base")
    model = AutoModel.from_pretrained("microsoft/codebert-base")
    graph_list, target_list, code_filename_list = json_parse_to_graph(N_PATHS_AST, R_PATHS_AST, U_PATHS_AST)

    graph_input = []
    file_input = []
    target_input = []
    graph_raw_code_nodes = []

    for i in range(len(graph_list)):

        # if "Scalabrino84.java" in code_filename_list[i]:
        node_type, raw_code_list, node_embedding_list, edge_list, edge_types, target, node_one_hot_list = graph_to_input(
            graph_list[i], code_filename_list[i], target_list[i], tokenizer, model)
        nodes_info = []

        # graph_raw_code_nodes.append({"graph_name": code_filename_list[i].split("/")[-1], "graph_nodes_codes": raw_code_list, "graph_nodes_type": node_type})
        graph_raw_code_nodes.append(code_filename_list[i].split("\\")[-1])

        for j in range(len(node_embedding_list)):
            node_embedding = np.array(node_embedding_list[j])
            node_embedding = np.mean(node_embedding_list[j], axis=0)
            node_info = np.concatenate((node_embedding.tolist(), node_one_hot_list[j]), axis=0)
            nodes_info.append(node_info)

        x = torch.tensor(nodes_info)
        x = x.to(torch.float32)
        x_zero = torch.zeros(1000, 840).float()
        x_zero[:x.size(0), :] = x

        y = torch.tensor([target]).float()
        edge_index = torch.tensor(edge_list)
        graph_data = Data(x=x, edge_index=edge_index, y=target)
        target_input.append(target)
        # node_type #edge_type
        graph_input.append(graph_data)

    pkl_data = {"file": graph_raw_code_nodes, "input": graph_input, "target": target_input}
    cpg_dataset = pd.DataFrame(pkl_data)

    # please change the name ("input_XXXXXX.pkl") if necessary
    # the "matrix" is not necessary here, it's for future studying
    write_pkl(cpg_dataset[["input", "target"]], "", f"input.pkl")
    print("Build pkl Successfully")

