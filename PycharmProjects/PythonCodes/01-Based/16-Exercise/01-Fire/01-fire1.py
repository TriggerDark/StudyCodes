class Person(object):
    """英雄"""
    def __init__(self, name):
        super(Person, self).__init__()
        self.name = name

    def reloadingBullet(self, magazineClipTemp, bulletTemp):
        pass


class Gun(object):
    """枪的种类"""
    def __init__(self, name):
        super(Gun, self).__init__()
        self.name = name


class MagazineClip(object):
    """弹夹的容量"""
    def __init__(self, containerMaxNum):
        super(MagazineClip, self).__init__()
        self.containerMaxNum = containerMaxNum


class Bullet(object):
    def __init__(self, lethality):
        super(Bullet, self).__init__()
        self.lethality = lethality


def main():

    #1.创建Person对象
    Justin = Person("Justin")

    #2.创建一个Gun对象
    ak47 = Gun("ak47")

    #3.创建一个MagazineClip对象
    magazineClip = MagazineClip(20)

    #4.创建一个Bullet对象
    bullet = Bullet(10)

    #5.Justin把Bullet安装到MagazineClip
    Justin.reloadingBullet(magazineClip, bullet)

    #6.Justin把MagazineClip装到Gun里

    #7.Justin拿枪
    #8.创建一个Rival
    #9.Justin开枪打敌人

if __name__ == "__main__":
    main()