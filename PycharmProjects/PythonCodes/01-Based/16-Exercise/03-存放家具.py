# 1. 建立一个Home类 包含房子的户型，所在地，面积，拥有的家具...
class Home:
    def __init__(self, info, location, area):
        self.info = info
        self.location = location
        self.total_area = area
        self.left_area = area
        self.container = []

    #输出基本元素
    def __str__(self):
        return "房子的类型:%s,所在地:%s,面积：%s平方米,剩余面积:%s平方米,现在房子里面有:%s" % \
               (self.info, self.location, self.total_area, self.left_area, str(self.container))

    def __repr__(self):
        return self.__str__()

    #向房子中添加物品
    def add_item(self, item):
        self.left_area -= item.getArea()
        self.container.append(item.getCharacter())

# 2. 家具的种类，家具的各个属性
class Beds:
    def __init__(self, character, area):
        self.character = character
        self.area = area

    def getCharacter(self):
        return self.character

    def getArea(self):
        return self.area


home = Home("三室一厅", "泰州", 150)
bed = Beds("席梦子", 12)
bed2 = Beds("席梦子", 12)
home.add_item(bed)
home.add_item(bed2)
print(home)