def add_nums():
    return lambda num1 : num1 > 0

f = add_nums()
print(f(10))