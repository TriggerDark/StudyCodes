"""

list---->可以修改

append()--->在末尾添加元素
extend()--->列表的扩展和+号相似

--------------------------------------------
append和extend区别
a, b= [11,22,33], [44,55]
a.append(b)##################a.extend(b)
a = [11,22,33,[44,55]]######[11,22,33,44,55]
--------------------------------------------

insert()--->指定任何位置插入元素
pop()-->
copy()

reverse()
sort()

del list[0]--->删除指定的元素
clear()---->删除列表中所有的元素
remove()--->删除首次出现的指定元素
"""


""" 1. 列表中可以有不同种类的数据类型"""
name = ["Jim", "Tom", "Lily", 1, 2.3]
anothername = [100, "哈哈", {"value": "key"}, (1, 2, 3), [1, 2]]
print(name[0])

""" 2. 通过索引修改元素"""
name[0] = "Ji"
print(name)

""" 3. append()"""
name.append("Zhu")
print(name)

""" 4. insert()"""
name.insert(2, "XIE")
print(name)


"""5. del"""
del name[2]
print(name)

"""6. remove()"""
name.append("Ji")
name.remove("Ji")
print(name)

"""7. pop()"""
name.pop()
print(name)

"""8. index()"""
name.append("Tom")
print(name.index("Tom"))

"""9. +"""
print(name + anothername)
print(name)

"""10. extend()"""
name.extend(anothername)
print(name)


print(len(name))
