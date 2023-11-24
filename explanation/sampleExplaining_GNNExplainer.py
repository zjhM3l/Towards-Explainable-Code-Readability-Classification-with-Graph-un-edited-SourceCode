import os
import os.path as osp

import torch
from torch_geometric.data import download_url, extract_zip
from torch_geometric.loader import DataLoader

from dig.xgraph.dataset import SynGraphDataset
from dig.xgraph.models import *
from dig.xgraph.utils.compatibility import compatible_state_dict
from dig.xgraph.utils.init import fix_random_seed

from dig.xgraph.method import GNNExplainer
from dig.xgraph.evaluation import XCollector

def index_to_mask(index, size):
    mask = torch.zeros(size, dtype=torch.bool, device=index.device)
    mask[index] = 1
    return mask


def split_dataset(dataset):
    indices = []
    num_classes = 4
    train_percent = 0.7
    for i in range(num_classes):
        index = (dataset.data.y == i).nonzero().view(-1)
        index = index[torch.randperm(index.size(0))]
        indices.append(index)

    train_index = torch.cat([i[:int(len(i) * train_percent)] for i in indices], dim=0)

    rest_index = torch.cat([i[int(len(i) * train_percent):] for i in indices], dim=0)
    rest_index = rest_index[torch.randperm(rest_index.size(0))]

    dataset.data.train_mask = index_to_mask(train_index, size=dataset.data.num_nodes)
    dataset.data.val_mask = index_to_mask(rest_index[:len(rest_index) // 2], size=dataset.data.num_nodes)
    dataset.data.test_mask = index_to_mask(rest_index[len(rest_index) // 2:], size=dataset.data.num_nodes)

    dataset.data, dataset.slices = dataset.collate([dataset.data])

    return dataset


def check_checkpoints(root='./'):
    if osp.exists(osp.join(root, 'checkpoints')):
        return
    url = ('https://github.com/divelab/DIG_storage/raw/main/xgraph/checkpoints.zip')
    path = download_url(url, root)
    extract_zip(path, root)
    os.unlink(path)

if __name__ == '__main__':
    device = torch.device('cuda:0' if torch.cuda.is_available() else 'cpu')
    fix_random_seed(123)
    dataset = SynGraphDataset('./datasets', 'BA_shapes')
    dataset.data.x = dataset.data.x.to(torch.float32)
    dataset.data.x = dataset.data.x[:, :1]
    dim_node = dataset.num_node_features
    dim_edge = dataset.num_edge_features
    num_classes = dataset.num_classes

    splitted_dataset = split_dataset(dataset)
    splitted_dataset.data.mask = splitted_dataset.data.test_mask
    dataloader = DataLoader(splitted_dataset, batch_size=1, shuffle=False)

    model = GIN_2l(model_level='node', dim_node=dim_node, dim_hidden=300, num_classes=num_classes)
    model.to(device)
    check_checkpoints()
    ckpt_path = osp.join('checkpoints', 'ba_shapes', 'GIN_2l', '0', 'GIN_2l_best.ckpt')
    state_dict = compatible_state_dict(torch.load(ckpt_path, map_location='cpu')['state_dict'])
    model.load_state_dict(state_dict)

    explainer = GNNExplainer(model, epochs=100, lr=0.01, explain_graph=False)
    # --- Set the Sparsity to 0.5 ---
    sparsity = 0.5

    x_collector = XCollector(sparsity)
    # x_processor = ExplanationProcessor(model=model, device=device)
    index = -1
    for i, data in enumerate(dataloader):
        for j, node_idx in enumerate(torch.where(data.test_mask == True)[0]):
            index += 1
            print(f'explain graph {i} node {node_idx}')
            data.to(device)

            if torch.isnan(data.y[0].squeeze()):
                continue

            edge_masks, hard_edge_masks, related_preds = explainer(data.x, data.edge_index, sparsity=sparsity,
                                                                   num_classes=num_classes, node_idx=node_idx)

            x_collector.collect_data(hard_edge_masks, related_preds, data.y[0].squeeze().long().item())
            # if you only have the edge masks without related_pred, please feed sparsity controlled mask to
            # obtain the result: x_processor(data, masks, x_collector)
            if index >= 99:
                break

    print(f'Fidelity: {x_collector.fidelity:.4f}\n'
          f'Fidelity_inv: {x_collector.fidelity_inv:.4f}\n'
          f'Sparsity: {x_collector.sparsity:.4f}')