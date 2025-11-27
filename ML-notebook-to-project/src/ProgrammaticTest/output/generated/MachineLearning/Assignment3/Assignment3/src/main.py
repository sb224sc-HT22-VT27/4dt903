
"""
### Assignmen 2+3 vj222hx
"""



"""
## Conceptual questions
1. $Y = 50 + 20X1 + 0.07X2 + 35X3 + 0.01X1X2 - 10X1X3$

College: $Y_C = 50 + 20X1 + 0.07X2 + 35 + 0.01X1X2 - 10X1$

High School: $Y_H = 50 + 20X1 + 0.07X2 + 0.01X1X2$  

Compare with $Y_C - Y_H = 50 + 20X1 + 0.07X2 + 35 + 0.01X1X2 - 10X1 - (50 + 20X1 + 0.07X2 + 0.01X1X2) = 35 - 10X1$

The intersection of the lines are at $35 - 10X1 = 0 => X1 = 3.5$

Inserting values higher and lower than 3.5 for GPA in the equations gives us that High School gives a higher base salary with a GPA > 3.5 and College grads have a higher base salary with a GPA < 3.5 independent of IQ meaning that iii. is correct

2. $Y_C = 50 + 20X1 + 0.07X2 + 35 + 0.01X1X2 - 10X1$

Inserting $X1 = 4, X2 = 110$ gives us

$Y_C = 50 + 20*4 + 0.07*110 + 35 + 0.01*4*110 - 10*4 = 137.1$ Which is $137100

3. True, such a small value could easily even go negative depending on the training data. However a small value does not neccecarily mean insignificant. You would have to to a correlation test to find how significant it is via the p-value
"""



"""
## Assignment 2
"""



"""
Add imports
"""



import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt
import statsmodels.api as sm
import numpy as np
# Classification: TRAIN




"""
Load the Boston.csv file
"""



csvFile = pd.read_csv("data/Boston.csv", index_col=0)
# Classification: PREPROCESS




"""
Display the number of features and their names:
"""



colNames = csvFile.columns.tolist()
print(f"Number of columns {len(colNames)}")
print(f"Column Names {colNames}")
# Classification: PREDICT




"""
Print a statistic summary of the predictors and the response:
"""



csvFile.describe()
# Classification: TRAIN




"""
Display the number of datapoints
"""



print(f"Number of datapoints {len(csvFile)}")
# Classification: PREDICT




"""
Display the data in a table

"""



print(csvFile.head(20))
# Classification: PREDICT




"""
Plot lstat and rm
"""



sns.scatterplot(x="lstat", y="medv", data=csvFile, color="black")
plt.show()
sns.scatterplot(x="rm", y="medv", data=csvFile, color="black")
plt.show()
sns.scatterplot(x="age", y="medv", data=csvFile, color="black")
plt.show()
# Classification: PREPROCESS




"""
Do linear regression
"""



reg1 = sm.OLS(csvFile["medv"], sm.add_constant(csvFile["lstat"])).fit()
print(reg1.summary())
reg2 = sm.OLS(csvFile["medv"], sm.add_constant(csvFile["rm"])).fit()
print(reg2.summary())
reg3 = sm.OLS(csvFile["medv"], sm.add_constant(csvFile["age"])).fit()
print(reg3.summary())
# Classification: TRAIN




"""
On the first one we can see that R-squared is 0.544 which means that 54.4% of the variance can be explained with the model. The prob f-statistics line of 5.08e-88 is very low which means it is highly statistically significant, a value of < 0.05 indicating that it is 95% statstically significant

The same interpretation can be made of the other values of 0.484 and 2.49e-74, and 0.142 and 1.57e-18 for the third one. All f-statistics are low enough to statistically significant. 
"""



print(reg1.conf_int())
print(reg2.conf_int())
print(reg3.conf_int())
# Classification: TRAIN




"""
These values indicate the lower and upper bound of the 95% confidence interval. The first row is the y intercept and the second row shows the steepness of the graph. A smaller interval in the slope shows that the model is more accurate. The first and the third one are slightly negativly correlated with a small interval. The middle one is highly positivly correlated but it has a slightly larger interval.
"""



"""
Use the model
"""



new_lstat = pd.DataFrame({'lstat': [5, 10, 15]})
new_lstat = sm.add_constant(new_lstat)
pred1 = reg1.get_prediction(new_lstat).summary_frame(alpha=0.05)
print(pred1[['mean', 'obs_ci_lower', 'obs_ci_upper']])

