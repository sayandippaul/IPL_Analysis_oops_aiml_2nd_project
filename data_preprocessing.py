import pandas as pd
df=pd.read_csv('datasets/most_runs_average_strikerate.csv')
# print(df.info())
# print(df.describe())
# print(df.isnull().sum())
print(df.columns)

def preprocessdata_batsman():
    
    # fill null values with its average
    df['average'] = df['average'].fillna(10.0)


    # i want to add new features
    df['consistency'] =2* df['average'] * df['strikerate']/100
    df['runs_per_balls'] = df['total_runs'] / df['numberofballs']

    return df

 


df=preprocessdata_batsman()
# print(df.head())
