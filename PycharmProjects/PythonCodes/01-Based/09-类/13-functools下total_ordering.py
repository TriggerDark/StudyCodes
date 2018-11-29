from functools import total_ordering


"""
当一个类被标注@total_ordering时，必须实现__eq__()方法
并选择__lt__()、__le__()、__gt__()、__ge__()其中一个方法实现

"""
@total_ordering
class Some:
    def __init__(self, value):
        self.value = value

    def __eq__(self, other):
        return self == other

    def __le__(self, other):
        return self.value <= other.value


s1 = Some(10)
s2 = Some(20)
print(s1 <= s1)