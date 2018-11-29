from urllib.request import HTTPHandler, build_opener, Request, urlopen


#构建一个HTTPHandler处理器对象，支持处理HTTP的请求
#http_handlder = HTTPHandler()

#在HTTPHandler增加debuglevel=1，将会自动执行Debug log模式
#程序在执行的时候会打印收发包的信息
http_handlder = HTTPHandler(debuglevel=1)

#调用build_opener()方法构建一个自动定义的opener对象，参数是构建的处理器对象
opener = build_opener(http_handlder)

request = Request("http://www.baidu.com")

response = opener.open(request)

print(response.read())