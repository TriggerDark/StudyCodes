import pandas as pd
import numpy as np


titanic_survival = pd.read_csv('titanic_train.csv')
# print(titanic_suurvial.head())

# 对age一列数据进行操作
age = titanic_survival['Age']

# 判断是否是缺失值，如果是，返回true
age_is_null = age.isnull()
# print(age_is_null)

# 保留返回值为true的数据
age_null_true = age[age_is_null]
# print(age_null_true)

# 缺失值的长度
count =len(age_null_true)
# print(count)

good_age = age[age_is_null == False]
# print(good_age)
correct_avg_age = sum(good_age) / len(good_age)
# print(correct_avg_age)

correct_avg_age_mean = age.mean()
# print(correct_avg_age_mean)

# pivot_table(index, values, aggfunc)
# 以index作为分类标准，values的值作为np.mean计算
# passenger_survival = titanic_survival.pivot_table(index='Pclass', values='Survived', aggfunc=np.mean)
# print(passenger_survival)

# passenger_survival = titanic_survival.pivot_table(index='Pclass', values='Age')
# print(passenger_survival)

# passenger_survival = titanic_survival.pivot_table(index='Embarked', values=['Fare', 'Survived'], aggfunc=np.sum)
# print(passenger_survival)

# dropna()去除缺失值
# passenger_survival = titanic_survival.dropna(axis=1)
# passenger_survival = titanic_survival.dropna(axis=0, subset=['Age','Cabin'])
# print(passenger_survival)

# 某一具体信息
# info = titanic_suurvial.loc[1, 'Cabin']
# print(info)

new_titanic_survival = titanic_survival.sort_values('Age', ascending=False)
print([new_titanic_survival[0:10]])
print('-'*50)

# 重新构建索引值
titanic_reindexed = new_titanic_survival.reset_index(drop=True)
print(titanic_reindexed[0:10])
