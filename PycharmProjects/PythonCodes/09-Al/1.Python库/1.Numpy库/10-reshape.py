import numpy as np


#arange()指定区间
print(np.arange(15))
print(np.arange(10, 30, 5))

a = np.arange(15).reshape(3, 5)
print(a)

print(a.shape)

#打印a矩阵的维度
print(a.ndim)

#打印a矩阵的元素数目
print(a.size)