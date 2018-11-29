from socket import *

#1. 创建套接字

updSocket = socket(AF_INET, SOCK_DGRAM)

#2. 准备接收方的地址
sendAddress = ('192.168.19.1', 8000)

#3. 从键盘获取数据
sendData = input("请输入要发送的数据：")

#4. 发送数据到指定的电脑
updSocket.sendto(sendData.encode("utf-8"), sendAddress)

#5. 关闭套接字
updSocket.close()