import pymysql


mydb = pymysql.connect(
    '127.0.0.1', 'root', 'lrw5841314921', 'test'
)

mycursor = mydb.cursor()

# 删除表
# sql = 'drop table customers'

# 删除数据库
sql = 'drop database test'
mycursor.execute(sql)

mydb.close()
