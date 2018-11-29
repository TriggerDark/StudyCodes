
def getAverge(a, b):
    result = a + b
    print(("result=%d" % result))
    return result

a = 100
b = 200
c = a + b
ret = getAverge(a, b)
print(ret)

"""
python3 -m pdb 01-pdb.py
l----->list 显示当前的代码
n----->next 向下执行一行代码
c----->continue 继续执行代码
b----->break 添加断点 b n 在第n行停止
clear-->删除断点
p----->print打印一个变量的值
s----->step 进入到一个函数
a----->args 打印所有的形参数据
q----->quit 退出调试
r----->return 快速执行到函数的最后一行
"""