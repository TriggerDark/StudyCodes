"""
class P:
    @classmethod
    def cmth(clz):
        print('p', clz)


class S1(P):
    @classmethod
    def cmth(clz):
        print('S1', clz)


class S2(P):
    @classmethod
    def cmth(clz):
        print('S2', clz)


class SS(S1, S2):
    pass

ss = SS()

print(SS.__mro__)
super(SS,SS).cmth()
super(S1,SS).cmth()
super(S2,SS).cmth()
"""

class P:
    @staticmethod
    def cmth(p):
        print(p)

class S(P):
    pass


super(S, S).cmth(1)
super(S).__get__(S, S).cmth(10)

s = S()
super(S).__get__(s, S).cmth(100)