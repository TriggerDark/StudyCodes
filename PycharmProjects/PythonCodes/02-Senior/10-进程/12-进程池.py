from multiprocessing import Pool
import time
import random
import os


def worker(msg):

    t_start = time.time()
    print("%s开始执行,进程号为%d"%(msg, os.getpid()))
    time.sleep(random.random()*2)
    t_stop = time.time()
    print(msg, "执行完毕,耗时%0.2f"%(t_stop-t_start))


po = Pool(3)
"""定义一个进程池,最大进程数3"""
for i in range(0, 10):
    po.apply_async(worker, (i,))
"""
向进程池中添加任务,
"""

print("--start--")
po.close()
"""关闭进程池,不在添加新任务"""
po.join()
"""主进程"""
print("---end--")