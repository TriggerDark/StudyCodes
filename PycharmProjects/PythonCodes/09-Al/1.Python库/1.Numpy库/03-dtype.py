import numpy as np

number1 = np.array([1, 2, 3, 4])
print(number1)
print(number1.dtype)
print("-------------")

number2 = np.array([1, 2, 3, 4.0])
print(number2)
print(number2.dtype)
print("-------------")

number3 = np.array([1, 2, 3, '4'])
print(number3)
print(number3.dtype)