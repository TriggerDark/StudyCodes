class Person(object):
    def __getattribute__(self, obj):
        print("---test---%s" % obj)
        if obj.startswith("a"):
            return "haha"

        else:
            return self.test

    def test(self):
        print("heihei")


t = Person()

print(t.a)
#print(t.b)
