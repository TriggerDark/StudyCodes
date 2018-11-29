from socket import *
from threading import Thread


#1.收数据，然后打印
def recvData():
    while True:
        recvData = udpSocket.recvfrom(1024)
        print(">>%s:%s" % (str(recvData[1]), recvData[0].decode("utf-8")))


#2.检测键盘，发数据
def sendData():
    while True:
        sendInfo = input("<<")
        udpSocket.sendto(sendInfo.encode("utf-8"), (testIp, testPort))


udpSocket = None
testIp = ""
testPort = 0

def main():

    global udpSocket
    global testIp
    global testPort

    testIp = input("对方的IP:")
    testPort = input("对方的Port:")

    udpSocket = socket(AF_INET, SOCK_DGRAM)

    localport = int(input("请输入本地端口："))
    udpSocket.bind(("", localport))

    tr = Thread(target=recvData)
    ts = Thread(target=sendData)

    tr.start()
    ts.start()

    tr.join()
    ts.join()


if __name__ == "__main__":
    main()