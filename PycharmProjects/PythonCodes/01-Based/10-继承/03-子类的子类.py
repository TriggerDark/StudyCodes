class Animal(object):
    def eat(self):
        print("吃饭")

    def sleep(self):
        print("睡觉")


class Dog(Animal):
    def bark(self):
        print("犬吠")


class Xtq(Dog):
    def maser(self):
        print("杨戬")


xtq = Xtq()
xtq.maser()
xtq.bark()
xtq.sleep()