from socket import *

updSocket = socket(AF_INET, SOCK_DGRAM)

updSocket.bind("", 7878)

recvData = updSocket.recvfrom(1024)

print(recvData[0].decode("utf-8"))