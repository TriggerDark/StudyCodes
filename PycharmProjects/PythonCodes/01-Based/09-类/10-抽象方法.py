from abc import ABCMeta, abstractmethod


class Role(metaclass=ABCMeta):
    def __init__(self, name, level, blood):
        self.name = name
        self.level = level
        self.blood = blood

    @abstractmethod
    def fight(self):
        pass

    def __str__(self):
        return "({name},{level},{blood})".format(**vars(self))

    def __repr__(self):
      return self.__str__()


class SwordsMan(Role):
    def fight(self):
        print("挥剑自宫")

    def __str__(self):
        return "SwordsMan" + super().__str__()

    def __repr__(self):
        return self.__str__()


def draw(role):
    role.fight()


swordsman = SwordsMan("Ji", 1, 100)
print(swordsman)
draw(swordsman)

"""
如果在SwordsMan类中，没有实现fight()方法，那么会出现TypeError
Can't instantiate abstract class SwordsMan with abstract methods fight
"""