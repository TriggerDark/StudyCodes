# 算法表
for i in range(1,10):
    for j in range(1,10):
        if j <= i:
            print(j,'*',i,'=',i*j,end='\t')
    print()

    
for i in range(1, 10):
    j = 1
    while j <= i:
        print("%d*%d=%d" % (i, j, i * j),"\t", end="")
        j += 1
    print()