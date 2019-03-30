def cout(a):
    dic = {}
    dic["str"], dic["num"], dic["other"] = 0, 0, 0
    for i in a:
        if ('a' <= i <= 'z') and ('A' <= i <= 'z'):
            dic["str"] += 1
        elif '0' <= i <= '9':
            dic["num"] += 1
        else:
             dic["other"] += 1
    return dic


if __name__ == '__main__':
    dic = cout(input("随意输入："))
    print(dic.items())