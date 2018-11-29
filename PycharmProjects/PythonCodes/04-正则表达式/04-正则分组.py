import re

"""匹配0-100的数字"""
print(re.match(r'[1-9]?\d?$|100$', '100'))

""""""
