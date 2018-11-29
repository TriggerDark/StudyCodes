def SelectSort(arr):
    for j in range(len(arr) - 1):
        index = j
        for i in range(index + 1, len(arr)):
            if arr[index] > arr[i]:#选择最小值，与无序的第一个交换位置，无序的第一个变成有序
                index = i
        arr[j], arr[index] = arr[index], arr[j]


arr = [54, 26, 93, 17, 31, 44, 55]
print(arr)
SelectSort(arr)
print(arr)