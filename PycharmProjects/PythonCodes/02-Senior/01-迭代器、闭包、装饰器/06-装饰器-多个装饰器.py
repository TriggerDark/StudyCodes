def makeBold(fn):
    print("---正在装饰1---")
    def wrapped():
        print("---1---")
        return "<b>" + fn() + "</b>"
    return wrapped


def makeItalic(fn):
    print("---正在装饰2---")
    def wrapped():
        print("---2---")
        return "<i>" + fn() + "</i>"
    return wrapped


@makeBold
@makeItalic
def test():
    print("---3---")
    return "Hello World"


ret = test()
print(ret)
"""
result
---正在装饰2---
---正在装饰1---
---1---
---2---
---3---
<b><i>Hello World</i></b>

test --> makeBold(test)中"test()"传递给
makeItalic(test)执行"test()"
"""