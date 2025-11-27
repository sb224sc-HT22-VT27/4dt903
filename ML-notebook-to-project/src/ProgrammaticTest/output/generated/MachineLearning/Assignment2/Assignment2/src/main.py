
"""
## Assignmen 2 vj222hx
"""



"""
Add imports
"""



import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt
import statsmodels.api as sm
# Classification: PREPROCESS




"""
Load the Boston.csv file
"""



csvFile = pd.read_csv("Boston.csv", index_col=0)
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
# Classification: PREPROCESS




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
# Classification: PREDICT




"""
Do linear regression
"""



reg1 = sm.OLS(csvFile["medv"], sm.add_constant(csvFile["lstat"])).fit()
print(reg1.summary())
reg2 = sm.OLS(csvFile["medv"], sm.add_constant(csvFile["rm"])).fit()
print(reg2.summary())
reg3 = sm.OLS(csvFile["medv"], sm.add_constant(csvFile["age"])).fit()
print(reg3.summary())
# Classification: PREDICT




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
# Classification: PREPROCESS




"""
Here we can see that R-squared is 0.639 which means that 63.9% of the variance can be explained with the model. The prob f-statistics line of 1.2e-110 is very low which means it is highly statistically significant, a value of < 0.05 indicating that it is 95% statstically significant
"""



reg = sm.OLS(csvFile["medv"], sm.add_constant(csvFile.drop(columns=["medv"]))).fit()
print(reg.summary())
# Classification: PREPROCESS




"""
Here we can see that R-squared is 0.741 which means that 74.1% of the variance can be explained with the model. The prob f-statistics line of 6.72e-135 is very low which means it is highly statistically significant, a value of < 0.05 indicating that it is 95% statstically significant. 
"""



"""
Correlation plot
"""



sns.heatmap(csvFile.corr(), annot=True, cmap="coolwarm", fmt=".2f", linewidths=0.5)
plt.show()
# Classification: PREPROCESS




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


