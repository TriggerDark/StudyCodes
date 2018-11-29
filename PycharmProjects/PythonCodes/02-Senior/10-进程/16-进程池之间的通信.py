from multiprocessing import Pool, Manager
import os
"""
Queue用于Process创建的子进程之间的通信
Manager用于进程池之间的通信
"""

"""写数据执行代码"""


def reader(q):
    print("reader启动(%s),父进程为(%s)" % (os.getpid(), os.getppid()))
    for i in range(q.qsize()):
        print("reader从Queue获取到信息%s" % q.get(True))


"""读数据执行代码"""


def writer(q):
    print("writer(%s),父进程为(%s)" % (os.getpid(), os.getppid()))
    for i in "Hello":
        q.put(i)


if __name__ == "__main__":
    print("(%s)start" % os.getpid())
    q = Manager().Queue()
    po = Pool()
    po.apply(writer, (q, ))
    po.apply(reader, (q, ))
    po.close()
    po.join()
    print("(%s)end" % os.getpid())