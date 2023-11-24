from tap import Tap



class XArgs(Tap):
    explainer: str = 'GNNExplainer'
    vis: bool = True
    lr: float = 0.01
    epoch: int = 100
    sparsity: float = 0.83
    walk: bool = False
    debug: bool = False
    nolabel: bool = False
    list_sample: bool = False
    save_fig: bool = True


x_args = XArgs().parse_args(known_only=True)