import socket

#tcp套接字
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

#udp套接字
#s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

print("Socket Created")