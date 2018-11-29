"""
LEGB规则
locals->enclosing function->globals->builtin
"""
x = 100

def outer():
    y = 200
    def inner():
        z = 300
        print("inner locals", locals())

    inner()

    print("outer locals", locals())

outer()