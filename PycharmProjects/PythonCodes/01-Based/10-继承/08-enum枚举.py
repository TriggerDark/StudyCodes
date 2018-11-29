from enum import IntEnum, unique


@unique
class Action(IntEnum):
    stop = 1
    right = 2
    left = 3
    up = 4
    down = 5

print(Action(1))
print(Action['left'])
enum_member = Action(3)
print(enum_member.name)
print(enum_member.value)


for item in Action:
    print(item.name, '\t:', item.value)

"""
枚举名称不能重复，枚举值可以重复
类装饰为@unique是为了防止枚举值相同时，枚举名称不同的情况

"""