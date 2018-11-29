import sys
import random

def producer():
    while True:
        data = random.randint(0, 9)
        print("生产了：", data)
        yield data

def consumer():
    while True:
        data = yield
        print("消费了：", data)

def work(job, producer, consumer):
    print("执行了%d次"%job)
    p = producer()
    c = consumer()
    next(c)
    for i in range(job):
        data = next(p)
        c.send(data)


work(int(sys.argv[1]), producer, consumer)