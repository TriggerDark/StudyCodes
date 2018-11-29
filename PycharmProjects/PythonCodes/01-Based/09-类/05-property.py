class Account(object):
    def __init__(self):
        self.__num = 100

    @property
    def num(self):
        return self.__num


    @num.setter
    def num(self, num):
        self.__num = num

    def __str__(self):
        return "%d"% self.__num

    #num = property(getnum, setnum)

acct = Account()
acct.num = 10
print(acct.num)
print(acct)