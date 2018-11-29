# 1.引用计数为主，隔代回收为辅
#   优点
#       简单
#       实时性
#   缺点
#       维护引用计数消耗资源
#       循环引用
import gc


class ClassA(object):
    """docstring for ClassA"""

    def __init__(self):
        super(ClassA, self).__init__()
        print("object born, id:%s" % str(hex(id(self))))


def f2():
    while True:
        c1 = ClassA()
        c2 = ClassA()
        c1.t = c2
        c2.t = c1
        del c1
        del c2
        gc.collect()  # 显式执行垃圾回收


gc.disable()  # gc功能关闭
f2()
