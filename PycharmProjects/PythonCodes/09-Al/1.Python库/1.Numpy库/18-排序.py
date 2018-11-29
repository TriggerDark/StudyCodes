import numpy as np

a = np.array([
    [4, 3, 5],
    [1, 2, 1]
])
print(a)
print("-"*30)
#b矩阵是对a矩阵按行排序后的矩阵
b = np.sort(a, axis=1)
print(b)
print("-"*30)

a = np.array([4, 3, 1, 2])
#a矩阵元素大小的排序的索引
index = np.argsort(a)
print(index)
print(a[index])

