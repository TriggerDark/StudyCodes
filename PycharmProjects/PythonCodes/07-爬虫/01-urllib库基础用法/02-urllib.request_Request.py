from urllib.request import urlopen
from urllib.request import Request

"""User-Agent是爬虫和反爬虫的第一步(报头信息)"""
ua_headers = {
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.67 Safari/537.36"
}


"""通过Request()方法构造一个请求对象"""
request = Request("http://www.baidu.com/", headers = ua_headers)

"""向指定的url地址发送请求，并返回服务器响应的类文件对象"""
response = urlopen(request)

"""
服务器返回的类文件对象支持Python文件对象的操作方法
read()方法就是读取文件里的内容，放回字符串
"""
html = response.read()

"""打印响应内容"""
#print(html)

"""返回HTTP的响应码，成功返回2xx, 4服务器页面出错"""
print(response.getcode())
"""返回实际数据的url，放置重定向问题"""
print(response.geturl())
"""返回服务器响应的HTTP报头"""
print(response.info())