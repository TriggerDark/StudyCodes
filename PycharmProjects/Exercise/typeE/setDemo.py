if __name__ == '__main__':
    s = set()
    s.add(111)
    s.add(11)
    print(s)
    try:
        s.remove(11)
        print(s)
        s.clear()
        print(s)
    except:
        print("error")


    s1 = {1, 2, 3}
    s2 = {2, 3, 4}
    print(s1-s2)
    print(s1&s2)
    print(s1|s2)
    print(s1^s2)
    print(len(s1))