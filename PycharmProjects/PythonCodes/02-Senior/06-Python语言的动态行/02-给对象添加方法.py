import types


class Person(object):
    """docstring for Person"""

    def __init__(self, newName, newAge):
        super(Person, self).__init__()
        self.name = newName
        self.age = newAge

    def eat(self):
        print("---%s正在吃---" % self.name)


def run(self):
    print("---%s正在跑---" % self.name)


@staticmethod
def test():
    print("----staticmethod----")


@classmethod
def printNum(cls):
    print("----classmethod----")


p1 = Person("p1", 16)
p1.eat()
#Person.run = run
#p1.run = run
p1.run = types.MethodType(run, p1)
p1.run()

Person.test = test
Person.test()


Person.printNum = printNum
Person.printNum()
