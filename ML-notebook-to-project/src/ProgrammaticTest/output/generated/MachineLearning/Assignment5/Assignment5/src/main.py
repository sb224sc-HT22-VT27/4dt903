
"""
# Assignmen 5 vj222hx
"""



"""
## Conceptual
1. The data is split into K equally sized parts, usually 5 or 10. First, one part is used for testing and the remaining parts for training, then this is done for all the parts. Then the final result will be the average of the K tests. 

2. i. Validation set is faster to perform as kfold is essentially validation set approach but doing it k times however validation set is also less reliable and has a higher chance of overfitting.

2. ii. LOOCV is an exctreme case of K-Fold which is really computationally expensive since it is K-Fold where K=N. LOOCV however has a low chance of overfitting.
"""



"""
## Practical
Add imports
"""



import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt
import statsmodels.api as sm
import numpy as np
# Classification: PREPROCESS




"""
Load Auto dataset
"""



csvFile = pd.read_csv("data/Auto.csv", index_col=0)
# Classification: PREDICT




"""
Display the number of features and their names:
"""



colNames = csvFile.columns.tolist()
print(f"Number of columns: {len(colNames)}")
print(f"Column Names: {colNames}")
# Classification: TRAIN




"""
Print a statistic summary of the predictors and the response:
"""



print(csvFile.describe(), "\n")
print(csvFile['name'].value_counts())
# Classification: PREPROCESS




"""
Display the number of datapoints
"""



print(f"Number of datapoints {len(csvFile)}")
# Classification: PREPROCESS




"""
Display the data in a table
"""



print(csvFile.head(20))
# Classification: PREPROCESS




"""
Correlation Plot
"""



sns.heatmap(csvFile.drop(columns=['name']).corr(), annot=True, fmt=".2f", linewidths=0.5)
plt.show()
# Classification: PREDICT




"""
Estimating accuracy of lin reg model
"""



def boot_fn(data, index):
    sample = data.iloc[index]
    X = sample['horsepower']
    y = sample['mpg']
    X = sm.add_constant(X)
    model = sm.OLS(y, X).fit()
    return model.params
# Classification: TRAIN




print(boot_fn(csvFile, range(392)))
# Classification: PREPROCESS




np.random.seed(1)
print(boot_fn(csvFile, np.random.choice(392, 392, replace=True)))
# Classification: PREPROCESS




print(boot_fn(csvFile, np.random.choice(392, 392, replace=True)))
# Classification: PREPROCESS




boot_results = np.zeros((1000, 2))
for i in range(1000):
    indices = np.random.choice(392, 392, replace=True)  # Bootstrap resampling
    boot_results[i, :] = boot_fn(csvFile, indices)
print(f"standard errors: {boot_results.std(axis=0)}")

# Classification: PREPROCESS




X = csvFile['horsepower']
y = csvFile['mpg']
X = sm.add_constant(X)
model = sm.OLS(y, X).fit()
print(model.params)
print(model.summary())
# Classification: PREDICT




"""
The standard errors in the statistics estimate are 0.717 and 0.006. The standard errors in the bootstrap are 0.825 and 0.007. Here we can see that the bootstrap estimate has a slightly higher standard error which is expected since it is an estimate over many different subsets, so the regular estimate is better according these numbers but it is probably because it is slightly overfitted. 
"""



def boot_fn_quadratic(data, index):
    sample = data.iloc[index]
    X = sample['horsepower']
    X = np.column_stack((X, X**2))
    X = sm.add_constant(X)
    y = sample['mpg']
    model = sm.OLS(y, X).fit()
    return model.params
# Classification: PREDICT




np.random.seed(1)
boot_results = np.zeros((1000, 3))
for i in range(1000):
    indices = np.random.choice(392, 392, replace=True)
    boot_results[i, :] = boot_fn_quadratic(csvFile, indices)
print(f"standard errors: {boot_results.std(axis=0)}")

# Classification: PREDICT




csvFile['horsepower_squared'] = csvFile['horsepower'] ** 2
X = csvFile[['horsepower', 'horsepower_squared']]
y = csvFile['mpg']
X = sm.add_constant(X)
model = sm.OLS(y, X).fit()
print(model.params)
print(model.summary())
# Classification: PREDICT




"""
Bootstrap standard errors: 2.10, 0.034, 0.00012

Statistical standard errors: 1.8, 0.031, 0.000

Here we can see that bootstrap once again has a higher standard error for the same reason as in the linear case. 
"""


