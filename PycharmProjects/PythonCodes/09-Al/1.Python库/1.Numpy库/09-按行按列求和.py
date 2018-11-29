import numpy as np


matrix = np.array([[5, 10, 15],
                   [20, 25, 30],
                   [35, 40, 45]])

#按行求和
print(matrix.sum(axis=1))

#按列求和
print(matrix.sum(axis=0))