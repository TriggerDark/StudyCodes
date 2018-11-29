A = set("abc")
B = set("cdf")

x = A & B  # 交集
x = A | B  # 并集

x = A - B  # 差集
x = A ^ B  # 对称差集
print(x)
