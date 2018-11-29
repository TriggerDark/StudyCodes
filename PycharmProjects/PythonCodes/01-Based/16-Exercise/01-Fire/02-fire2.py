class Person(object):
    """英雄"""

    def __init__(self, name):
        super(Person, self).__init__()
        self.name = name
        self.gun = None
        self.hp = 100

    def reloadingBullet(self, magazineClipTemp, bulletTemp):
        magazineClipTemp.appendBullet(bulletTemp)

    def reloadingMagazineClip(self, gunTemp, magazineClipTemp):
        gunTemp.appendmagazineClip(magazineClipTemp)

    def takeGun(self, gunTemp):
        self.gun = gunTemp

    def fireBullet(self, rivalTemp):
        self.gun.fire(rivalTemp)

    def dropOfBlood(self, lethality):
        self.hp -= lethality

    def __str__(self):
        if self.gun:
            return "%s的血量：%d, 有枪：%s" % (self.name, self.hp, self.gun)
        else:
            if self.hp > 0:
                return "%s的血量：%d, 没枪" % (self.name, self.hp)
            else:
                return "%s已挂。。。" % self.name

class Gun(object):
    """枪的种类"""

    def __init__(self, name):
        super(Gun, self).__init__()
        self.name = name
        self.magazineClip = None

    def appendmagazineClip(self, magazineClipTemp):
        self.magazineClip = magazineClipTemp

    def fire(self, rivalTemp):
        bulletTemp = self.magazineClip.poping()
        if bulletTemp:
            bulletTemp.hitRival(rivalTemp)
        else:
            print("没子弹。。。")

    def __str__(self):
        if self.magazineClip:
            return "枪的信息是：%s, 弹夹为：%s" % (self.name, self.magazineClip)
        else:
            return "枪的信息是：%s" % self.name

class MagazineClip(object):
    """弹夹的容量"""

    def __init__(self, containerMaxNum):
        super(MagazineClip, self).__init__()
        self.containerMaxNum = containerMaxNum
        self.magazineClip = []

    def appendBullet(self, bulletTemp):
        self.magazineClip.append(bulletTemp)

    def poping(self):
        if self.magazineClip:
            return self.magazineClip.pop()
        else:
            return None

    def __str__(self):
        return "弹夹的信息：%d/%d" % (len(self.magazineClip), self.containerMaxNum)

class Bullet(object):
    """子弹"""
    def __init__(self, lethality):
        super(Bullet, self).__init__()
        self.lethality = lethality

    def hitRival(self, rivalTemp):
        rivalTemp.dropOfBlood(self.lethality)

def main():
    # 1.创建Person对象
    Justin = Person("Justin")

    # 2.创建一个Gun对象
    ak47 = Gun("ak47")

    # 3.创建一个MagazineClip对象
    magazineClip = MagazineClip(20)

    # 4.创建一个Bullet对象
    bullet = Bullet(10)

    # 5.Justin把Bullet安装到MagazineClip
    for i in range(15):
        Justin.reloadingBullet(magazineClip, bullet)

    # 6.Justin把MagazineClip装到Gun里
    Justin.reloadingMagazineClip(ak47, magazineClip)

    # 7.Justin拿枪
    Justin.takeGun(ak47)

    # 8.创建一个Rival
    rival = Person("Rival")

    # 9.Justin开枪打敌人
    Justin.fireBullet(rival)
    print(Justin)
    print(rival)
    while True:
        Justin.fireBullet(rival)
        print(Justin)
        print(rival)
        if rival.hp == 0:
            break


if __name__ == "__main__":
    main()