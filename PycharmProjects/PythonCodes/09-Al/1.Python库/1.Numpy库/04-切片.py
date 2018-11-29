import numpy as np


vector = np.array([5, 10, 15, 20])
print(vector[0:3])

matrix = np.array([[5, 10, 15],
                   [20, 25, 30],
                   [35, 40, 45]])
#逗号前为行，后为列
#第二行，第二三列
print(matrix[1:2,1:])