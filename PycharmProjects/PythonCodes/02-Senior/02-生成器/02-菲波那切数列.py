def creatNum():
    a, b = 0, 1
    for i in range(5):
        # print(b)
        yield b  # 停在此处并返回b
        a, b = b, a + b


print(creatNum())  # <generator object creatNum at 0x000001DD728C5BA0>