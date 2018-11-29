import numpy as np


a = np.floor(10*np.random.random((2, 12)))
print(a)

#按行分割
print(np.hsplit(a, 3))
#指定位置分割
print(np.hsplit(a, (3, 4)))


a = np.floor(10*np.random.random((12, 2)))

#按列分割
print(np.vsplit(a, 4))