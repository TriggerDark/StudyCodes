import turtle

#15-Turtle.setup(width, height, startx, starty)
turtle.setup(650, 350, 200, 200)
turtle.penup()
turtle.fd(-250)  # forward()
turtle.pendown()
turtle.pensize(25)  # 画笔宽度 别名turtle.width()
turtle.pencolor("purple")  # 画笔颜色
"""
三种方式
pencolor("purpe")
pencolor((0.63, 0.13, 0.94))
pencolor(0.63, 0.13, 0.94)
"""
turtle.seth(-40)  # 改变画笔的方向
for i in range(4):
    turtle.circle(40, 80)  # circle(r,extent=None)
    turtle.circle(-40, 80)
turtle.circle(40, 80 / 2)
turtle.fd(40)
turtle.circle(16, 180)
turtle.fd(40 * 2 / 3)
turtle.done()
