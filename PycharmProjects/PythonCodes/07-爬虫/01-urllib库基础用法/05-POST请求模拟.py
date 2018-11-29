from urllib.request import Request, urlopen
from urllib import parse

url = "http://fanyi.youdao.com/translate_o?smartresult=dict&smartresult=rule"


headers = {
    "Accept": "application/json, text/javascript, */*; q=0.01",
    "X-Requested-With": "XMLHttpRequest",
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.67 Safari/537.36",
    "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
    "Accept-Language": "zh-CN,zh-HK;q=0.9,zh;q=0.8"
}

key = input("请输入要翻译的文字：")
formdata = {
    "i": key,
    "from": "AUTO",
    "to": "AUTO",
    "smartresult": "dict",
    "client": "fanyideskweb",
    "doctype": "json",
    "version": "2.1",
    "keyfrom": "fanyi.web",
    "action": "FY_BY_REALTIME",
    "typoResult": "false"
}

data = parse.urlencode(formdata).encode(encoding='UTF-8')
print(data)

request = Request(url, data=data, headers=headers)
result = urlopen(request).read()
print(result)