from data_preprocessing import preprocessdata_batsman

df = preprocessdata_batsman()
# sort top 10 batsman of ipl according to runs
top_10_batsman = df.sort_values(by='total_runs', ascending=False).head(10)
# i want to see that cases only where run >1000
top_10_hitter=df[df['total_runs']>500].sort_values(by='strikerate', ascending=False).head(10)

# top 10 consistent players
top_10_consistent = df[df['total_runs']>500].sort_values(by='consistency', ascending=False).head(10)


# find common players

common_players = set(top_10_batsman['batsman']).intersection(set(top_10_hitter['batsman'])).intersection(set(top_10_consistent['batsman']))
print("Common Players:")
print(common_players)
# now i will plot these batsman name according to their total runs
import matplotlib.pyplot as plt

# plt.bar(top_10_batsman['batsman'], top_10_batsman['total_runs'])
# plt.bar(top_10_hitter['batsman'], top_10_hitter['strikerate'])
plt.bar(top_10_consistent['batsman'], top_10_consistent['consistency'])
# plt.bar(common_players, df[df['batsman'].isin(common_players)]['total_runs'])
plt.xlabel('Batsman Name')
plt.ylabel('Total Runs')
plt.title('Top 10 Batsman of IPL')
plt.xticks(rotation=30)
# plt.yticks([0,7000])
plt.show()
