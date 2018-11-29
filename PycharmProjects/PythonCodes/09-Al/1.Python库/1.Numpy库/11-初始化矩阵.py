import numpy as np


#一个三行四列的零矩阵
#此时zeros()的参数(3, 4)为元组
zero = np.zeros((3, 4))
print(zero)

#三位矩阵
one = np.ones((2, 3, 4), dtype=np.float)
print(one)


#随机生成(2, 3)矩阵,元素值范围[-1, 1]
print(np.random.random((2, 3)))