import pandas as pd
df=pd.read_csv('datasets/Players.csv')
# print(df.head())
# print(df.isnull().sum())
def players():
    return df
