import pymysql


mydb = pymysql.connect('127.0.0.1', 'root', 'lrw5841314921', 'test')

mycursor = mydb.cursor()

# 创建表单
# sql = 'create table customers(id int auto_increment primary key, name  varchar(255), address varchar(255))'

# 查看表
sql = 'show tables'
mycursor.execute(sql)

for table in mycursor:
    print(table)

mydb.close()