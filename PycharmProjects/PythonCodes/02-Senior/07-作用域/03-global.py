x = 10
def outer():
    print(x) #如果在此基础上，后续添加上x = 100，会报错
    #global x, y
    #x = 100
    y = 200

outer()
#print(x)
#print(y)