from functools import reduce
map(lambda x: x * x, [1, 2, 3])  # [1, 4, 9]

filter(lambda x: x % 2, [1, 2, 3, 4])  # [1, 3]过滤

reduce(lambda x, y: x + y, [1, 2, 3, 4])  # 10
reduce(lambda x, y: x + y, [1, 2, 3, 4], 5)  # 15

sorted(["dd", "aa", "cc", "bb"])
