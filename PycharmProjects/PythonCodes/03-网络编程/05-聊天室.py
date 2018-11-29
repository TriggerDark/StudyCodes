from socket import  *
def main():
    udpSocket = socket(AF_INET, SOCK_DGRAM)

    bindAddr = ("", 6789)
    
    udpSocket.bind(bindAddr)
    #收取信息，并且打印
    while True:
        recvData = udpSocket.recvfrom(1024)
        print("[%s]: %s" % (recvData[1], recvData[0].decode("utf-8")))


if __name__ == "__main__":
    main()