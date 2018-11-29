import pandas as pd
from pandas import Series
fandango = pd.read_csv('fandango_score_comparison.csv')

series_film = fandango['FILM']
series_rt = fandango['RottenTomatoes']

# print(type(series_film))

file_names = series_film.values
rt_scores = series_rt.values
# print(type(file_names))

series_custom = Series(rt_scores, index=file_names)
# print(series_custom[{'Minions (2015)', 'Leviathan (2014)'}])
# fiveTen = series_custom[5:10]
# print(fiveTen)

original_index = series_custom.index.tolist()
# print(original_index)

sorted_index = sorted(original_index)
sorted_by_index = series_custom.reindex(sorted_index)
# print(sorted_by_index)

sc2 = series_custom.sort_values()
# print(sc2[0:10])

sc3 = series_custom.sort_index()
# print(sc3[0:10])


import numpy as np

# print(np.add(series_custom, series_custom))
# np.sin(series_custom)
# np.max(series_custom)

print(series_custom[series_custom > 50])


rt_critics = Series(fandango['RottenTomatoes'].values, index=fandango['FILM'])
rt_user = Series(fandango['RottenTomatoes_User'].values, index=fandango['FILM'])
rt_mean = (rt_critics + rt_user) / 2
# print(rt_mean)

fandango_films = fandango.set_index('FILM', drop=False)
# print(fandango_films)

# print(fandango_films.loc['Avengers: Age of Ultron (2015)'])



