x = 10

def outer():
    x = 100
    def inner():
        nonlocal x # nonlocal 指明变量并非局部变量，
                   # 改变outer()函数的x
        x = 1000

    inner()
    print(x)

outer()
print(x)
