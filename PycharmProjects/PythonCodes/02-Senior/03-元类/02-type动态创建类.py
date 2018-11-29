class Person(object):
    Person_num = 0

    def __init__(self):
        super(Person, self).__init__()


def printNum(self):
    print("--print--")


# 添加属性并继承与Person
Test = type("Test", (Person,), {"Test_num": 1})

# 添加方法
Test2 = type("Test2", (), {"printNum": printNum})

p1 = Person()
print(p1.Person_num)

p2 = Test()
print(p2.Person_num)

p3 = Test2()
p3.printNum()
