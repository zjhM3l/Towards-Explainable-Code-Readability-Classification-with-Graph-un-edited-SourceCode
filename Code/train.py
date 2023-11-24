from configures import data_args, train_args, model_args
from Code.load_dataset import get_dataloader, balance_dataset, InputDataset, get_cross_dataloader
from DMon import DMon
import numpy as np
import torch.nn as nn
from torch.optim import Adam
import os
import torch
import shutil
from sklearn.metrics import f1_score, roc_auc_score, matthews_corrcoef, accuracy_score
from sklearn.preprocessing import label_binarize
from time import process_time


def train():
    print('start loading data====================')
    dataloader = get_dataloader(data_args)

    print('start training model==================')
    gnnNets = DMon(data_args, model_args)
    gnnNets.to('cpu')

    criterion = nn.CrossEntropyLoss()
    optimizer = Adam(gnnNets.parameters(), lr=train_args.learning_rate, weight_decay=train_args.weight_decay)

    best_acc = 0.0

    # save path for model
    if not os.path.isdir('checkpoint'):
        os.mkdir('checkpoint')
    if not os.path.isdir(os.path.join('checkpoint', data_args.dataset_name)):
        os.mkdir(os.path.join('checkpoint', f"{data_args.dataset_name}"))
    ckpt_dir = f"./checkpoint/{data_args.dataset_name}/"

    early_stop_count = 0
    for epoch in range(train_args.max_epochs):
        acc = []
        loss_list = []
        gnnNets.train()

        for data in dataloader['train']:
            data = data.to(model_args.device)

            pre, _ = gnnNets(data)
            loss = criterion(pre, data.y)

            # optimization
            optimizer.zero_grad()
            loss.backward()
            torch.nn.utils.clip_grad_value_(gnnNets.parameters(), clip_value=2.0)
            optimizer.step()

            ## record
            _, prediction = torch.max(pre, -1)
            acc.append(prediction.eq(data.y).cpu().numpy())
            loss_list.append(loss.item())

        # report train msg
        epoch_acc = np.concatenate(acc, axis=0).mean()
        epoch_loss = np.average(loss_list)
        print(f"Train Epoch:{epoch}  |Loss: {epoch_loss:.3f} | Train Acc: {epoch_acc:.3f}")

        # report valid msg
        valid_state = evaluate(dataloader['valid'], gnnNets, criterion)
        print(f"Eval Epoch: {epoch} | Loss: {valid_state['loss']:.3f} | Eval Acc: {valid_state['acc']:.3f}")

        # report test msg
        test_state = evaluate(dataloader['test'], gnnNets, criterion)
        print(f"Test Epoch: {epoch} | Loss: {test_state['loss']:.3f} | Test Acc: {test_state['acc']:.3f}")

        # only save the best model
        is_best = (valid_state['acc'] > best_acc)

        if valid_state['acc'] > best_acc:
            early_stop_count = 0
        else:
            early_stop_count += 1

        if early_stop_count > train_args.early_stopping:
            break

        if is_best:
            best_acc = valid_state['acc']
            early_stop_count = 0
        if is_best or epoch % train_args.save_epoch == 0:
            save_best(ckpt_dir, epoch, gnnNets, model_args.model_name, valid_state['acc'], is_best, 666)

    print(f"The best validation accuracy is {best_acc}.")

    # report test msg
    checkpoint = torch.load(os.path.join(ckpt_dir, f'{model_args.model_name}_best_666.pth'))
    gnnNets.update_state_dict(checkpoint['net'])
    test_state = test(dataloader['test'], gnnNets, criterion)
    print(
        f"Test Acc: {test_state['acc']:.3f}   | Test F1: {test_state['f1']:.3f}   | Test AUC: {test_state['auc']:.3f}   | Test MCC: {test_state['mcc']:.3f}")


def test(valid_dataloader, gnnNets, criterion):
    acc = []

    prob_all = []
    label_all = []

    loss_list = []
    gnnNets.eval()

    with torch.no_grad():
        for data in valid_dataloader:
            data = data.to(model_args.device)
            pre, _ = gnnNets(data)
            loss = criterion(pre, data.y)

            ## record
            _, prediction = torch.max(pre, -1)
            prob_all.extend(prediction.cpu())
            label_all.extend(data.y.cpu())

            loss_list.append(loss.item())
            acc.append(prediction.eq(data.y).cpu().numpy())

        F1 = f1_score(list(label_all), list(prob_all), average='macro')
        # AUC
        labels = [0, 1, 2]
        label_all_for_auc = label_binarize(label_all, classes=labels)
        prob_all_for_auc = label_binarize(prob_all, classes=labels)
        AUC = roc_auc_score(label_all_for_auc, prob_all_for_auc, average='macro')
        # MCC
        MCC = matthews_corrcoef(list(label_all), list(prob_all))

        state = {'loss': np.average(loss_list),
                 'acc': np.concatenate(acc, axis=0).mean(),
                 'f1': F1,
                 'auc': AUC,
                 'mcc': MCC}

    return state


def evaluate(valid_dataloader, gnnNets, criterion):
    acc = []
    loss_list = []
    gnnNets.eval()

    with torch.no_grad():
        for data in valid_dataloader:
            data = data.to(model_args.device)
            pre, _ = gnnNets(data)
            loss = criterion(pre, data.y)

            ## record
            _, prediction = torch.max(pre, -1)
            loss_list.append(loss.item())
            acc.append(prediction.eq(data.y).cpu().numpy())

        valid_state = {'loss': np.average(loss_list),
                       'acc': np.concatenate(acc, axis=0).mean()}

    return valid_state


