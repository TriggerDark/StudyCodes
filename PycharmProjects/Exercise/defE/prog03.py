def fB(n):
    a, b = 1, 1
    print(a, end=", ")
    for i in range(3, n+1):
        a, b = b, a+b
        print(a, end=", ")
    print(b, end=", ")


if __name__ == '__main__':
    fB(int(10))