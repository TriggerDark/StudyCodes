from threading import Thread
import time
import threading


def test1():
    g_num = 100
    name = threading.current_thread().name
    if name == "Thread-1":
        g_num += 1
    else:
        time.sleep(2)
    print("--Thread is %s--g_num=%d" % (name, g_num))


t1 = Thread(target=test1)
t1.start()

t2 = Thread(target=test1)
t2.start()