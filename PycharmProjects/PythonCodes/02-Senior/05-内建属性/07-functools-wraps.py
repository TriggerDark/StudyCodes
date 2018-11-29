import functools


def note(func):
    "note function"

    @functools.wraps(func)
    def wrapper():
        "wrapper function"
        print("note something")
        return func()

    return wrapper


@note
def test():
    "test function"
    print("I am test")


# 1
test()
print(test.__doc__)

# 2
# print(help(test))
