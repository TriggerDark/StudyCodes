import pymysql

mydb = pymysql.connect(
    '127.0.0.1', 'root', 'lrw5841314921', 'test'
)

mycursor = mydb.cursor()

# sql = "SELECT \
#       user.name AS user, \
#       product.name AS favorite \
#       FROM user \
#       INNER JOIN product ON user.fav = product.id"

# sql = "SELECT \
#       user.name AS user, \
#       product.name AS favorite \
#       FROM user \
#       LEFT JOIN product ON user.fav = product.id"

sql = "SELECT \
      user.name AS user, \
      product.name AS favorite \
      FROM user \
      RIGHT JOIN product ON user.fav = product.id"

mycursor.execute(sql)

myresult = mycursor.fetchall()

for x in myresult:
    print(x)

mydb.close()