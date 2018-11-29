class Itcast(object):
    """docstring for Itcast"""

    def __init__(self, subject1):
        super(Itcast, self).__init__()
        self.subject1 = subject1
        self.subject2 = "cpp"

    # 属性访问时拦截器
    # 禁止使用self.show
    def __getattribute__(self, obj):
        print("====1>%s" % obj)
        if obj == "subject1":
            print("log subject1")
            return "redirect python"
        else:
            temp = object.__getattribute__(self, obj)
            print("====2>%s" % temp)
            return temp

    def show(self):
        print("this is Itcast")


s = Itcast("python")

print(s.subject1)
print(s.subject2)

s.show()
