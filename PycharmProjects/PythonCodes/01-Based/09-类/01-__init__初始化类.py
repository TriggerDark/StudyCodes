class Account(object):
    def __init__(self, name, number, balance):
        super(Account, self).__init__()
        self.name = name
        self.number = number
        self.balance = balance

acc = Account("Justin", "123-456", 1000)