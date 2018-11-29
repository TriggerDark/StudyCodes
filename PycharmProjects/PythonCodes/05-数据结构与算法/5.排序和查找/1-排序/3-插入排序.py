def insert_sort(arr):
    for j in range(1, len(arr)):#j从1开始，遍历
        i = j#把j赋给i
        while i > 0:
            if arr[i] < arr[i - 1]:#如果i位大于i-1位，
                arr[i], arr[i - 1] = arr[i - 1], arr[i]#交换位置，
                i -= 1#i自减，继续循环，
            else:#知道不符合i位大于i-1位
                break#停止


data = [3, 8, 5, 4, 2, 6, 1, 7]
insert_sort(data)
print(data)