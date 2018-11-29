import pandas as pd
import matplotlib.pylab as plt
import numpy as np

reviews = pd.read_csv('fandango_scores.csv')
cols = ['FILM', 'RT_user_norm', 'Metacritic_user_nom', 'IMDB_norm', 'Fandango_Ratingvalue', 'Fandango_Stars']
norm_reviews = reviews[cols]

num_cols = ['RT_user_norm', 'Metacritic_user_nom', 'IMDB_norm', 'Fandango_Ratingvalue', 'Fandango_Stars']
bar_heights = norm_reviews.loc[0, num_cols].values
print(bar_heights)

bar_position = np.arange(5) + 0.75

tick_positions = range(1, 6)

fig = plt.figure(figsize=(6, 3))

ax1 = fig.add_subplot(1, 2, 1)
ax2 = fig.add_subplot(1, 2, 2)

ax1.bar(bar_position, bar_heights, 0.5)
ax2.barh(bar_position, bar_heights, 0.5)
# fig, ax = plt.subplots()
# ax.bar(bar_position, bar_heights, 0.5)  # ->纵向
# ax.barh(bar_position, bar_heights, 0.5)  # ->横向

# ax.set_xticks(tick_positions)
# ax.set_xticklabels(num_cols, rotation=45)

# 散点
# ax.scatter(norm_reviews["Fandango_Ratingvalue"], norm_reviews["RT_user_norm"])

ax1.set_xlabel("Rating")
ax1.set_ylabel("Average")
ax1.set_title("HAH")
plt.show()