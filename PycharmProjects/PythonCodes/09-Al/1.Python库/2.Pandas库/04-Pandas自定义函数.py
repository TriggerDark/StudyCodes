import pandas as pd

titanic_survival = pd.read_csv('titanic_train.csv')


def hundredth_row(column):
    # 第一百行
    hundredth_item = column.loc[99]
    return hundredth_item


hundredth_row = titanic_survival.apply(hundredth_row)
# print(hundredth_row)


# 缺失值的个数
def null_count(column):
    column_null = pd.isnull(column)
    null = column[column_null]
    return len(null)


column_null_len = titanic_survival.apply(null_count)
# print(column_null_len)


def which_class(row):
    pclass = row['Pclass']
    if pd.isnull(pclass):
        return "Unknown"
    elif pclass == 1:
        return "First Class"
    elif pclass == 2:
        return "Second Class"
    elif pclass == 3:
        return "Third Class"


classes = titanic_survival.apply(which_class, axis=1)
# print(classes)


def generate_age_lable(row):
    age = row['Age']
    if pd.isnull(age):
        return 'unknown'
    elif age > 18:
        return 'adult'
    else:
        return 'minor'


age_lables = titanic_survival.apply(generate_age_lable, axis=1)
# print(age_lables)

titanic_survival['Age_lables'] = age_lables

age_group_survival = titanic_survival.pivot_table(index='Age_lables', values='Survived')
print(age_group_survival)

