import os
import torch
from tap import Tap
from typing import List


class DataParser(Tap):
    dataset_dir: str = '../explanation/input.pkl'
    dataset_name = 'code_readability_new'
    num_node_features: int = 794
    num_classes: int = 3
    avg_num_nodes: int = 150
    data_split_ratio: List = [0.6, 0.2, 0.2]  # the ratio of training, validation and testing set for random split
    batch_size: int = 15
    seed: int = 1
    k_fold: int = 5


class RewardParser(Tap):
    reward_method: str = 'mc_l_shapley'  # Liberal, gnn_score, mc_shapley, l_shapley， mc_l_shapley
    local_raduis: int = 4  # (n-1) hops neighbors for l_shapley
    subgraph_building_method: str = 'zero_filling'
    sample_num: int = 100  # sample time for monte carlo approximation


class TrainParser(Tap):
    learning_rate: float = 0.0001
    weight_decay: float = 0.0
    max_epochs: int = 100
    save_epoch: int = 10
    early_stopping: int = 100


class ModelParser(Tap):
    device: str = "cpu"
    checkpoint: str = 'checkpoint'
    hidden_channels: int = 128
    mlp_hidden: int = 64
    model_name = 'dmon'


class MCTSParser(DataParser, ModelParser):
    rollout: int = 20  # the rollout number
    high2low: bool = False  # expand children with different node degree ranking method
    c_puct: float = 5  # the exploration hyper-parameter
    min_atoms: int = 3  # for the synthetic dataset, change the minimal atoms to 5.
    expand_atoms: int = 12  # # of atoms to expand children

    def process_args(self) -> None:
        self.explain_model_path = os.path.join(self.checkpoint,
                                               self.dataset_name,
                                               f"{self.model_name}_best.pth")


data_args = DataParser().parse_args(known_only=True)
print("Dataset using:", data_args.dataset_dir)
train_args = TrainParser().parse_args(known_only=True)
model_args = ModelParser().parse_args(known_only=True)
mcts_args = MCTSParser().parse_args(known_only=True)
reward_args = RewardParser().parse_args(known_only=True)

import torch
import random
import numpy as np

random_seed = 1234
random.seed(random_seed)
np.random.seed(random_seed)
torch.manual_seed(random_seed)
torch.cuda.manual_seed_all(random_seed)