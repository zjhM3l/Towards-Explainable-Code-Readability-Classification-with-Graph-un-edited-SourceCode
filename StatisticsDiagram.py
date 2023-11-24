import matplotlib.pyplot as plt

if __name__ == '__main__':
    types = ['try-catch existence', 'variables modification state', 'nesting structure',
             'if-else existence', 'code with comment', 'sequence', 'loop']
    types_count = ['T-C-E', 'V-M-S', 'N-S', 'I-E-E', 'C-C', 'S', 'L']

    readable_types_count = [23, 21, 20, 18, 13, 12, 4]
    unreadable_types_count = [18, 13, 13, 12, 5, 1, 1]

    readable_types = [
        'S',
        'C-C',
        'I-E-E',
        'N-S',
        'V-M-S',
        'T-C-E',
        'L'
    ]
    unreadable_types = [
        'I-E-E',
        'N-S',
        'V-M-S',
        'S',
        'L',
        'T-C-E',
        'C-C'
    ]

    # draw readable bar chart
    bar_width = 0.35

    # 绘制柱状图，每个柱子包含两个类的数据
    plt.bar(readable_types, readable_types_count, width=bar_width, label='Readable')

    for i, v in enumerate(readable_types_count):
        plt.text(i, v + 0.2, str(v), ha='center')
    # 设置x轴标签
    plt.xlabel('Code Characteristic')
    # 设置y轴标签
    plt.yticks([0, 4, 8, 12, 16, 20, 24])
    plt.ylabel('Count')
    # 添加图例
    plt.legend()

    plt.savefig('./result/Readable_type_Existences.png')
    plt.show()

    # # draw unreadable bar chart
    # bar_width = 0.35
    #
    # # 绘制柱状图，每个柱子包含两个类的数据
    # plt.bar(unreadable_types, unreadable_types_count, width=bar_width, label='Uneadable', color='#D95319')
    #
    # for i, v in enumerate(unreadable_types_count):
    #     plt.text(i, v + 0.2, str(v), ha='center')
    # # 设置x轴标签
    # plt.xlabel('Code Characteristic')
    # # 设置y轴标签
    # plt.ylabel('Count')
    # plt.yticks([0, 3, 6, 9, 12, 15, 18])
    # # 添加图例
    # plt.legend()
    # # 显示柱状图
    # plt.savefig('./result/Unreadable_type_Existences.png')
    # plt.show()