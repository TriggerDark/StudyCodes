def num(m, n):
    if n == 0:
        return m
    else:
        return num(n, m%n)

num1 = int(input("num1 = "))
num2 = int(input("num2 = "))
r = num(num1, num2)
if r == 1:
    print("互质")
else:
    print(r)