new_rm = pd.DataFrame({'rm': [5, 6.5, 8]})
new_rm = sm.add_constant(new_rm)
pred2 = reg2.get_prediction(new_rm).summary_frame(alpha=0.05)
print(pred2[['mean', 'obs_ci_lower', 'obs_ci_upper']])

new_age = pd.DataFrame({'age': [25, 50, 75]})
new_age = sm.add_constant(new_age)
pred3 = reg3.get_prediction(new_age).summary_frame(alpha=0.05)
print(pred3[['mean', 'obs_ci_lower', 'obs_ci_upper']])
# Classification: PREPROCESS




"""
The values inserted in the first regression is 5, 10 and 15. This means that an lstat of 5 will mean that it will have a medv of between 17.56 and 42.04 with a 95% probabilty. 10 and 15 will have a value between (12.82, 37.28) and (8.08, 32.53) respectivly with a 95% probaility. We also inserted 5, 6.5 and 8 into rm and the same values can be interpreted from the second matrix in the output. I also inserted 20, 50, and 75 into age and the same data can be read from the third matrix in the output.
"""



reg = sm.OLS(csvFile["medv"], sm.add_constant(csvFile[["lstat", "rm", "age"]])).fit()
print(reg.summary())
# Classification: PREDICT




"""
Here we can see that R-squared is 0.639 which means that 63.9% of the variance can be explained with the model. The prob f-statistics line of 1.2e-110 is very low which means it is highly statistically significant, a value of < 0.05 indicating that it is 95% statstically significant
"""



reg = sm.OLS(csvFile["medv"], sm.add_constant(csvFile.drop(columns=["medv"]))).fit()
print(reg.summary())
# Classification: TRAIN




"""
Here we can see that R-squared is 0.741 which means that 74.1% of the variance can be explained with the model. The prob f-statistics line of 6.72e-135 is very low which means it is highly statistically significant, a value of < 0.05 indicating that it is 95% statstically significant. 
"""



"""
Correlation plot
"""



sns.heatmap(csvFile.corr(), annot=True, cmap="coolwarm", fmt=".2f", linewidths=0.5)
plt.show()
# Classification: TRAIN




"""
This shows the correlation coefficient of all variables. A value of 0 means there is no correlation i.e. a very scattered graph, 1 means that an increase of one variable implies a drirect increase of the other i.e. a straight line with positive slope, -1 means that an increase of one variable implies a direct decrease of the other i.e a straight line with negative slope. Floats in between means a correlation but not a straight line. Example is zn and crim has a correlation coeficcient of -0.2 which means a plot between them would mean a relativly scattered plot but with a slight downwards trajectory. 
"""



"""
Use the multiple linear regression model to predict the medv values
"""



selected_predictor_values = pd.DataFrame(pd.MultiIndex.from_product([[5, 10, 15], [5, 6.5, 8]], names=["lstat", "rm"]).to_frame(index=False))
print(selected_predictor_values)

reg = sm.OLS(csvFile["medv"], sm.add_constant(csvFile[["lstat", "rm"]])).fit()
selected_predictor_values = sm.add_constant(selected_predictor_values)
predictions = reg.get_prediction(selected_predictor_values)
pred_summary = predictions.summary_frame(alpha=0.05)
print(pred_summary[["mean", "obs_ci_lower", "obs_ci_upper"]])
# Classification: PREPROCESS




"""
The first row means that a lstat and an rm value of 5 will give us a medv betweem (9.89, 31,91) with a confidence of 95%. For the last one, an lstat of 15 and an rm of 8 will give us a medv between (18.75, 40.78) with a confidence of 95%. The same can be said for all combinations of lstat = [5, 10, 15] and rm = [5, 6.5, 8].
"""



"""
## Assignment 3
"""



X = csvFile[["lstat", "rm", "nox", "dis", "ptratio"]]
y = csvFile["medv"]
X = sm.add_constant(X)
model1 = sm.OLS(y, X).fit()

print(model1.summary())
# Classification: PREDICT




csvFile["lstat_rm"] = csvFile["lstat"] * csvFile["rm"]
X = csvFile[["lstat", "rm", "lstat_rm", "nox", "dis", "ptratio"]]
X = sm.add_constant(X)
model2 = sm.OLS(y, X).fit()

print(model2.summary())
# Classification: PREDICT




"""
Just adding the "lstat", "rm", "lstat_rm", "nox", "dis", "ptratio" columns give an r-squaerd value of 0.705, but adding an interaction term between lstat and rm gives an r-squared value of 0.775 which means we get a better prediction with this term.
"""



