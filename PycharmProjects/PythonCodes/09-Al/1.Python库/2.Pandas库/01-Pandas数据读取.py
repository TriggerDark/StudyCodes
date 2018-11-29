import pandas

food_info = pandas.read_csv('food_info.csv')
print(type(food_info))
# print(food_info.dtypes)
# print(help(pandas.read_csv))

# 显示前五条(默认)数据
# print(food_info.head())
# 设置值，显示前三行
# print(food_info.head(3))

# tail()和head()作用相反
# print(food_info.tail())

# 列的指标值，列名
# print(food_info.columns)

# 数据规模
# print(food_info.shape)