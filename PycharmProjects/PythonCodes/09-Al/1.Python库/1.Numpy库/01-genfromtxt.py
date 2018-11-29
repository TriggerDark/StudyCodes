import numpy as np

#delimiter=",",以","为分隔符
#skip_header=1跳过第一行
world_alcohol = np.genfromtxt("world_alcohol.txt", delimiter=",", dtype=str, skip_header=1)

print(type(world_alcohol))
print(world_alcohol)

#行列从0开始
#第二行第五列
print(world_alcohol[1, 4])
#第三行第三列
print(world_alcohol[2, 2])


"""
result:
跳过['Year' 'WHO region' 'Country' 'Beverage Types' 'Display Value']
    <class 'numpy.ndarray'>
    [
     ['1986' 'Western Pacific' 'Viet Nam' 'Wine' '0']
     ['1986' 'Americas' 'Uruguay' 'Other' '0.5']
     ..., 
     ['1987' 'Africa' 'Malawi' 'Other' '0.75']
     ['1989' 'Americas' 'Bahamas' 'Wine' '1.5']
     ['1985' 'Africa' 'Malawi' 'Spirits' '0.31']]
0.5
"""