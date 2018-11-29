"""
while 条件式:
    pass
else:
    pass
"""

"""1. 公因数"""
num1 = int(input("num1 = "))
num2 = int(input("num2 = "))
while num2!=0:
    r = num1%num2
    print(r)
    num1 = num2
    num2 = r
    if num1 == 1:
        print("互质")
        break
else:
    print('公因数为%d'%num1)


import random
number = 0
while number!=5:
    number = random.randint(0, 9)
    print(number)
    if number == 5:
        print("我遇见5了")


num = 0
while num == 0:
    print("while")
    num = 1
else:
    print("else")