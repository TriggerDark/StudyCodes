import os

ret = os.fork()
"""
创建一个子进程并给子进程一个ID
"""
print(ret)
if ret > 0:
    print("---partern---%d"%os.getpid())
else:
    print("---child--%d--%d"%(os.getpid(), os.getppid()))
"""
getpid()得到当前进程的ID
getppid()得到父进程的ID
"""
