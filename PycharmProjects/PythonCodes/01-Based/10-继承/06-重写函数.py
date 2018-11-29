class Animal:
    def eat(self):
        print("--吃--")

    def drink(self):
        print("--喝--")

    def sleep(self):
        print("--睡觉--")

    def run(self):
        print("--跑--")


class Dog(Animal):
    def bark(self):
        print("---汪汪汪---")


class Xiaotq(Dog):
    def fly(self):
        print("---飞---")

    def bark(self):
        print("--狂叫--")

        # 第一种调用被重写的父类的方法
        # Dog.bark(self)

        # 第二种
        #super().bark()


xiaotq = Xiaotq()
xiaotq.fly()
xiaotq.bark()
xiaotq.eat()

"""
super关键字继承父类方法或属性
"""