from requests_html import HTMLSession
import time
"""
requests_html(网络请求+网络请求)-->3.6+(2.7)
requests(http网络请求库)+bs4(正则,xpath)
"""

session = HTMLSession()#构造实例对象

#https://www.qiushibaike.com/text/
#此函数功能获取栏目最大分页数


def get_page(url):#url--->文字栏所对应的目标URL
    r = session.get(url)
    max_page = r.html.find("ul.pagination>li")[-2].text
    return max_page

#获取数据,存储数据


def write_file(filename, start_url, page):
    with open(filename, "w", encoding="utf-8") as file:
        #多页处理
        for num in range(1, page + 1):
            url = start_url + "/page/%s" % num
            print(url)
            r = session.get(url)
            content_list = r.html.find("div.content>span")
            file.write(filename[:-4] + "第%s页" % num + "\n"*2)
            for content in content_list:
                if content.text == "查看全文":
                    continue
                file.write(content.text)
            file.write("\n"*3)
            time.sleep(3)


def get_file():
    url_list = [
        "https://www.qiushibaike.com/text"
    ]
    name_list = [
        "糗事百科文字栏目笑话.txt"
    ]
    for url, name in zip(url_list, name_list):
        #最大page
        page = int(get_page(url))
        print("一共%s页" % page)
        write_file(name, url, page)
        time.sleep(1)


if __name__ == "__main__":
    get_file()