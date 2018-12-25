def mergeSort(arr):
    n = len(arr)
    if n <= 1:
        return arr
    mid = n//2

    right_arr = mergeSort(arr[:mid])
    left_arr = mergeSort(arr[mid:])

    result = []
    left_pointer, right_pointer = 0, 0
    while right_pointer < len(right_arr) and left_pointer < len(left_arr):
        if right_arr[right_pointer] < left_arr[left_pointer]:
            result.append(right_arr[right_pointer])
            right_pointer += 1
        else:
            result.append(left_arr[left_pointer])
            left_pointer += 1

    result += left_arr[left_pointer:]
    result += right_arr[right_pointer:]

    return result


arr = [54, 26, 93, 17, 31, 44, 55]
mergeSort(arr)
print(arr)
temp = mergeSort(arr)
print(temp)