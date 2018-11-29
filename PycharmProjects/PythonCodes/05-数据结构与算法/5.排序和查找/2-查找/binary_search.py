def binary_search(alist, item):
    n = len(alist)
    mid = n // 2
    if n > 0:
        if alist[mid] == item:
            return True
        elif alist[mid] > item:
            return binary_search(alist[0:mid], item)
        else:
            return binary_search(alist[mid+1:], item)
    return False


def binary_search_2(alist, item):
    n = len(alist)
    first = 0
    last = n-1
    while first <= last:
        mid = (first + last) // 2
        if item == alist[mid]:
            return True
        elif item < alist[mid]:
            last = mid - 1
        else:
            first = mid + 1
    return False



def main():
    li = [1, 3, 4, 6, 7, 14, 19, 20]
    # print(binary_search(li, 19))
    # print(binary_search(li, 100))
    print(binary_search_2(li, 19))
    print(binary_search_2(li, 100))


if __name__ == '__main__':
    main()