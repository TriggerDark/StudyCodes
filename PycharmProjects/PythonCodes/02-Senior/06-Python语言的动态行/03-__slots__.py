class Person(object):
    """docstring for Person"""
    __slots__ = ("name", "age")

    def __init__(self):
        super(Person, self).__init__()


p1 = Person()
p1.name = "li"
p1.age = 10
p1.addr = "北京"
