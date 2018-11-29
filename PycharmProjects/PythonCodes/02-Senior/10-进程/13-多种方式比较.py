import os
from multiprocessing import Process
from multiprocessing import Pool


"""1"""
ret = os.fork()
if ret == 0:
    """子进程"""
else:
    """父进程"""


"""2"""
p1 = Process(target="")
p1.start()


"""3"""
pool = Pool(3)
pool.apply_async()