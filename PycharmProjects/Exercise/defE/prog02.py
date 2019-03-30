def isPrim(n):
    try:
        n = int(n)
        if n > 1:
            for i in range(2, n):
                if n % i == 0:
                    return False
        else:
            return False
    except:
        print("error")
        return False
    return True


if __name__ == "__main__":
    for i in range(1, 201):
        if isPrim(i):
            print(i)