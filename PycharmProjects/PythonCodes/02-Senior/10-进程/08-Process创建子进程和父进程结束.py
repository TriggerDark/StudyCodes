from multiprocessing import Process
import time


def test():
    for i in range(5):
        print("---test---")
        time.sleep(1)


p = Process(target = test)
p.start()
"""主进程等待Process子进程先结束"""
