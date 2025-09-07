from data_preprocessing import preprocessdata_batsman
from players_data_preprocessing import players
import duckdb

df = preprocessdata_batsman()
players = players()
# print(players[players['Player_Name']=='V Kohli'])
# print(df[df['batsman']=='V Kohli'])
# df['batsman']=df['batsman'].str.strip()
# players['Player_Name']=players['Player_Name'].str.strip()
# df['batsman']=df['batsman'].str.lower()
# players['Player_Name']=players['Player_Name'].str.lower()
# Run SQL on your dataframe
# result = duckdb.query("""
# SELECT batsman, consistency, runs_per_balls
# FROM df
# WHERE consistency > 70
# ORDER BY runs_per_balls DESC
# LIMIT 10
# """).to_df()



top_10_batsman=duckdb.query("""select batsman,total_runs from df order by total_runs desc limit 10""").to_df()
# print(top_10_batsman)
# top_10_average=duckdb.query("""select batsman,average from df where total_runs>1000 order by average desc limit 10""").to_df()
# top_10_famous_with_runs=duckdb.query("""select a.batsman as name ,a.total_runs as run from top_10_batsman as a left join top_10_average as b on a.batsman=b.batsman""").to_df()
# duckdb.query("""create table if not exists top_10_famous_with_runs(name varchar, run int)""")
# duckdb.query("""insert into top_10_famous_with_runs values ('Sayandip Paul', 4632)""")
# duckdb.query("""insert into top_10_famous_with_runs values ('Shikhar Dhawan', 5765)""")

# new_team=duckdb.query("""select * from top_10_famous_with_runs""").to_df()


# i want to print everyhing of a and b only without printing a's batsman
top_10_batsman_with_extra_details=duckdb.query("""select a.*,b.Country from top_10_batsman as a join players as b on a.batsman=b.Player_Name  order by b.Country""").to_df()
run_of_indian_players=duckdb.query("""select sum(total_runs) from top_10_batsman_with_extra_details where Country='India'""").to_df().iloc[0, 0]
run_of_foreign_players=duckdb.query("""select sum(total_runs) from top_10_batsman_with_extra_details where Country!='India'""").to_df().iloc[0, 0]
import matplotlib.pyplot as plt
import numpy as np
plt.pie([run_of_indian_players,run_of_foreign_players],labels=['Indian Players','Foreign Players'],autopct='%1.1f%%')
plt.title('Run Contribution of Indian vs Foreign Players in Top 10 Batsman of IPL')
plt.legend()
plt.show()


