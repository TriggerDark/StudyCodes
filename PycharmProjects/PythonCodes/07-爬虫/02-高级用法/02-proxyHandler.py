from urllib.request import ProxyHandler, build_opener, install_opener, Request, urlopen
from bs4 import BeautifulSoup

#代理开关，表示是否启用代理
#proxyswitch = True
proxyswitch = False

#创建一个Handler处理器对象，参数是一个字典类型，包括代理类型和代理服务器的IP+PROT
http_proxyHandler = ProxyHandler({"http": "61.135.155.82:443"})
"""私密代理：账户:密码@IP+PROT"""

#创建一个没有代理的处理器对象
null_proxyHandler = ProxyHandler()

if proxyswitch:
    opener = build_opener(http_proxyHandler)
else:
    opener = build_opener(null_proxyHandler)

#构建一个全局的opener，之后所有请求都可以使用urlopen方式发送，也附带Handler
install_opener(opener)

request = Request("http://www.baidu.com/")

response = urlopen(request)

print(response.read().decode("utf-8"))