class Cat(object):

    def __init__(self, name, birthday):
        self.name = name
        self.birthday = birthday

    def __eq__(self, other):
        if self is other:
            return True

        if hasattr(other, 'name') and hasattr(other, 'birthday'):
            return self.name == other.name and self.birthday == other.birthday

        return False


cat = Cat("Kitty", 10)
print(cat.__eq__(Cat))
print(cat.__eq__(cat))