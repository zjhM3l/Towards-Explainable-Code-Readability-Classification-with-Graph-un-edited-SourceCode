import torch
from torch import Tensor
from torch_geometric.graphgym.models import gnn
from torch_geometric.nn import GCNConv, DenseGraphConv, DMoNPooling
from math import ceil

from torch_geometric.nn.conv.gcn_conv import gcn_norm
from torch_geometric.utils import to_dense_batch, to_dense_adj
from torch.nn import Linear
import torch.nn.functional as F
from torch_sparse import SparseTensor
import torch.nn as nn
import torch_geometric.nn as gnn
from torch_geometric.typing import OptPairTensor, Adj, OptTensor, Size


class DMon(torch.nn.Module):

    def __init__(self, data_args, model_args):
        super().__init__()

        self.in_channels = data_args.num_node_features
        self.out_channels = data_args.num_classes
        self.avg_num_nodes = data_args.avg_num_nodes

        self.hidden_channels = model_args.hidden_channels
        self.mlp_hidden = model_args.mlp_hidden

        self.conv1 = GCNConv(self.in_channels, self.hidden_channels)
        self.conv4 = GCNConv(self.hidden_channels, self.hidden_channels)

        num_nodes = ceil(0.5 * self.avg_num_nodes)
        self.pool1 = DMoNPooling([self.hidden_channels, self.hidden_channels], num_nodes)
        self.conv2 = DenseGraphConv(self.hidden_channels, self.hidden_channels)

        num_nodes = ceil(0.5 * num_nodes)
        self.pool2 = DMoNPooling([self.hidden_channels, self.hidden_channels], num_nodes)
        self.conv3 = DenseGraphConv(self.hidden_channels, self.hidden_channels)

        num_nodes = ceil(0.5 * num_nodes)
        self.pool3 = DMoNPooling([self.hidden_channels, self.hidden_channels], num_nodes)
        self.conv5 = DenseGraphConv(self.hidden_channels, self.hidden_channels)

        self.lin1 = Linear(self.hidden_channels, self.mlp_hidden)
        self.lin2 = Linear(self.mlp_hidden, self.out_channels)

    def forward(self, data):
        x, edge_index, batch = data.x, data.edge_index, data.batch
        x = self.conv1(x, edge_index).relu()

        x, mask = to_dense_batch(x, batch)
        adj = to_dense_adj(edge_index, batch)

        _, x, adj, sp1, o1, c1 = self.pool1(x, adj, mask)

        x = self.conv2(x, adj).relu()

        _, x, adj, sp2, o2, c2 = self.pool2(x, adj)

        x = self.conv3(x, adj)

        x = x.mean(dim=1)

        x = self.lin1(x).relu()
        x = self.lin2(x)
        # return F.log_softmax(x, dim=-1), sp1
        return F.softmax(x, dim=-1), sp1

    def update_state_dict(self, state_dict):
        original_state_dict = self.state_dict()
        loaded_state_dict = dict()
        for k, v in state_dict.items():
            if k in original_state_dict.keys():
                loaded_state_dict[k] = v
        self.load_state_dict(loaded_state_dict)


# torch.nn.Sigmoid()
# torch.nn.LeakyReLU()
# torch.nn.Relu()
# torch.nn.ELU()
# torch.nn.SELU()

# 重写一下gcnconv层，继承gcnconv
class GCNConv(gnn.GCNConv):
    def __init__(self, *args, **kwargs):
        super().__init__(*args, **kwargs)
        self.__explain_flow__ = False

    def forward(self, x: Tensor, edge_index: Adj,
                edge_weight: OptTensor = None) -> Tensor:
        """"""

        if self.normalize:
            if isinstance(edge_index, Tensor):
                cache = self._cached_edge_index
                if cache is None:
                    edge_index, edge_weight = gcn_norm(  # yapf: disable
                        edge_index, edge_weight, x.size(self.node_dim),
                        self.improved, self.add_self_loops, self.flow, x.dtype)
                    if self.cached:
                        self._cached_edge_index = (edge_index, edge_weight)
                else:
                    edge_index, edge_weight = cache[0], cache[1]

            elif isinstance(edge_index, SparseTensor):
                cache = self._cached_adj_t
                if cache is None:
                    edge_index = gcn_norm(  # yapf: disable
                        edge_index, edge_weight, x.size(self.node_dim),
                        self.improved, self.add_self_loops, self.flow, x.dtype)
                    if self.cached:
                        self._cached_adj_t = edge_index
                else:
                    edge_index = cache

        x = self.lin(x)

        # propagate_type: (x: Tensor, edge_weight: OptTensor)
        out = self.propagate(edge_index, x=x, edge_weight=edge_weight,
                             size=None)

        if self.bias is not None:
            out = out + self.bias

        return out

    def propagate(self, edge_index: Adj, size: Size = None, **kwargs):
        size = self.__check_input__(edge_index, size)

        # Run "fused" message and aggregation (if applicable).
        if (isinstance(edge_index, SparseTensor) and self.fuse
                and not self._explain):
            coll_dict = self.__collect__(self.__fused_user_args__, edge_index,
                                         size, kwargs)

            msg_aggr_kwargs = self.inspector.distribute(
                'message_and_aggregate', coll_dict)
            out = self.message_and_aggregate(edge_index, **msg_aggr_kwargs)

            update_kwargs = self.inspector.distribute('update', coll_dict)
            return self.update(out, **update_kwargs)

        # Otherwise, run both functions in separation.
        elif isinstance(edge_index, Tensor) or not self.fuse:
            coll_dict = self.__collect__(self.__user_args__, edge_index, size,
                                         kwargs)

            msg_kwargs = self.inspector.distribute('message', coll_dict)
            out = self.message(**msg_kwargs)

            # For `GNNExplainer`, we require a separate message and aggregate
            # procedure since this allows us to inject the `edge_mask` into the
            # message passing computation scheme.
            if self._explain:
                edge_mask = self.__edge_mask__
                # Some ops add self-loops to `edge_index`. We need to do the
                # same for `edge_mask` (but do not train those).
                if out.size(self.node_dim) != edge_mask.size(0):
                    loop = edge_mask.new_ones(size[0])
                    edge_mask = torch.cat([edge_mask, loop], dim=0)
                assert out.size(self.node_dim) == edge_mask.size(0)
                out = out * edge_mask.view([-1] + [1] * (out.dim() - 1))
            elif self.__explain_flow__:
                edge_mask = self.layer_edge_mask
                # Some ops add self-loops to `edge_index`. We need to do the
                # same for `edge_mask` (but do not train those).
                if out.size(self.node_dim) != edge_mask.size(0):
                    loop = edge_mask.new_ones(size[0])
                    edge_mask = torch.cat([edge_mask, loop], dim=0)
                assert out.size(self.node_dim) == edge_mask.size(0)
                out = out * edge_mask.view([-1] + [1] * (out.dim() - 1))

            aggr_kwargs = self.inspector.distribute('aggregate', coll_dict)
            out = self.aggregate(out, **aggr_kwargs)

            update_kwargs = self.inspector.distribute('update', coll_dict)
            return self.update(out, **update_kwargs)
