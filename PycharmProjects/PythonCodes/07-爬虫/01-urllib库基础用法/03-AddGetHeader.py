from urllib.request import Request
import random


url = "http://www.baidu.com/"

"""User-Agent列表"""
ua_list = [
    "Mozilla/5.0 (Windows NT 10.0; …) Gecko/20100101 Firefox/63.0",
    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.67 Safari/537.36"
]

user_agent = random.choice(ua_list)

request = Request(url)
"""为request添加一个报头信息"""
request.add_header("User-Agent", user_agent)
"""返回一个报头信息"""
print(request.get_header("User-agent"))