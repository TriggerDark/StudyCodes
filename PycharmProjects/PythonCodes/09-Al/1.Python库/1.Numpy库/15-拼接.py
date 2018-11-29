import numpy as np


a = np.array([
    [1, 2],
    [2, 3]
])

b = np.array([
    [2, 3],
    [4, 5]
])

#横向拼接
print(np.hstack((a, b)))

#纵向拼接
print(np.vstack((a, b)))