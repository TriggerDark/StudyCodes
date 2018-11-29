name = "apple"
print(list(enumerate(name)))
for i, c in enumerate(name, 2):# 2为起始位置
    print(i, c)
print(name)

food = "banana"
for i, c in zip(range(len(food)), food):
    print(i, c)