"""

split()--->切割
splitlines("hello\nworld")-->按行(\n)切割

rstrip()--->删除字符串右侧末尾的空格(可自己定义删除的字符)
lsrtip()--->删除字符串左侧末尾的空格
strip()---->删除字符串两侧末尾的空格

center(num)--->在总长度为num的字符串中居中放置
ljust(num)
rjust(num)

find()--->从左往右查找
rfind()--->从右往左查找

index()---->与find相似
rindex()

capitalize()--->和title一样
title()---->以首字母大写的方式显示每个单词
upper()---->转换字符串中的小写为大写
lower()---->转换字符串中的大写为小写

len(string) --> 返回字符串的长度
max(str)/min(str) --> 返回str中最大/最小的字母
replace(old, new [,max]) --> 将字符串中的old替换为new
                             如果max指定，则替换不超过max次

str.count(sub)--->str中sub出现的次数

endwith()---->可用于检测文件拓展名
startwith(obj[,beg=0][,end=4])
检查字符串是否由obj开头，返回True和false
如果beg和end指定值，则指定在范围内检查

"=".join(str)--->拼接为a=b

"""

name = "john smitH"
print(name.title())  # John Smith
print(name.upper())  # JOHN SMITH
print(name.lower())  # john smith

language = "  python  "
print(language.rstrip())
print(language.lstrip())
print(language.strip())
print(len(language))
print(max(language))

nu = "abc"
print(min(nu))

test = "  python**"
print(test.lstrip().rstrip("*"))


repalced = "I love love like like like python"
print(repalced.replace("like", "love", 1))
print(repalced.startswith("I", 0))
print(repalced.startswith("I", 1))
