import pymysql


mydb = pymysql.connect(
    '127.0.0.1', 'root', 'lrw5841314921', 'test'
)

mycursor = mydb.cursor()

# 按姓名排序
sql_1 = 'select * from customers order by name'
mycursor.execute(sql_1)
myresult = mycursor.fetchall()
for data in myresult:
    print(data)

print("-"*50)

# order by desc 降序
sql_2 = 'select * from customers order by name desc'
mycursor.execute(sql_2)
myresult = mycursor.fetchall()
for data in myresult:
    print(data)

mydb.close()