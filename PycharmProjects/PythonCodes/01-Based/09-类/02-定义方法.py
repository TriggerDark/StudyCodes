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
            print("余额为%d" % self.balance)

    def withdraw(self, amount):
        if amount > self.balance:
            print("余额不足！！！")
        else:
            self.balance -= amount
            print("余额为%d" % self.balance)


def main():
    acc = Account("Justin", "123-456", 1000)
    acc.deposit(10)
    acc.withdraw(100)


if __name__ == "__main__":
    main()