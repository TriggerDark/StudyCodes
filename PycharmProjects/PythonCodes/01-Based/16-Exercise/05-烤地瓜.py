class sweetPaoto:
    def __init__(self):
        self.state = "生的"
        self.cookedLevel = 0
        self.container = []

    def cooked(self, cookedTime):
        self.cookedLevel += cookedTime

        if 0 < self.cookedLevel <= 3:
            self.state = "不熟"
        elif 3 < self.cookedLevel <= 6:
            self.state = "可以吃了"
        else:
            self.state = "糊了"

    def add_items(self, item):
        self.container.append(item)

    def __str__(self):
        return "土豆的状态:%s(%d),佐料有:%s" % (self.state, self.cookedLevel, self.container)


sp = sweetPaoto()
sp.cooked(1)
print(sp)
sp.cooked(1)
print(sp)
sp.add_items("洋葱")
sp.cooked(1)
print(sp)
sp.cooked(1)
print(sp)
sp.add_items("孜然")
sp.cooked(1)
print(sp)
sp.add_items("盐巴")
sp.cooked(1)
print(sp)
sp.cooked(1)
print(sp)