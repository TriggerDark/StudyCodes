from urllib import parse
from urllib.request import Request, urlopen
from bs4 import BeautifulSoup

url = "https://movie.douban.com/j/chart/top_list?type=11&interval_id=100%3A90&action"

headers = {
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.67 Safari/537.36"
}

formdate = {
    "start": "0",
    "limit": "20",
}

data = parse.urlencode(formdate).encode("utf-8")

request = Request(url, data=data, headers=headers)

bs = BeautifulSoup(urlopen(request).read(), "lxml")

print(bs.p)