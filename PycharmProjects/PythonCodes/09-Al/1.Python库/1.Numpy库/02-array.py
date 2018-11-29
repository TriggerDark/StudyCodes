import numpy as np

#使用numpy.array()生成一维数组
vector = np.array([1, 2, 3, 4])
print(vector)  #[1 2 3 4]

#shape-->结构 对一维来说是一行有所包含的元素值
print(vector.shape) #(4,)

#使用numpy.array()生成二维数组
matrix = np.array([[1, 2, 3, 4], [5, 6, 7, 8]])
print(matrix)

"""
[[1 2 3 4]
 [5 6 7 8]]
    
"""
print(matrix.shape) #(2, 4) -->结构：两行四列