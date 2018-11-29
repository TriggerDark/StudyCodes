def quickSort(data, start, end):
    if start >= end:
        return 0
    index = partition(data, start, end)

    quickSort(data, start, index - 1)
    quickSort(data, index + 1, end)

    return data


def partition(data, start, end):
    left = start
    right = end
    pivot = data[start]
    index = start

    while right >= left:
        while right >= left:
            if data[right][3] > pivot[3]:
                data[index] = data[right]
                index = right
                left += 1
                break
            right -= 1

        while right >= left:
            if data[left][3] < pivot[3]:
                data[index] = data[left]
                index = left
                right -= 1
                break
            left += 1

    data[index] = pivot
    return index

def main():
    data = [[3, 8, 5, '3.1'], [4, 2, 6, '1.21'], [1, 7, 1, '2.13']]
    f = quickSort(data, 0, len(data)-1)
    print(f)

if __name__ == '__main__':
    main()