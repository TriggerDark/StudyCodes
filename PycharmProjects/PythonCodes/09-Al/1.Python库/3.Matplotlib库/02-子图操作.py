import matplotlib.pylab as plt
import numpy as np
import pandas as pd

# 1
# fig = plt.figure()
# 两行两列第一个
# ax1 = fig.add_subplot(2, 2, 1)
# ax2 = fig.add_subplot(2, 2, 2)
# ax3 = fig.add_subplot(2, 2, 4)

# 2
# fig = plt.figure(figsize=(3, 3))
# ax1 = fig.add_subplot(2, 1, 1)
# ax2 = fig.add_subplot(2, 1, 2)
#
# ax1.plot(np.random.randint(1, 5, 5), np.arange(5))
# ax2.plot(np.arange(10)*3, np.arange(10))

# 3
unrate = pd.read_csv("unrate.csv")
unrate["DATE"] = pd.to_datetime(unrate["DATE"])
unrate["MONTH"] = unrate["DATE"].dt.month

# fig = plt.figure(figsize=(6, 3))  # 控制图的比例
# plt.plot(unrate[0:12]["MONTH"], unrate[0:12]["VALUE"], c="red")
# plt.plot(unrate[12:24]["MONTH"], unrate[12:24]["VALUE"], c="blue")

# 4
fig = plt.figure(figsize=(10, 6))
colors = ["red", "blue", "green", "orange", "black"]
for i in range(5):
    start_index = i * 12
    end_index = (i + 1) * 12
    subset = unrate[start_index: end_index]
    label = str(1948 + i)
    plt.plot(subset["MONTH"], subset["VALUE"], c=colors[i], label=label)
    plt.legend(loc="best")  # location定位

plt.title("1948-1952")
plt.xlabel("Month")
plt.ylabel("Rate")

plt.show();