import re

s = r'\nabc'
print(s)

print(re.match(r'\\nabc', s).group())