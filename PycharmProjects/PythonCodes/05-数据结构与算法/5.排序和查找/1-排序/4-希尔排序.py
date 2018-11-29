def shellSort(arr):
    """
    希尔排序
    插入排序的进阶
    """
    n = len(arr)
    gap = len(arr)//2
    while gap >= 1:
        for j in range(gap, n):
            i = j;
            while i >= gap and arr[i] < arr[i-gap]:
                arr[i], arr[i-gap] = arr[i-gap], arr[i]
                i -= gap
        gap //=2

data = [3, 8, 5, 4, 2, 6, 1, 7]
shellSort(data)
print(data)