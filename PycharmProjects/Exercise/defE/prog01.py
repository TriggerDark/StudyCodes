def isNum():
    try:
        typeStr = eval(input("请输入任意字符串：\n"))
        if type(typeStr) == type(123):
            print("{}为int类型".format(typeStr))
        elif type(typeStr) == type(1.0):
            print("{}为float类型".format(typeStr))
        elif type(typeStr) == type(1+1J):
            print("{}为负数类型".format(typeStr))
        else:
            print("{}为str类型".format(typeStr))
    except:
        print("error")


if __name__ == "__main__":
    isNum()