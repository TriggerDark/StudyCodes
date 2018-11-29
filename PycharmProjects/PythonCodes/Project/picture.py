from lxml import etree
import requests

class TuKu(object):#初始化
     def __init__(self):
         self.header = {'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) '
        'AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.15 Safari/537.36'}
         self.start_url = "https://www.qidian.com/all?chanId=21&subCateId=73&orderId=" \
        "&style=1&pageSize=20&siteid=1&pubflag=0&hiddenField=0&page={}"
         self.url = []
         j = 0
         for x in range(1,6):
            url = self.start_url.format(x)
            self.url.append(url)
            ret = requests.get(url, self.header)
            html = etree.HTML(ret.content)
            html_content = html.xpath("//ul/li/div/a/img/@src")
            for html_pic in html_content:
                html_pic = 'http:' + html_pic + '.jpg'
                j = j + 1
                with open('png1/' + str(j) + '.jpg', 'wb') as fp:
                    ret = requests.get(html_pic)
                    fp.write(ret.content)

if __name__=="__main__":
    tuku = TuKu()