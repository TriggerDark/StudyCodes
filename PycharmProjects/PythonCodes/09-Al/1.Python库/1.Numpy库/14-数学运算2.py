import numpy as np


x = np.arange(3)

#对E取幂
print(np.exp(x))
#对E取根
print(np.sqrt(x))

#floor()向下取整
a = np.floor(10*np.random.random((3, 4)))
print(a)

#矩阵变成向量，同reshape作用相反
print(a.ravel())

a.shape = (6, 2)
print(a)
#转置
print(a.T)

#写成3则变成三行四列
#写成2则变成两行六列
print(a.reshape(3, -1))