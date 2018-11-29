import sys

name = "guest"
if len(sys.argv) > 1:
    name = sys.argv[1]
"""
sys.argv[0]--->代码的默认路径名
sys.argv[1]--->python 01-if.py ji 会把ji传给name
"""
print("hello, {}".format(name))