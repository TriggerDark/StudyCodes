def num(n):
    x = 0
    while x != n:
        yield x
        x += 1

# for n in num(10):
#      print(n)
ret = num(10)
a = ret.__next__()
print(a)
a = ret.__next__()
print(a)