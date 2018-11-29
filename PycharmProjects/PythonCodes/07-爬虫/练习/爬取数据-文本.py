from lxml import etree
import requests
import json
import time

def getOnePage(url):
    header ={'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.15 Safari/537.36'}
    html = requests.get(url,headers=header)
    return html.text

def parseOnePage(text):
    html = etree.HTML(text)
    name = html.xpath('//p[@class="name"]//text()')
    star = html.xpath('//p[@class="star"]//text()')
    releaseTime = html.xpath('//p[@class="releasetime"]//text()')

    for item in range(len(name)):
        yield{
            'item':item,
            'name':name[item],
            'star':star[item].strip(),
            'releasetime':releaseTime[item]
        }

def writeToFile(content):
    with open(r'data.txt','a',encoding='utf-8') as fp:
        fp.write(json.dumps(content,ensure_ascii=False)+'\n')

def main():
    for offest in range(10):
        time.sleep(1)
        url="http://maoyan.com/board/4?offset={}".format(offest * 10)
        text = getOnePage(url)
        for item in parseOnePage(text):
            writeToFile(item)
            print(item)

if __name__=="__main__":
    main()