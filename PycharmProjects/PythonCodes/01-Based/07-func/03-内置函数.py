"""方法一"""
def filter_It(func, It):
    result = []
    for item in It:
        if func(item):
            """
            func = len_grater_than(5)
            func(item)
            """
            result.append(item)
    print(result)

def len_grater_than(num):
    def len_grater_than_num(elem):
        return len(elem) > num
    return len_grater_than_num

elem = ["JIhaitao", "ji", "haitao"]
filter_It(len_grater_than(5), elem)


def num1(num1):
    def num2(num2):
        return  num1 + num2

    return num2

f = num1(10)
print(f(20))