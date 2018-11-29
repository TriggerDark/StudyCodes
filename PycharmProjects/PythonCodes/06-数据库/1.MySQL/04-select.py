import pymysql


mydb = pymysql.connect(
    '127.0.0.1', 'root', 'lrw5841314921', 'test'
)

mycursor = mydb.cursor()

# 查看表中所有数据
sql_1 = 'select * from customers'
mycursor.execute(sql_1)
myresult = mycursor.fetchall()

for data in myresult:
    print(data)

# 查看表中指定数据
sql_2 = 'select name, address from customers'
mycursor.execute(sql_2)
myresult = mycursor.fetchall()

for data in myresult:
    print(data)

# 查看表中某一行数据
sql_3 = 'select * from customers'
mycursor.execute(sql_3)
myresult = mycursor.fetchone()
print(myresult)

mydb.close()