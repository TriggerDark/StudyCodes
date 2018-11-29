import pymysql


mydb = pymysql.connect(
    '127.0.0.1', 'root', 'lrw5841314921', 'test'
)

mycursor = mydb.cursor()

sql_1 = "update customers set address='Canyan 123' where address='Valley 345'"
sql_2 = "update customers set address=%s where address=%s"
val = ('Velley 345', 'Canyan 123',)

#mycursor.execute(sql_1)
mycursor.execute(sql_2, val)
mydb.commit()

print(mycursor.rowcount, "record(s) updated")

mydb.close()