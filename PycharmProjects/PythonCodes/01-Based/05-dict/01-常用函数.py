"""
dic["one-item"] = one-key
dic.get("one-item")---->这个比上面的好，不返回异常

dict(zip(key, value))
len()

清除
del
pop()
clear()

items()
keys()
values()

"""
"""1. dic"""
stu = {
    "name": "Jihaitao",
    "age": 20
}
print(stu)

"""2. zip"""
key = [1, 2, 3]
value = ["ji", "hai", "tao"]
print(dict(zip(key, value)))

"""3. items() keys() values()"""
print(stu.items())
print(stu.keys())
print(stu.values())
for key, value in stu.items():
    print(key, value)
