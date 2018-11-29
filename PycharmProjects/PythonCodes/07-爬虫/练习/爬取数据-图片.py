from lxml import etree
import requests


class TuKu(object):#初始化
    #模拟浏览器来访问
     def __init__(self):
         self.header = {'User-Agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.15 Safari/537.36'}
         self.start_url = "http://tu.duowan.com/tu?offset={}"
         self.url = []
         for i in range(10):
             url = self.start_url.format(i * 30)
             self.url.append(url)

     def get_xpath(self,url):#进行解析xpath
         ret = requests.get(url,self.header)
         html = etree.HTML(ret.content)
         html_content = html.xpath("//ul[@id='pic-list']/li/a/img/@src")
         for html_pic in html_content:
             with open("png/{}".format(html_pic[-10:]),'ab') as fp:
                 ret = requests.get(html_pic)
                 fp.write(ret.content)

     def run(self):
         for url in self.url:
             self.get_xpath(url)

if __name__=="__main__":


    tuku = TuKu()
    tuku.run()
