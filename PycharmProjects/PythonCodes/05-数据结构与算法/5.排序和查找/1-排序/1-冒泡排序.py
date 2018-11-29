def BubbleSort(arr):
    """冒泡排序"""
    for j in range(len(arr)-1, 0, -1):#后面的已排好序，不需遍历，所以j自减
        for i in range(j):#从0~j是无序的，需要排序
            if arr[i] > arr[i + 1]:#大的往后走
                arr[i], arr[i + 1] = arr[i + 1], arr[i]


arr = [54, 26, 93, 17, 31, 44, 55]
print(arr)
BubbleSort(arr)
print(arr)