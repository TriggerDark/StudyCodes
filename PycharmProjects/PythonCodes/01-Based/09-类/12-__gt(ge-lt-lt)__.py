class Some:
    def __init__(self, value):
        self.value = value

    #大于
    def __gt__(self, other):
        return self.value > other.value

    #大于等于
    def __ge__(self, other):
        return self.value >= other.value

    #小于
    def __lt__(self, other):
        return self.value < other.value

    #小于等于
    def __le__(self, other):
        return self.value <= self.value


s1 = Some(30)
s2 = Some(20)
print(s1 > s2)
print(s1 >= s2)
print(s1 < s2)
print(s1 <= s2)