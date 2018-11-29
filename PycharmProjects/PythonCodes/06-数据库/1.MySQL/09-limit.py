import pymysql

mydb = pymysql.connect(
    '127.0.0.1', 'root', 'lrw5841314921', 'test'
)

mycursor = mydb.cursor()

sql_1 = 'select * from customers limit 5'

# 从第七个数据开始的五个数据
sql_2 = 'select * from customers limit 5 offset 6'

# mycursor.execute(sql_1)
mycursor.execute(sql_2)

myresult = mycursor.fetchall()

for x in myresult:
    print(x)