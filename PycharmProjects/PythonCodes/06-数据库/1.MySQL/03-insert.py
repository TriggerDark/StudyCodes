import pymysql

mydb = pymysql.connect(
    '127.0.0.1', 'root', 'lrw5841314921', 'test'
)

mycursor = mydb.cursor()

# 插入数据
sql = 'insert into customers (name, address) values (%s, %s)'

# 单数据
# val = ('John', 'Highway')


# 多数据
val = [
    ('Peter', 'Lowstreet 4'),
    ('Amy', 'Apple st 652'),
    ('Hannah', 'Mountain 21'),
    ('Michael', 'Valley 345'),
    ('Sandy', 'Ocean blvd 2'),
    ('Betty', 'Green Grass 1'),
    ('Richard', 'Sky st 331'),
    ('Susan', 'One way 98'),
    ('Vicky', 'Yellow Garden 2'),
    ('Ben', 'Park Lane 38'),
    ('William', 'Central st 954'),
    ('Chuck', 'Main Road 989'),
    ('Viola', 'Sideway 1633')
]
try:
    # 执行sql语句,单数据
    # mycursor.execute(sql, val)
    # 提交多数据
    mycursor.executemany(sql, val)
    # 提交到数据库
    mydb.commit()
except:
    # 如果发生错误则回滚
    mydb.rollback()

# print(mycursor.rowcount, "record inserted")
print(mycursor.rowcount, "was inserted")

# 插入数据时，第一个的索引位置
print("数据初始插入索引", mycursor.lastrowid)

# 关闭数据库
mydb.close()