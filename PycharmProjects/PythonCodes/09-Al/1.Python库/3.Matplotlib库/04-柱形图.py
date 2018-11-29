import pandas as pd
import matplotlib.pylab as plt

reviews = pd.read_csv("fandango_scores.csv")
cols = ['FILM', 'RT_user_norm', 'Metacritic_user_nom', 'IMDB_norm', 'Fandango_Ratingvalue', 'Fandango_Stars']
norm_reviews = reviews[cols]

fandango_distribute = norm_reviews["IMDB_norm"].value_counts()  # 相同数出现的次数
fandango_distribute = fandango_distribute.sort_index()  # 排序
# print(fandango_distribute)

fig, ax = plt.subplots()
# ax.hist(norm_reviews['Fandango_Ratingvalue'])
# ax.hist(norm_reviews['Fandango_Ratingvalue'], 20)
ax.hist(norm_reviews['Fandango_Ratingvalue'], range(3, 4), 10)
plt.show()
