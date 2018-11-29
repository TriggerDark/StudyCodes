def upper_attr(future_class_name, future_class_object, future_class_attr):
    newAttr = {}
    for name, value in future_class_attr.items():
        if not name.startswith("__"):
            newAttr[name.upper()] = value

    return type(future_class_name, future_class_object, newAttr)


class Foo(object, metaclass=upper_attr):
    #__meta__class = upper_attr Python2用法
    bar = "bip"


print(hasattr(Foo, "bar"))
print(hasattr(Foo, "BAR"))

f = Foo()
print(f.BAR)
print(f.bar)
