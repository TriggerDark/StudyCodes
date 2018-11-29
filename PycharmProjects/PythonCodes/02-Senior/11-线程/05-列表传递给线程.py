from threading import  Thread
import time

nums = [11, 22, 33]


def work1(nums):
    nums.append(44)
    print("in work1---nums=", nums)


def work2(nums):
    time.sleep(1)
    print("in work2---nums=", nums)


t1 = Thread(target=work1, args=(nums, ))
t1.start()

t2 = Thread(target=work2, args=(nums, ))
t2.start()
