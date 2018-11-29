import numpy as np

a = np.array([
    [1, 2],
    [2, 3]
])
b = np.array([
    [0, 1],
    [1, 2]
])
# 对应位置相减
print(a - b)

# a**2
print(a**2)

# b<1
print(b < 1)


print(a)
print(b)
# 内积
print(a*b)

# 值
print(a.dot(b))
print(a @ b)
print(np.dot(a, b))