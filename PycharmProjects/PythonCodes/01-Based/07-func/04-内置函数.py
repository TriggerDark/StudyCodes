def len_grater_than(num):
    def len_grater_than_num(elem):
        return len(elem) > num
    return len_grater_than_num


"""方法二"""
elem = ["JIhaitao", "ji", "haitao"]
print(list(filter(len_grater_than(6), elem)))
print(list(map(len, elem)))


nums = [2,1,6,4,9]
"""sort()函数 ---->会改变原引用数据"""
#nums.sort()--->从小到大排序--->默认reverse=False
#nums.reverse()--->倒序但不排序
#nums.sort(reverse=True)--->倒序的排序
#nums.sort(reverse=False)
"""sorted()函数----->不会改变原数据"""
print(sorted(nums))
print(sorted(nums, reverse=True))