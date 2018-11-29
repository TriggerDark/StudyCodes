import pandas

food_info = pandas.read_csv('food_info.csv')

# 获取数据loc[1,2], loc[9], loc[1:3]
# print(food_info.loc[0:1])

# 用列名定位
# food_info['Energ_Kcal']
# food_info['NDB_No','Energ_Kcal']
columnlist = ['NDB_No', 'Energ_Kcal']
columns_value = food_info[columnlist]
# print(columns_value)


# 查看以(g)为结尾的数据
col_names = food_info.columns.tolist()
print(col_names)

g_columns = []

for g in col_names:
    if g.endswith('(g)'):
        g_columns.append(g)

g_column_list = food_info[g_columns]
# print(g_column_list)

# 添加新指标
water_energy = food_info['Water_(g)'] * food_info['Energ_Kcal']
# print(food_info.shape)
iron_grams = food_info['Iron_(mg)'] / 1000
food_info['Iron_(g)'] = iron_grams
# print(food_info.shape)


# 排序,从小到大
food_info.sort_values("Sodium_(mg)", inplace=True)
# print(food_info["Sodium_(mg)"])

# 倒序
food_info.sort_values("Sodium_(mg)", inplace=True, ascending=False)
print(food_info["Sodium_(mg)"])