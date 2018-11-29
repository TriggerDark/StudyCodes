class Account(object):
    def __init__(self, name, number, balance):
        super(Account, self).__init__()
        self.name = name
        self.number = number
        self.balance = balance

    def deposit(self, amount):
        if amount < 0:
            print("存款不能为负！！！")
        else:
            self.balance += amount

    def withdraw(self, amount):
        if amount > self.balance:
            print("余额不足！！！")
        else:
            self.balance -= amount

    def __str__(self):
        return "%s,%s,余额:%d" % (self.name, self.number, self.balance)


def main():
    acct = Account("Justin", "123-456", 1000)
    deposit = acct.deposit
    withdraw = acct.withdraw
    deposit(10)
    withdraw(100)
    print(acct)


if __name__ == "__main__":
    main()