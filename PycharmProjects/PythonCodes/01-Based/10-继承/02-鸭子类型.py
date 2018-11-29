class Role(object):
    def __init__(self, name, level, blood):
        self.name = name
        self.level = level
        self.blood = blood

    def  __str__(self):
        return "('{name}', '{level}', '{blood}')".format(**vars(self))

    def __repr__(self):
        return self.__str__()



class SwordsMan(Role):
    def fight(self):
        print("挥剑自宫")


class Magician(Role):
    def fight(self):
        print("魔法攻击")

    def cure(self):
        print("魔法回血")


def draw_fight(role):
    print(role, end="")
    role.fight()


swordsman = SwordsMan("Ji", 1, 100)
draw_fight(swordsman)