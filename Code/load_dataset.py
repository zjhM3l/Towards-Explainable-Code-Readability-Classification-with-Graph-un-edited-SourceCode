from torch.utils.data import Dataset as TorchDataset
from torch_geometric.loader import DataLoader
import torch
from torch.utils.data import random_split, Subset, ConcatDataset
import pandas as pd
from sklearn.model_selection import StratifiedKFold
import numpy as np
import math


class InputDataset(TorchDataset):
    def __init__(self, dataset):
        self.dataset = dataset

    def __len__(self):
        return len(self.dataset)

    def __getitem__(self, index):
        return self.dataset.iloc[index].input


class RawDataset(TorchDataset):
    def __init__(self, dataset):
        self.dataset = dataset

    def __len__(self):
        return len(self.dataset)

    def __getitem__(self, index):
        return self.dataset.iloc[index].file

class CodeDataset(TorchDataset):
    def __init__(self, dataset):
        self.dataset = dataset

    def __len__(self):
        return len(self.dataset)

    def __getitem__(self, index):
        return self.dataset[index]


def balance_dataset(dataset):
    unread = []
    read = []
    neutral = []

    for data in dataset:
        if data.y == 0:
            read.append(data)
        if data.y == 1:
            neutral.append(data)
        if data.y == 2:
            unread.append(data)

    return CodeDataset(read), CodeDataset(neutral), CodeDataset(unread)


def get_cross_dataloader(data_args):
    dataset = pd.read_pickle(data_args.dataset_dir)

    skf_1 = StratifiedKFold(n_splits=data_args.k_fold)
    skf_2 = StratifiedKFold(n_splits=data_args.k_fold - 1)

    dataloader_list = []
    distance = 999999

    dataloaderfull_list = []

    for k_fold_1, (train_val_idx, test_idx) in enumerate(skf_1.split(dataset.input, dataset.target)):

        train_val_dataset = dataset.iloc[train_val_idx]
        test_dataset = dataset.iloc[test_idx]
        test_d = np.average(test_idx)

        for k_fold_2, (train_idx, val_idx) in enumerate(skf_2.split(train_val_dataset.input, train_val_dataset.target)):

            val_d = np.average(val_idx)
            distance_1 = math.fabs(test_d - val_d)

            if distance_1 < distance:
                distance = distance_1
                train_dataset = train_val_dataset.iloc[train_idx]
                val_dataset = train_val_dataset.iloc[val_idx]

            break

        dataloader = dict()
        dataloader['train'] = DataLoader(InputDataset(train_dataset), batch_size=data_args.batch_size, shuffle=True)
        dataloader['valid'] = DataLoader(InputDataset(val_dataset), batch_size=data_args.batch_size, shuffle=False)
        dataloader['test'] = DataLoader(InputDataset(test_dataset), batch_size=data_args.batch_size, shuffle=False)

        dataloader_list.append(dataloader)

        dataloader_full = dict()
        dataloader_full['train'] = DataLoader(RawDataset(train_dataset), batch_size=data_args.batch_size, shuffle=True)
        dataloader_full['valid'] = DataLoader(RawDataset(val_dataset), batch_size=data_args.batch_size, shuffle=False)
        dataloader_full['test'] = DataLoader(RawDataset(test_dataset), batch_size=data_args.batch_size, shuffle=False)

        dataloaderfull_list.append(dataloader_full)

    return dataloader_list, dataloaderfull_list


def get_dataloader(data_args):
    """
    Args:
        dataset:
        batch_size: int
        data_split_ratio: list, training, validation and testing ratio
        seed: random seed to split the dataset randomly

    Returns:
        a dictionary of training, validation, and testing dataLoader
    """

    dataset = pd.read_pickle(data_args.dataset_dir)
    dataset = InputDataset(dataset)
    read, neutral, unread = balance_dataset(dataset)

    data_split_ratio = data_args.data_split_ratio
    seed = data_args.seed
    batch_size = data_args.batch_size

    train_r, valid_r, test_r = random_split(read, lengths=[int(data_split_ratio[0] * len(read)),
                                                           int(data_split_ratio[1] * len(read)),
                                                           len(read) - int(data_split_ratio[0] * len(read)) - int(
                                                               data_split_ratio[1] * len(read))],
                                            generator=torch.Generator().manual_seed(seed))

    train_n, valid_n, test_n = random_split(neutral, lengths=[int(data_split_ratio[0] * len(neutral)),
                                                              int(data_split_ratio[1] * len(neutral)),
                                                              len(neutral) - int(
                                                                  data_split_ratio[0] * len(neutral)) - int(
                                                                  data_split_ratio[1] * len(neutral))],
                                            generator=torch.Generator().manual_seed(seed))

    train_u, valid_u, test_u = random_split(unread, lengths=[int(data_split_ratio[0] * len(unread)),
                                                             int(data_split_ratio[1] * len(unread)),
                                                             len(unread) - int(data_split_ratio[0] * len(unread)) - int(
                                                                 data_split_ratio[1] * len(unread))],
                                            generator=torch.Generator().manual_seed(seed))

    train = ConcatDataset([train_r, train_n, train_u])
    valid = ConcatDataset([valid_r, valid_n, valid_u])
    test = ConcatDataset([test_r, test_n, test_u])

    dataloader = dict()
    dataloader['train'] = DataLoader(train, batch_size=batch_size, shuffle=True)
    dataloader['valid'] = DataLoader(valid, batch_size=batch_size, shuffle=True)
    dataloader['test'] = DataLoader(test, batch_size=batch_size, shuffle=True)
    return dataloader
