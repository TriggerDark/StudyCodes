import functools

# print(dir(functools))


def show(*args, **kw):
    print(args)
    print(kw)


p1 = functools.partial(show, 1, 2, 3)
p1()
p1(4, 5, 6)
p1(4, 5, 6, a="python", b="itcast")

p2 = functools.partial(show, a=3, b="linux")
p2()
p2(1, 2)
p2(a="python", b="itcast")
