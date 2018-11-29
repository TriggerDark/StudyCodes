from urllib.request import Request, urlopen
from bs4 import BeautifulSoup

#已经登录过的cookie
url = "http://www.renren.com/880792860/profile"

headers = {
    "Host": "www.renren.com",
    "Connection": "keep-alive",
    "Accept": "application/json, text/javascript, */*; q=0.01",
    "X-Requested-With": "XMLHttpRequest",
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.67 Safari/537.36",
    "Referer": "http://www.renren.com/968741288",
    "Accept-Language": "zh-CN,zh-HK;q=0.9,zh;q=0.8",
    "Cookie": "td_cookie=18446744071198927883; anonymid=joibf6cw-twzy0i; depovince=GW; _r01_=1; JSESSIONID=abc9Nz2rgfNiC7-_hBwCw; ick_login=fda7c783-9dd7-42ce-99fd-f7f002de8aaa; t=a43f343888e27940c09177c404391f588; societyguester=a43f343888e27940c09177c404391f588; id=968741288; xnsid=e9932286; ver=7.0; loginfrom=null; wp_fold=0; jebecookies=d996a5f0-1028-47c8-820d-c639102995ad|||||"
}
request = Request(url, headers=headers)
html = urlopen(request).read()
bsObj = BeautifulSoup(html, "lxml")
print(bsObj)