import hashlib

m = hashlib.md5()  # 创建hash对象
print(m)

m.update(b'itcast')  # 更新哈希对象以字符串参数
#不加b会出现TypeError：Unicode-objects must be encoded before hashing
print(m.hexdigest())  # 返回十六进制数字字符串
