import numpy as np


vector = np.array([5, 10, 15, 20])

print(vector.min())
print(vector.max())


matrix = np.array([[5, 10, 15],
                   [20, 25, 30],
                   [35, 40, 45]])
print(matrix.argmax(axis=0))
print(matrix.argmax(axis=1))