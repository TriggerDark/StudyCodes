def test():
    print("--1--")


print(test)

b = test

b()
print("--0--")


def test_1(number):

    def test_in(number2):
        print(number + number2)

    return test_in


ret = test_1(100)
ret(1)
ret(100)
