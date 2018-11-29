class Account(object):
    def __init__(self, name, number, balance):
        super(Account, self).__init__()
        self.__name = name
        self.__number = number
        self.__balance = balance

    def deposit(self, amount):
        if amount < 0:
            print("存款不能为负！！！")
        else:
            self.__balance += amount

    def withdraw(self, amount):
        if amount > self.__balance:
            print("余额不足！！！")
        else:
            self.__balance -= amount

    def __str__(self):
        return "%s,%s,余额:%d" % (self.__name, self.__number, self.__balance)


def main():
    acct = Account("Justin", "123-456", 1000)
    #acct.__balance = 100#--->不会改变balance属性的值
    acct.deposit(10)
    acct.withdraw(100)
    acct.withdraw(100)
    print(acct)


if __name__ == "__main__":
    main()


"""
以__xxx表现的xxx属性，会自动转化为  _类名__xxx

"""