"""
Now add non-linear term
"""



csvFile["lstat_rm_squared"] = csvFile["lstat_rm"] ** 2
X = csvFile[["lstat", "rm", "lstat_rm", "lstat_rm_squared", "nox", "dis", "ptratio"]]
X = sm.add_constant(X)
model3 = sm.OLS(y, X).fit()

print(model3.summary())
# Classification: TRAIN




"""
Perform ANOVA
"""



anova_results = sm.stats.anova_lm(model2, model3)
print(anova_results)
# Classification: PREPROCESS




"""
The third model has an r-squared of 0.781 which is slighly better than the second model however the p-value from anova of 0.0046 is less than 0.05 which makes it statistically significantly with a 95% significance. 
"""



"""
Add polynomial
"""



for i in range(2, 6):
    csvFile[f"lstat_poly_{i}"] = csvFile["lstat"] ** i

X = csvFile[["lstat", "rm", "lstat_rm", "lstat_poly_2", "lstat_poly_3", "lstat_poly_4", "lstat_poly_5", "nox", "dis", "ptratio"]]
X = sm.add_constant(X)
model4 = sm.OLS(y, X).fit()

print(model4.summary())
# Classification: PREDICT




anova_results = sm.stats.anova_lm(model2, model4)
print(anova_results)
# Classification: PREDICT




"""
We get an ever so slight better increase in r-squared compared to model 4. The p-value from anova is lower meaning it is probably more statistically significant than with model 3 however the risk with having too high polynomials is overfitting.
"""



csvFile["log_rm"] = np.log(csvFile["rm"])

X = csvFile[["lstat", "lstat_poly_2", "lstat_poly_3", "lstat_poly_4", "lstat_poly_5", "rm", "log_rm", "nox", "dis", "ptratio"]]
X = sm.add_constant(X)
model5 = sm.OLS(y, X).fit()

print(model5.summary())

# Classification: TRAIN




anova_results = sm.stats.anova_lm(model2, model5)
print(anova_results)
# Classification: PREDICT




"""
Here we get quite a large increse in r-squared of 0.804 and the anova test shows that it is a significant increase as well with a p-value of 1.19e-12
"""



"""
### Using carseats dataset
"""



csvFile2 = pd.read_csv("data/Carseats.csv", index_col=0)
print(csvFile2.describe(), "\n")
print(csvFile2['ShelveLoc'].value_counts(), "\n")
print(csvFile2['Urban'].value_counts(), "\n")
print(csvFile2['US'].value_counts())
# Classification: PREDICT




X = pd.get_dummies(csvFile2, columns=["ShelveLoc", "Urban", "US"])
for col in X.select_dtypes("bool"):
    X[col] = X[col].astype(int)

X = X.drop(columns=["Sales"])
X = sm.add_constant(X)
y = csvFile2["Sales"]
model = sm.OLS(y, X).fit()

print(model.summary())
# Classification: PREDICT




"""
Here we have an R-squared value of 0.873 which means that 87.3% of the variance can be explained by the model with an f-value probability of 1.6e-166 which is very small meaning the model has a large significance.
"""



X = csvFile2.drop(columns=["Sales", "Population", "Education", "Age", "Urban", "US"])
X = pd.get_dummies(X, columns=["ShelveLoc"])

for col in X.select_dtypes("bool"):
    X[col] = X[col].astype(int)

X["Income:Advertising"] = csvFile2["Income"] * csvFile2["Advertising"]
X["Price:Age"] = csvFile2["Price"] * csvFile2["Age"]
y = csvFile2["Sales"]
X = sm.add_constant(X)
model = sm.OLS(y, X).fit()

print(model.summary())
# Classification: PREDICT




"""
This one has a slightly worse r-squared however it has a slightly better prob f-statistic instead which means it has more statistical significance than the previous one
"""



X = csvFile2.drop(columns=["Sales"])
X = pd.get_dummies(X, columns=["ShelveLoc", "US", "Urban"])

for col in X.select_dtypes("bool"):
    X[col] = X[col].astype(int)

X["Income:Advertising"] = csvFile2["Income"] * csvFile2["Advertising"]
y = csvFile2["Sales"]
X = sm.add_constant(X)
model = sm.OLS(y, X).fit()

print(model.summary())
# Classification: PREDICT




"""
Here I was able to get slightly better R-squared of 0.876 with a prob f-statistic of 5.48e-176 which is in between the two previous significance. I did this by not dropping any columns but adding Income:Advertising
"""


