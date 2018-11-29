import pdb
def getAverge(a, b):
    result = a + b
    print(("result=%d" % result))
    return result

a = 100
b = 200
c = a + b
pdb.set_trace()
ret = getAverge(a, b)
print(ret)
"""
埋点
import pdb
pdb.set_trace()
"""