import pandas as pd
import matplotlib.pylab as plt


unrate = pd.read_csv("unrate.csv")
unrate["DATE"] = pd.to_datetime(unrate["DATE"])  # 更改时间展示方式
# plt.plot(x, y) --> x轴， y轴
# plt.show() --> 展示图

unrate_twelve = unrate[0:12]
plt.plot(unrate_twelve["DATE"], unrate_twelve["VALUE"])
plt.xticks(rotation=45)  # 横坐标倾斜45度
plt.yticks(rotation=45)  # 纵坐标倾斜45度
plt.xlabel("Month")  # 左标签
plt.ylabel("Unemployment Rate")  # 右标签
plt.title("Monthly Unemployment Thrends, 1948")  # 表头
print(plt.show())
