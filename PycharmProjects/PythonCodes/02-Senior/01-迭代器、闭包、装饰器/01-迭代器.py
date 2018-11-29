"""
1.function。可迭代对象
一类是集合数据类型如list、02-tuple、dictionary、set、str
一类是generator，包括生成器和带yield的generator function。
"""
"""
2.判断 是否可以迭代
"""
from collections import Iterable
from collections import Iterator

print(isinstance("abc", Iterable))
print(isinstance([], Iterable))
print(isinstance([x for x in range(5)], Iterable))
print(isinstance((x for x in range(5)), Iterator))

a = [11, 22, 33]
print(type(a))

b = iter(a)
print(type(b))
