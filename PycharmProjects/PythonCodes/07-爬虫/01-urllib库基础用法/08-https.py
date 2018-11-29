import ssl
from urllib.request import Request, urlopen


"""忽略ssl安全认证"""
context = ssl._create_unverified_context()

url = "https://www.12306.cn/"

request = Request(url)

response = urlopen(request, context=context)

print(response.read())