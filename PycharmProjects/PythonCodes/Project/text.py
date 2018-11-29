from lxml import etree
import requests
import json
import time

def getOnePage(url):
    header ={'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) '
                           'Chrome/68.0.3440.15 Safari/537.36'}
    html = requests.get(url,headers=header)
    return html.text

def parseOnePage(text):
    html = etree.HTML(text)
    bookname = html.xpath('//ul/li/div/h4/a/text()')
    author = html.xpath('//div/ul/li/div[2]/p[1]/a[1]//text()')
    classify = html.xpath('//ul/li/div[2]/p[1]/a[2]//text()')
    gosubtype = html.xpath('//div/p/a[@class="go-sub-type"]//text()')
    publish = html.xpath('//ul/li/div[2]/p[1]/span//text()')
    intro = html.xpath('//div/p[@class="intro"]//text()')

    for item in range(len(bookname)):
        yield{
            'item': item,
            'bookname':bookname[item].strip(),
            'author':author[item].strip(),
            'classify':classify[item].strip(),
            'gosubtype':gosubtype[item].strip(),
            'publish':publish[item].strip(),
            'intro':intro[item].strip()
        }
def writeToFile(content):
    with open(r'data.txt','a',encoding='utf-8') as fp:
        fp.write(json.dumps(content,ensure_ascii=False)+'\n')

def main():
    for offest in range(1,6):
        time.sleep(1)
        url="https://www.qidian.com/all?chanId=21&subCateId=73&orderId=&style=1" \
            "&pageSize=20&siteid=1&pubflag=0&hiddenField=0&page={}".format(offest)
        text = getOnePage(url)
        for item in parseOnePage(text):
            writeToFile(item)
            print(item)

if __name__=="__main__":
    main()