# 100以内的最大质数
for x in range(100,1,-1):
    for i in range(2,x):
        if x%i == 0:
            break
    else:
        print(x)
        break