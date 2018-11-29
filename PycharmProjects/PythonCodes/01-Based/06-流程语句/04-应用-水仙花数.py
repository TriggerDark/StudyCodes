for k in range(100, 1000):
    x = str(k)
    a,b,c = map(int, x)
    if a**3+b**3+c**3 == k:
        print(k)