x = 10

def outer():
    y = 20

    def inner():
        z = 30
        print("- x = ", x)
        print("- y = ", y)
        print("- z = ", z)

    inner()

    print("-- x = ", x)
    print("-- y = ", y)

outer()
print("--- x = ", x)