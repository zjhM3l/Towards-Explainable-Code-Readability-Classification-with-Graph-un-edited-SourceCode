# pipeline
GNNExplainer解释核心在于forward函数上，forward函数就是一整个解释的流程

1. 传参给parent forward，并且将模型调成eval状态
2. 给任意一个还没有自循环边的节点加上自循环边，如果GNNExplainer输入有edge mask，获取edge mask并且给每条边赋上edge mask；如果没有，则**生成**
3. 然后生成遍历每一个类别class对应的整数，生成masks（有多少个类别，生成多少组edge mask），**如何生成？** 
    - node_feat_mask和edge_mask这两个掩码变量都被定义为 **torch.nn.Parameter对象，因此它们可以被模型的优化器所更新**。node_feat_mask 变量被初始化为一个标准差为 0.1 的**正态分布随机张量**，而 edge_mask 变量的初始化方式则是通过计算**relu激活函数的增益（gain）以及节点数量来得到的**。
    - 函数使用一个循环遍历模型的所有子模块，如果子模块是 MessagePassing 类型的模块，则将该模块的 _explain 属性设置为 True，并将 edge_mask 变量赋值给该模块的 \__edge_mask\__ 属性。这样做的目的是为了在图卷积神经网络的前向传播过程中，将边掩码应用到每一层的消息传递过程中，从而使模型具有可解释性。(**所以edge mask是在这里被赋予到module里面的edge mask属性里了**)
4. 用sparsity来控制edge masks的稀疏度，在经过稀疏化处理之后，每个边掩码 mask 都会被传入 sigmoid 函数中进行激活，生成一个处于 (0, 1) 范围内的实数张量。生成hard edge mask（每一组edge mask都生成一个hard edge mask）。
5. 用hard edge masks算fidelity以及其他metrics。（使用了 torch.no_grad() 上下文管理器，这意味着在这个上下文中的所有张量运算都不会被跟踪，也不会被用于计算梯度，这可以提高代码的运行速度和减少内存占用）
6. 最后清除edge masks


# Given GCN model

### 模型本身
开头结尾一个conv层，中间叠加几个conv和relu层结合，最终接一个全连接层。

