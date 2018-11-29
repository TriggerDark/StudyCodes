import pymysql


mydb = pymysql.connect(
    '127.0.0.1', 'root', 'lrw5841314921', 'test'
)

mycursor = mydb.cursor()

# 删除地址为Lowstreet 4的信息
sql_1 = 'delete from customers where address="Lowstreet 4"'
mycursor.execute(sql_1)
mydb.commit()
print(mycursor.rowcount, "record(s) delete")

# 转义
sql_2 = 'delete from customers where address=%s'
adr = ('Yellow Garden 2',)
mycursor.execute(sql_2, adr)
mydb.commit()
print(mycursor.rowcount, "record(s) delete")

mydb.close()