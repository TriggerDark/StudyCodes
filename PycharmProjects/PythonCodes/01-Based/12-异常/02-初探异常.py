try:
    num = input("输入数字，请以空格间隔").split(" ")
    #print(sum(int(number) for number in num))
    print("平均值：", sum(int(number) for number in num) / len(num))
except ValueError as ret:
    print(ret)
"""
例子

当输入不为数字形式的形式时，抛出异常

输入数字，请以空格间隔1 2o 20
invalid literal for int() with base 10: '2o'

"""