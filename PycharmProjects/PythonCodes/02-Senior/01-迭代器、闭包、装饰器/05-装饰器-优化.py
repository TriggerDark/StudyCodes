def w1(func):
    print("---正在装饰---")
    def inner():
        print("---正在验证权限---")
        if False:
            func()
        else:
            print("---没有权限---")
    return inner

#只要python解释器执行到这个代码
#就会自动装饰
@w1
def f1():
    print("---f1---")


@w1
def f2():
    print("---f2--")


f1()
f2()
