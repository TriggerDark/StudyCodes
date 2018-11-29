def creatNum():
    print("---start---")
    a, b = 0, 1
    for i in range(5):
        # print(b)
        print("---1---")
        yield b  # 停在此处并返回b
        print("---2---")
        a, b = b, a + b
        print("---3---")

    print("---stop---")


a = creatNum()

ret = a.__next__()  # next(a)等价
print(ret)


# 2
# for num in a:
#     print(num)

# 1
# ret = next(a)
# ret = next(a)
# ret = next(a)
# ret = next(a)
# ret = next(a)
# ret = next(a)
