import pandas as pd
import matplotlib.pylab as plt

reviews = pd.read_csv("fandango_scores.csv")
cols = ['FILM', 'RT_user_norm', 'Metacritic_user_nom', 'IMDB_norm', 'Fandango_Ratingvalue', 'Fandango_Stars']
norm_reviews = reviews[cols]

fig, ax = plt.subplots()
# ax.boxplot(norm_reviews["RT_user_norm"])
# # # ax.set_xticklabels(['RottenTomatoes'])
num_clus = ['RT_user_norm', 'RT_user_norm', 'Metacritic_user_nom', 'IMDB_norm']
ax.boxplot(norm_reviews[num_clus].values)
ax.set_xticklabels(num_clus, rotation=90)
ax.set_ylim(0, 5)  # 指定y轴的区间
plt.show()