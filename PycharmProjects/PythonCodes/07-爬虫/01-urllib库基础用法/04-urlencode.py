from urllib import parse
from urllib.request import urlopen, Request
from bs4 import BeautifulSoup

url = "http://www.baidu.com/s"

headers = {
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.67 Safari/537.36"
}

keyword = input("请输入需要查询的关键字")

wd = {"wd": keyword}

"""通过parse.urlencode()参数是一个dict类型，把：变成=
如 wd=%E4%BC%A0%E6%99%BA%E6%92%AD%E5%AE%A2
"""
wd = parse.urlencode(wd)

funurl = url + "?" + wd

print(funurl)
request = Request(funurl, headers = headers)

bs = BeautifulSoup(urlopen(request).read(), "lxml")
print(bs)