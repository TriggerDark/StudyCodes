class CarStore:
    def select_car_type(self, car_type):
        return order(car_type)


def order(car_type):
    if car_type == "A":
       return A()
    elif car_type == "B":
       return B()
    elif car_type == "c":
        return C()


class Car(object):
    def move(self):
        print("车在移动")

    def music(self):
        print("车在放音乐")

class A(Car):
    pass

class B(Car):
    pass

class C(Car):
    pass

def main():
    car = CarStore()
    a = car.select_car_type("A")
    a.move()


if __name__ == '__main__':
    main()