def save_best(ckpt_dir, epoch, gnnNets, model_name, valid_acc, is_best, k_fold):
    if is_best:
        print('saving best....')
    else:
        print('saving last....')

    gnnNets.to('cpu')
    state = {
        'net': gnnNets.state_dict(),
        'epoch': epoch,
        'acc': valid_acc
    }
    pth_name = f"{model_name}_latest_{str(k_fold)}.pth"
    best_pth_name = f'{model_name}_best_{str(k_fold)}.pth'
    ckpt_path = os.path.join(ckpt_dir, pth_name)
    torch.save(state, ckpt_path)
    if is_best:
        shutil.copy(ckpt_path, os.path.join(ckpt_dir, best_pth_name))
    gnnNets.to('cpu')


def cross_train():
    start_time = process_time()
    dataloader_list, dataloaderfull_list = get_cross_dataloader(data_args)
    k_fold_acc = []
    valid_acc = []
    k_fold_f1 = []
    k_fold_auc = []
    k_fold_mcc = []

    for i in range(len(dataloader_list)):

        dataloader = dataloader_list[i]

        print('start training model with fold ', i)
        gnnNets = DMon(data_args, model_args)
        gnnNets.to('cpu')

        criterion = nn.CrossEntropyLoss()
        optimizer = Adam(gnnNets.parameters(), lr=train_args.learning_rate, weight_decay=train_args.weight_decay)

        # save path for model
        if not os.path.isdir('checkpoint'):
            os.mkdir('checkpoint')
        if not os.path.isdir(os.path.join('checkpoint', data_args.dataset_name)):
            os.mkdir(os.path.join('checkpoint', f"{data_args.dataset_name}"))
        ckpt_dir = f"./checkpoint/{data_args.dataset_name}/"

        early_stop_count = 0
        best_acc = 0
        for epoch in range(train_args.max_epochs):
            acc = []
            loss_list = []
            gnnNets.train()

            for data in dataloader['train']:
                data = data.to(model_args.device)

                pre, _ = gnnNets(data)
                loss = criterion(pre, data.y)

                # optimization
                optimizer.zero_grad()
                loss.backward()
                torch.nn.utils.clip_grad_value_(gnnNets.parameters(), clip_value=2.0)
                optimizer.step()

                ## record
                _, prediction = torch.max(pre, -1)
                acc.append(prediction.eq(data.y).cpu().numpy())
                loss_list.append(loss.item())

            # report train msg
            epoch_acc = np.concatenate(acc, axis=0).mean()
            epoch_loss = np.average(loss_list)
            print(f"Train Epoch:{epoch}  |Loss: {epoch_loss:.3f} | Train Acc: {epoch_acc:.3f}")

            # report valid msg
            valid_state = evaluate(dataloader['valid'], gnnNets, criterion)
            print(f"Eval Epoch: {epoch} | Loss: {valid_state['loss']:.3f} | Eval Acc: {valid_state['acc']:.3f}")

            # report test msg
            test_state = evaluate(dataloader['test'], gnnNets, criterion)
            print(f"Test Epoch: {epoch} | Loss: {test_state['loss']:.3f} | Test Acc: {test_state['acc']:.3f}")

            # only save the best model
            is_best = (valid_state['acc'] > best_acc)

            if valid_state['acc'] > best_acc:
                early_stop_count = 0
            else:
                early_stop_count += 1

            if early_stop_count > train_args.early_stopping:
                break

            if is_best:
                best_acc = valid_state['acc']
                early_stop_count = 0
            if is_best or epoch % train_args.save_epoch == 0:
                save_best(ckpt_dir, epoch, gnnNets, model_args.model_name, valid_state['acc'], is_best, i)

        print(f"The best validation accuracy is {best_acc}.")
        valid_acc.append(best_acc)

        # report test msg
        checkpoint = torch.load(os.path.join(ckpt_dir, f'{model_args.model_name}_best_{str(i)}.pth'))
        gnnNets.update_state_dict(checkpoint['net'])

        test_state = test(dataloader['test'], gnnNets, criterion)
        print(
            f"Test Acc: {test_state['acc']:.3f}   | Test F1: {test_state['f1']:.3f}   | Test AUC: {test_state['auc']:.3f}   | Test MCC: {test_state['mcc']:.3f}")

        k_fold_acc.append(test_state['acc'])
        k_fold_f1.append(test_state['f1'])
        k_fold_auc.append(test_state['auc'])
        k_fold_mcc.append(test_state['mcc'])

    print("===========================================FINAL TEST=================")
    print(k_fold_acc)
    print(k_fold_f1)
    print(k_fold_auc)
    print(k_fold_mcc)

    print("TEST ACC: ", np.average(k_fold_acc), "F1: ", np.average(k_fold_f1), "AUC: ", np.average(k_fold_auc), "MCC: ",
          np.average(k_fold_mcc))

    print("===========================================FINAL VALID=================")
    print("VALID ACC:", np.average(valid_acc))

    end_time = process_time()
    print('{}s spent.'.format(end_time - start_time))

    return np.average(valid_acc), np.average(k_fold_acc), end_time - start_time


if __name__ == "__main__":
    # valid_list = []
    # test_list = []
    # time_list = []
    #
    # valid_j = 0
    # test_j = 0
    # time_j = 0
    # for i in range(10):
    #     v, t, time = cross_train()
    #     valid_j = valid_j + v
    #     test_j = test_j + t
    #     time_j = time_j + time
    #
    # valid_list.append(valid_j / 10)
    # test_list.append(test_j / 10)
    # time_list.append(time_j / 10)
    #
    # print(valid_list)
    # print(test_list)
    # print(time_list)

    v, t, time = cross_train()