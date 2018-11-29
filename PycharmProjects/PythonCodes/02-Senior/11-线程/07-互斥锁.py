from threading import Thread, Lock
import time

g_num = 0
#创建一个互斥锁,默认没有上锁
mutex = Lock()


def test1():
    global g_num
    mutex.acquire()
    for i in range(1000000):
        g_num += 1
    mutex.release()

    print("---test1---g_num=%d" % g_num)


def test2():
    global g_num
    mutex.acquire()#上锁
    for i in range(1000000):
        g_num += 1
    mutex.release()#解锁
    print("---test2---g_num=%d" % g_num)


t1 = Thread(target=test1)
t1.start()

#time.sleep(1)

t2 = Thread(target=test2)
t2.start()