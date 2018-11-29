import pymysql


# mysqldb = pymysql.connect('127.0.0.1', 'root', 'lrw5841314921')
# 创建好数据库后
mysqldb = pymysql.connect('127.0.0.1', 'root', 'lrw5841314921', 'test')

# mycursor = mysqldb.cursor()

# 创建一个数据库
# sql = "create database test"

# 查看数据库
# sql = "show databases"
#
# mycursor.execute(sql)
#
# for database in mycursor:
#     print(database)
mysqldb.close()