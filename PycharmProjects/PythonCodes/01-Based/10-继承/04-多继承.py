class Base(object):
    def test1(self):
        print("-Base---test1-")


class A(Base):
    def test2(self):
        print("-A---test2-")


class B(Base):
    def test3(self):
        print("-B---test3-")


class C(A, B):
    def test4(self):
        print("-C---test4-")


c = C()

c.test1()
c.test2()
c.test3()
c.test4()

print(C.__mro__)
print(C.__bases__)