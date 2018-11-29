import os
from multiprocessing import Pool, Manager


def copyFiletTask(name, oldFileName, newFileName, queue):
    fr = open(oldFileName + "/" + name)
    fw = open(newFileName + "/" + name, "w")
    content = fr.read()
    fw.write(content)

    fr.close()
    fw.close()
    queue.put(name)


def main():
    """0.获取文件夹的名字"""
    oldFolderName = input("请输入文件夹的名字:")
    """1.创建一个文件夹"""
    newFolderName = oldFolderName + "-复件"
    os.mkdir(newFolderName)
    """2.获取old文件夹中的所有文件名字"""
    fileName = os.listdir(oldFolderName)
    """3.使用多进程的方式copy原文件夹中的所有文件到新的文件夹中"""
    pool = Pool(5)
    queue = Manager().Queue()
    for name in fileName:
        pool.apply_async(copyFiletTask, args=(name, oldFolderName, newFolderName, queue))
    pool.close()
    pool.join()

    num = 0
    allNum = len(fileName)
    while True:
        queue.get()
        num += 1
        copyRate = num/allNum
        print("\rcopy的进度是{:.2f}%".format(copyRate*100, end=""))
        if num == allNum:
            break

    print("\n打印完成")


if __name__ == "__main__":
    main()
