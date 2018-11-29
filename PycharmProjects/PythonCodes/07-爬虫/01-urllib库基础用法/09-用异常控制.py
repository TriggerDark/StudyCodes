from urllib.request import urlopen
from urllib.error import HTTPError
from bs4 import BeautifulSoup

# html = urlopen("https://www.baidu.com/")
# bsObj = BeautifulSoup(html)

# print(bsObj)


def getURL(url):
    try:
        html = urlopen(url)
    except HTTPError as e:
        return None
    try:
        bsObj = BeautifulSoup(html.read(), "lxml")
        title = bsObj.body
    except AttributeError as e:
        return None
    return title


title = getURL("https://www.baidu.com/")
if title == None:
    print("Title was not found")
else:
    print(title)
