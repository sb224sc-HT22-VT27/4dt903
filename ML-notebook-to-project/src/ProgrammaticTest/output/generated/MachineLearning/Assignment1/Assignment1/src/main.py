
"""
Assignmen 1 vj222hx
"""



"""
Add imports
"""



import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
import scipy.stats as stats
# Classification: TRAIN




"""
Load the Wage.csv file
"""



csvFile = pd.read_csv("data/Wage.csv", index_col=0)
# Classification: TRAIN




"""
Display the number of features and their names:
"""



colNames = csvFile.columns.tolist()
print(f"Number of columns {len(colNames)}")
print(f"Column Names {colNames}")
# Classification: TRAIN




"""
Delete the feature ‘logwage’ and display the number of features and their names again:
"""



csvFile = csvFile.drop("logwage", axis=1)
colNames = csvFile.columns.tolist()
print(f"Number of columns {len(colNames)}")
print(f"Column Names {colNames}")
# Classification: TRAIN




"""
Display the number of data points:
"""



print(f"Number of datapoints {len(csvFile)}")
# Classification: PREDICT




"""
Display the data in a table
"""



print(csvFile.head(20))
# Classification: TRAIN




"""
Print a statistic summary of the features
"""



print("year\n", csvFile["year"].describe(), "\n")
print("age\n", csvFile["age"].describe(), "\n")
print(csvFile['maritl'].value_counts(), "\n")
print(csvFile['race'].value_counts(), "\n")
print(csvFile['education'].value_counts(), "\n")
print(csvFile['region'].value_counts(), "\n")
print(csvFile['jobclass'].value_counts(), "\n")
print(csvFile['health'].value_counts(), "\n")
print(csvFile['health_ins'].value_counts(), "\n")
print("wage\n", csvFile['wage'].describe())
# Classification: TRAIN




"""
Plot wage compared to age
"""



sns.regplot(x="age", y="wage", data=csvFile,  scatter_kws={'s': 5, 'color': 'black'}, line_kws={'color': 'black'})
plt.show()
# Classification: PREDICT




"""
Perform Shapiro-Wilk normality test
"""



stat, p_value = stats.shapiro(csvFile['age'])
print(f"Age: W = {stat}, p-value = {p_value}")
stat, p_value = stats.shapiro(csvFile['wage'])
print(f"Wage: W = {stat}, p-value = {p_value}")

stats.probplot(csvFile['age'], dist="norm", plot=plt)
plt.ylabel("Age")
plt.show()
stats.probplot(csvFile['wage'], dist="norm", plot=plt)
plt.ylabel("Wage")
# Classification: PREPROCESS




"""
Pearson correlation test
"""



corr_coef, p_value = stats.pearsonr(csvFile['age'], csvFile['wage'])
print(f"Correlation Coefficient: {corr_coef}")
print(f"p-value: {p_value}")
# Classification: PREDICT




"""
Interpretation of results:
From the Shapiro-Wilk test we can conclude that the data is not normally distributed with a 95% confidence interval since both the age and wage p-values are < 0.05. This can also be seen in the qq-plots where the age data is skewed to include more from the younger ages, around 20 years and the wage has some significant outliers towards the higher wages. The pearson correlation test shows the correlation between age and wage. The correlation coefficient is ≈ 0.2 meaning there is some positive correlation between age and wage. The p-value for this test is < 0.05 which means there is statistically significance in this correlation with a 95% confidence. 

Non-numerical features:

All Values:
"""



colNames = csvFile.columns.tolist()

for metric in colNames:
    if metric == "year" or metric == "age" or metric == "wage":
        continue
    print(metric + ":", csvFile[metric].unique().tolist())
# Classification: PREDICT




"""
Box plots:
"""



for metric in colNames:
    if metric == "year" or metric == "age" or metric == "wage":
        continue
    sns.boxplot(x=metric, y="wage", data=csvFile)
    sns.stripplot(x=metric, y="wage", data=csvFile)
    plt.title(metric)
    plt.show()


# Classification: PREDICT




"""
Perform ANOVA test:
"""



for metric in colNames:
    if metric == "region" or metric == "year" or metric == "age" or metric == "wage":
        continue
    groups = []
    for i, group in csvFile.groupby(metric):
        groups.append(group["wage"].values)
    f_stat, p_value = stats.f_oneway(*groups)
    print(metric + ":", f_stat, p_value)
# Classification: TRAIN




"""
In the ANOVA test we can see that all values are < 0.05 which means that there is a signifiant correlation between wage and the different metrics.

Maritl: The outliers in this graph are married, who have a higher wage, seperated and never married typically have a lower wage

Race: Here we can see that asian have the highest wage and others have the lowest

Education: Here we can see that higher education correlates with higher wages. 

Region: There are only people from the middle atlantic thus we also cant do ANOVA

Job class: Here we can see that Information has higher wages than Industrial

Health: People with very good health have higher wages

Health Ins: People with health insurance has a higher wage then people without. 
"""


