import numpy as np


vector = np.array([5, 10, 15, 20])
#与
equal = (vector == 10) & (vector == 20)
print(equal)

#或
equal = (vector == 10) | (vector == 20)
print(equal)