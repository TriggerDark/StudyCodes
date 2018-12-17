from threading import Thread
import time


# 1.如果多个线程同时执行一个函数,他们之间不会相互影响
def test():
    print("---1---")
    time.sleep(1)


def main():
    for i in range(5):
        t = Thread(target=test)
        t.start()


if __name__ == "__main__":
    main()