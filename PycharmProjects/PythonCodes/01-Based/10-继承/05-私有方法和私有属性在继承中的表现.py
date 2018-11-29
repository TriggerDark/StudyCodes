class Base(object):
    def __init__(self):
        self.num = 1
        self.__num = 2

    def test1(self):
        print("HEllO")

    def __test2(self):
        print("__test2")

    def test3(self):
        self.__test2()
        print(self.__num)


class A(Base):
    def test4(self):
        self.__test2()
        print(self.__num)


a = A()

a.test3()
#print(a.__num)
print(a.num)
#print(a.test4())

"""
私有属性和私有方法不会被继承
"""