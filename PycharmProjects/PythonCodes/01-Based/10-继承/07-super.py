import math

class R(object):
    def __init__(self, r):
        super(R, self).__init__()
        self.r = r

    def __str__(self):
        return "边长为%d" % self.r

    def __repr__(self):
        return self.__str__()

class Z(R):
    def __init__(self, r):
        super(Z, self).__init__(r)


    def __str__(self):
        return "正方形：" + super().__str__() + "，面积为%d" % (self.r**2)

class C(R):
    def __init__(self, r, h):
        super(C, self).__init__(r)
        self.h = h


    def __str__(self):
        return "长方形：" + super().__str__() + "，面积为%d" % (self.r*self.h)



z = Z(10)
print(z)
c = C(10,5)
print(c)