from socket import *

updSocket = socket(AF_INET, SOCK_DGRAM)

#绑定端口号
updSocket.bind("", 7878)

updSocket.sendto(b"hello", ("192.168.19.1", 2426))