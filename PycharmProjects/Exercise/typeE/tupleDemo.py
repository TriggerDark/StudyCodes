if __name__ == '__main__':
    t = (1, 2, 3, 1)
    # print(t.count(1))
    # print(t.index(2))
    # print(len(t))
    # print(max(t))
    # print(min(t))
    # print(t[1:2])

    # for i in t:
    #     print(i)

    def num(x, *args, **kwargs):
        return x, args, kwargs

    tt = num(2, 1, 2, 3, 3, [1, 2])
    print(tt)