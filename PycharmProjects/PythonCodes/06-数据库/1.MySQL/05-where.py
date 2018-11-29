import pymysql


mydb = pymysql.connect(
    '127.0.0.1', 'root', 'lrw5841314921', 'test'
)

mycursor = mydb.cursor()

# where one=something
sql_1 = 'select * from customers where address="Apple st 652"'
mycursor.execute(sql_1)
myresult = mycursor.fetchall()
for data in myresult:
    print(data)

# 通配符%
sql_2 = 'select * from customers where address like "%way%"'
mycursor.execute(sql_2)
myresult = mycursor.fetchall()
for data in myresult:
    print(data)

# 转义，防止数据库被网络黑客技术破坏和滥用
sql_3 = 'select * from customers where address=%s'
adr = ('Yellow Garden 2',)
mycursor.execute(sql_3, adr)
myresult = mycursor.fetchall()
for data in myresult:
    print(data)


mydb.close()