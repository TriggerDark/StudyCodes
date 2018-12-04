# encoding=utf-8
# iWebShop 谷歌浏览器打开 最大化窗口 登录 浏览商品 搜索商品 点击商品 添加购物车

from selenium import webdriver
from time import sleep
from selenium.webdriver import ActionChains
from selenium.webdriver.support.wait import WebDriverWait


# 打开iWebShop网站
def open_browser():
    global browser
    # 用来获取谷歌浏览器的访问驱动
    browser = webdriver.Chrome(executable_path='c:\driver\chromedriver')
    # url指的是本地iWebShop网页存放路径，本地回环地址访问Apache服务器
    url = 'http://localhost:80/iwebshop/'
    browser.get(url)
    # 浏览器最大化窗口
    browser.maximize_window()
    sleep(3)


# 登录
def login():
    # 找到字样为‘登录’的对象，然后点击
    browser.find_element_by_link_text(u'登录').click()
    sleep(2)
    browser.find_element_by_name('login_info').send_keys('jihaitao')
    sleep(2)
    browser.find_element_by_name('password').send_keys('123456')
    sleep(1)
    browser.find_element_by_xpath('//input[@type="checkbox"]').click()
    browser.find_element_by_class_name('input_submit').click()


# 浏览商品
def browser_products():
    global browser
    sleep(1)
    # 模拟鼠标操作
    # 对于browser浏览器每个0.2s找一次后面‘全部商品’元素是否存在，最多找5s
    all_products = WebDriverWait(browser, 10, 2).until(lambda x: x.find_element_by_link_text(u'全部商品').is_displayed())
    # 包装设计模型
    element1 = browser.find_element_by_link_text(u'全部商品')
    ActionChains(browser).move_to_element(element1).perform()
    sleep(2)

    element2 = browser.find_element_by_link_text(u'家用电器')
    ActionChains(browser).move_to_element(element2).perform()
    sleep(2)

    element3 = WebDriverWait(browser, 10, 2).until(lambda x: x.find_element_by_xpath('//li[1]/div[2]/ul[1]/li[1]/a[1]'))
    element3.click()


def search_product():
    browser.find_element_by_name('word').send_keys(u'索尼（SONY）KDL-50W700B 50英寸全高清LED液晶电视（银色）')
    browser.find_element_by_class_name('search_submit').click()
    sleep(2)
    browser.find_element_by_xpath('//section[2]/section/section[2]/ul/li[1]').click()


def shopping():
    global browser
    # 获取当前页面数
    handles = browser.window_handles
    # 窗口切换，切换为新打开的窗口
    browser.switch_to_window(handles[-1])
    # 加入购物车
    browser.find_element_by_id('joinCarButton').click()
    sleep(1)


def accounts():
    global browser
    # 点击购物车图标
    element = WebDriverWait(browser, 5, 0.2).until(lambda x: x.find_element_by_class_name('header_cart'))
    element.click()
    # 去结算
    browser.find_element_by_link_text(u'去结算').click()
    # 添加收货地址
    browser.find_element_by_xpath("//*[@id='addressBox']/div/ul/li/label/a").click()

    browser.switch_to_frame('OpenaddressWindow')
    # 填写信息
    browser.find_element_by_xpath("//input[@name='accept_name']").send_keys("张三")
    m = browser.find_element_by_xpath("//select[@name='province']")
    m.find_element_by_xpath("//option[@value='110000']").click()

    x1 = browser.find_element_by_xpath("//select[@name='city']")
    x1.find_element_by_xpath("//option[@value='110100']").click()

    x2 = browser.find_element_by_xpath("//select[@name='area']")
    x2.find_element_by_xpath("//option[@value='110102']").click()

    sleep(1)

    browser.find_element_by_xpath("//input[@name='address']").send_keys("北京大学")
    browser.find_element_by_xpath("//input[@name='mobile']").send_keys("15162609660")
    browser.find_element_by_xpath("//input[@name='telphone']").send_keys("0516-88888888")
    browser.find_element_by_xpath("//input[@name='zip']").send_keys("110000")

    browser.switch_to.default_content()
    browser.find_element_by_xpath("//button[@type='button']").click()


def main():
    open_browser()
    login()
    browser_products()
    search_product()
    shopping()
    accounts()


if __name__ == '__main__':
    main()