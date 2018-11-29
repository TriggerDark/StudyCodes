"""
HTTPPasswordMgrWithDefaultRealm
这个类会创建一个密码管理对象，用来保存和请求相关的授权信息

1.ProxyBasicAuthHandler()授权代理处理器

2.HTTPBasicAuthHandler()验证web客户端的授权处理器
"""

import urllib.request

test = "test"

password = "123456"

webSever = ""

#构建一个密码管理对象，可以用来保存和HTTP请求相关的授权账户信息
passwordMgr = urllib.request.HTTPPasswordMgrWithDefaultRealm()

#添加授权账户信息， 第一个参数realm如果没有指定就写None，
#后三个分别是站点IP，账户和密码
passwordMgr.add_password(None, webSever, test, password)

#HTTPBasicAuthHandler()HTTP基础验证处理器类
httpauth_handler = urllib.request.HTTPBasicAuthHandler(passwordMgr)

#构建自定义opener
opener = urllib.request.build_opener(httpauth_handler)

request = urllib.request.Request("http://" + webSever)

#有授权验证信息
#response = opener.open(request)

#没有授权验证信息
response = urllib.request.urlopen(request)

print(response.read())