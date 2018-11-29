from urllib import parse
from urllib.request import Request, urlopen


def loadPage(url, filename):
    """
    作用：根据url发送请求，获取服务器响应文件
    url: 需要爬取的url地址
    filename: 处理的文件名
    """
    ua_headers = {
        "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.67 Safari/537.36"
    }
    print("正在下载" + filename)
    request = Request(url, headers=ua_headers)
    return urlopen(request).read()



def writePage(html, filename):
    """
    作用：将html内容写入文件
    html: 服务器响应的文件内容
    """
    print("正在保存" + filename)
    with open(filename, "w") as f:
        f.write(str(html))

    print("-"*30)

def Spider(url, beginPage, endPage):
    """
    作用：贴吧爬虫调度器，负责组合处理每个页面的url
    url: 贴吧url的前部分
    beginPage: 起始页面
    endPage: 结束页面
    """
    for page in range(beginPage, endPage + 1):
        pn = (page - 1)*50
        fullurl = url + "&pn=" + str(pn)
        filename = "第" + str(page) + "页.html"
        html = loadPage(fullurl, filename)
        writePage(html, filename)

    print("谢谢使用")

if __name__ == "__main__":
    kw = input("请输入贴吧名：")
    beginPage = int(input("请输入起始页："))
    endPage = int(input("请输入结束页："))

    url = "http://tieba.baidu.com/f?"
    kw = parse.urlencode({"kw": kw})
    fullurl = url + kw
    Spider(fullurl, beginPage, endPage)