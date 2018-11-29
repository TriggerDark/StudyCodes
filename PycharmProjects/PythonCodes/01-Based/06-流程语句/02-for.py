for temp in "apple":
    print(temp)

"""1. 9*9乘法表"""
for i in range(1, 10):
    for j in range(1, i+1):
        print("%d*%d=%d"%(j, i,j*i),end="\t")
    print()

"""2. 公因数"""
num1 = int(input("num1 = "))
num2 = int(input("num2 = "))
for i in range(num1,1,-1):
    if num1%i == 0 and num2%i == 0:
        print("公约数为 %d"%i)
        break
else:
    print("互质")