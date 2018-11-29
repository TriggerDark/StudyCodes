"""
Py2
Cookielib模块：主要作用是提供用于存储cookie的对象
HTTPCookieProcessor处理器：主要作用是处理这些cookie对象，并构建Handler对象

Cookielib库：
    CookieJar
    FileCookieJar
    MozillaCookieJar
    LWPCookieJar

Py3
http.cookieJar
"""
from urllib.request import Request, HTTPCookieProcessor, build_opener
from http import cookiejar
from urllib.parse import urlencode

#保存cookie的值
cookie = cookiejar()

#处理cookie
cookie_handler = HTTPCookieProcessor(cookie)
opener = build_opener(cookie_handler)

opener.addheaders = [("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.67 Safari/537.36")]
url = ""

data = {
    "email": "",
    "password": ""
}

data = urlencode(data)

request = Request(url, data=data)

response = open(request)

print(response.read())
