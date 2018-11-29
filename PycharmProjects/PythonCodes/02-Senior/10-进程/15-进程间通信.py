from multiprocessing import Queue, Process
import os, time, random
"""
Queue用于Process创建的子进程之间的通信
Manager用于进程池之间的通信
"""

"""写数据执行代码"""


def write(q):
    for value in ["A", "B", "C", "D"]:
        print("Put %s to queue" % value)
        q.put(value)
        time.sleep(random.random())


"""读数据执行代码"""


def read(q):
    while True:
        if not q.empty():
            value = q.get(True)
            print("Get %s from queue" % value)
            time.sleep(random.random())
        else:
            break


if __name__ == "__main__":
    q = Queue()
    pw = Process(target=write, args=(q, ))
    pr = Process(target=read, args=(q, ))
    pw.start()
    pw.join()
    pr.start()
    pr.join()