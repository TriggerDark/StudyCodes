def some(*args, **kwargs):
    print(args)
    print(kwargs)

some(2, 3, a = 1, b = 3)
name = some
print(name)