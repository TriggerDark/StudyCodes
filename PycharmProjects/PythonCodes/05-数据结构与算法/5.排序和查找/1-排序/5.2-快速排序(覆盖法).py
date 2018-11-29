def quick_sort(alist, start, end):
    if start < end:
        low = start
        high = end
        mid_value = alist[start]#记录索引为start位置的数据，称比较值

        while low < high:
            while low < high and alist[high] >= mid_value:#把相同的放到一边
                high -= 1#如果左边索引为high的数据大于比较值，则索引high自减，知道找到比比较值小的数据
            alist[low] = alist[high]#找到比比较值小的数据时，把左边索引high的数据赋值给右边索引为low的数据
            """
            当第一次执行alist[low]=alist[high]时，由于alist[low]的数据被alist[start]记录过，
            此时alist[start]作为比较值，最后会有位置存放
            而不用去担心数据被alist[high]的值覆盖，
            而alist[high]会被符合的值同样覆盖
            """

            #同理
            while low < high and alist[low] < mid_value:
                low += 1
            alist[high] = alist[low]

        alist[low] = mid_value

        quick_sort(alist, start, low - 1)
        quick_sort(alist, low + 1, end)


alist = [54, 26, 93, 17, 31, 44, 55]
quick_sort(alist, 0, len(alist)-1)
print(alist)