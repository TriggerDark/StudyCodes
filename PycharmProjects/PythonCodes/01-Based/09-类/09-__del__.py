import sys

class Dog:
    def __del__(self):
        print("---del---")


dog1 = Dog()
print(sys.getrefcount(dog1))
dog1 = None
print(sys.getrefcount(dog1))