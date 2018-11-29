text = "哈"

print(text.encode("utf-8"))
print(text.encode("GBK"))
gbk_impl = text.encode("GBK")
print(type(gbk_impl))
print(gbk_impl.decode("GBK"))
