import re
"""
导入re模块
import re
使用match方法进行匹配
result = re.match(正则表达式，要匹配的字符串)
返回字符串数据
result.group()
"""

print(re.match('itcast', "itcasthiema").group())

"""1-."""
print(re.match('.','i').group())
print(re.match('.','ij').group())
print(re.match('..','ij').group())

"""2-\d \D"""
print(re.match('\d', '1').group())
print(re.match('\d', 's'))
print(re.match('\D', 'S').group())

"""3-\s \S"""
print(re.match('\s', '\t\n\x0B\f\r').group())
print(re.match('\S', 'hah').group())

"""4-\w \W"""
print(re.match('\w+', '1_pp').group())
print(re.match('\W+', '--').group())

"""findall"""
print(re.findall('.*?foo', 'xfooxxxxxfoo'))
