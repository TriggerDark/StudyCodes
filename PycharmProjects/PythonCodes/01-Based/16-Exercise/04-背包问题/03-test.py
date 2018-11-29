from quickSort import quickSort

def loop(x):
    strn = ""
    for i in x:
        strn += str(i) + '\t'*2
    return strn


with open("1000DataSet.txt") as fr, open("test.txt", "w") as fw:
    num = []
    temp = fr.readlines()
    for i in range(1, len(temp)):
        num.append(temp[i].rstrip('\n').split('\t'*2))
        if num[i-1][1] == '0':
            num[i-1].append(0)
            #fw.write(loop(num[i-1])+"\n")
        else:
            div = "{:.5f}".format(int(num[i-1][2])/int(num[i-1][1]))
            num[i-1].append(eval(div))
            #fw.write(loop(num[i-1])+'\n')
    quickSort(num, 0, len(num)-1)
    for i in range(1, len(temp)):
        fw.write(loop(num[i-1])+'\n')

print(type(num[0][3]))