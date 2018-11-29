def quickSort(data, start, end):
    if start >= end:
        return 0
    index = partition(data, start, end)

    quickSort(data, start, index - 1)
    quickSort(data, index + 1, end)


def partition(data, start, end):
    left = start
    index = start
    right = end
    pivot = data[start]

    while right >= left:
        #从右向左移
        while right >= left:
            if data[right] < pivot:
                data[index] = data[right]
                index = right
                left += 1
                break
            right -= 1
        #从左往右移
        while right >= left:
            if data[left] > pivot:
                data[index] = data[left]
                index = left
                right -= 1
                break
            left += 1
    data[index] = pivot
    return index

def main():
    data = [3, 8, 5, 4, 2, 6, 1, 7]
    quickSort(data, 0, len(data)-1)
    print(data)

if __name__ == '__main__':
    main()