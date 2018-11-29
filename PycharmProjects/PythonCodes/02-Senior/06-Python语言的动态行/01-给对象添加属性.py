class Person(object):
    """docstring for Person"""

    def __init__(self, newName, newAge):
        super(Person, self).__init__()
        self.name = newName
        self.age = newAge


test = Person("老王", 20)
print(test.name)
print(test.age)
test.addr = "北京"
print(test.addr)

Person.num = 100
print(test.num)
