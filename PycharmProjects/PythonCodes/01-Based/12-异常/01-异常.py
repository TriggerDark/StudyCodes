
# 统计一段数字的平均值，要求连输输入，遇到非法字符，提示非法
# 输入的过程中，要继续输入，提示：继续输入？yes继续，no停止
list = []
while True:
    x = input("请输入数值")
    try:
        list.append(float(x))
    except:
        print("数字非法")
    while True:
        flag = input("继续输入吗？[yes/no]")
        if flag.lower() not in ('yes', 'no', 'y', 'n'):
            print("只能输入yes/s or no/n")
        else:
            break
    if flag.lower() == 'no' or flag.lower() == 'n':
        break
print(sum(list) / len(list))
