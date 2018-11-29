import numpy as np


vector = np.array([5, 10, 15, 20])
index_equal = (vector == 10)
print(vector == 10)

#bool值也可以当成索引
#返回true值
print(vector[index_equal])

print("-"*30)

matrix = np.array([[5, 10, 15],
                   [20, 25, 30],
                   [35, 40, 45]])
index_equal = (matrix[:, 1] == 25)
print(matrix[:, 1] == 25)

#返回true值,此时返回一行
print(matrix[index_equal])

print("-"*30)