def np_range1(n):
    for i in range(0 - n, 0):
        yield i

    for i in range(1, n + 1):
        yield i

def np_range2(n):
    yield from range(0 - n, 0)
    yield from range(1, n + 1)

print(list(np_range1(10)))
print(list(np_range2(10)))