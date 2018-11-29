import os
import time


ret = os.fork()
"""
fork()--->创建一个子进程
"""
print("haha")
if ret == 0:
    while True:
        print("---1---")
        time.sleep(1)
else:
    while True:
        print("----2---")
        time.sleep(2)