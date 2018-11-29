import time
import os
from quickSort import quickSort


def loop(x):
    strn = ""
    for i in x:
        strn += str(i) + '\t'*2
    return strn + '\n'


def listdirFile(dirpath, style):
    fileSet = []  # 定义一个文件集
    filedic = os.listdir(dirpath)
    for filename in filedic:
        if filename.endswith(style):  # 检测是否以.txt结尾
            fileSet.append(filename)  # 把符合的文件加入文件集
    return fileSet


def readFile(fileset):#读文件8
    numSet = []  # 定义一个数据集
    position = fileset.rfind(".")
    with open(fileset) as fr, open(fileset[:position]+"Sorted" + fileset[position:], "w") as fw:
        temp = fr.readlines()
        fw.write("Size" + "\t" + "Ponder" + "\t" + "Price" + "\t" +"P/B" + "\n")
        #将读取的字符串分割,并计算Price/Ponder
        for i in range(1, len(temp)):
            numSet.append(temp[i].rstrip("\n").split("\t"*2))
            if numSet[i-1][1] == "0":
                numSet[i-1].append(0)
                #fw.write(loop(numSet[i-1]))
            else:
                div = "{:.5f}".format(int(numSet[i-1][2])/int(numSet[i-1][1]))
                numSet[i-1].append(eval(div))
                #fw.write(loop(numSet[i-1]))
        quickSort(numSet, 0, len(numSet)-1)
        for i in range(1, len(temp)):
            fw.write(loop(numSet[i - 1]))


def main():
    fileSet = listdirFile("./", "DataSet.txt")
    for i in range(len(fileSet)):
        readFile(fileSet[i])



if __name__ == "__main__":
    main()