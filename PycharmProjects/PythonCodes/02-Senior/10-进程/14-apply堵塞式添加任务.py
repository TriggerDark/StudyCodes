from multiprocessing import Pool
import time
import os


def worker(msg):
    print("===pid=%d==num=%d="%(os.getpid(), msg))
    time.sleep(1)


po = Pool(3)
for i in range(0, 10):
    print("---%d---"%i)
    po.apply(worker, (i,))

print("--start--")
po.close()
po.join()
print("---end--")