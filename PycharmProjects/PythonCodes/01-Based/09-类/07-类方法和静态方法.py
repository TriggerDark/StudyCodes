class Account:
    def __init__(self, name, number, balance):
        self.name = name
        self.number = number
        self.balance = balance

    @staticmethod#不需要加self
    def default(name, number):
        return Account(name, number, 100)

    @classmethod
    def defau(cls, name, number):
        return cls(name, number, balance=100)

    def __str__(self):
        return "%s, %s, %d"%(self.name, self.number, self.balance)


acct = Account("Justin", "123-455", 1000)
print(acct)
print(acct.defau())