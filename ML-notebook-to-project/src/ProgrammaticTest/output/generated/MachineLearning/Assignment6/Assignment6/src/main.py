
"""
# Assignmen 6 vj222hx
"""



"""
## Conceptual
1. Bagging is a method for improving variance by training a model on multiple random subsets of a dataset and taking the average of those, or majority voiting for classification. Boosting however sequentially improves weak models with weighted errors where each new model tries to improve on missclassified points. Bagging generally has a lower risk than boosting as it averages the models instead of trying to improve them. For both methods there are multiple ways to build models using trees. For bagging you could use random forest which combines multiple decision trees and for Boosting you could use Gradient boosting which starts with a simple tree and adds more trees to correct the errors of the previous trees. 

2. Random forest makes multiple fully grown decision trees independently and averages (or votes) them. Here samples are equally weighted. This method is less prone to overfitting since it is averageing results. AdaBoost makes multiple shallow decission trees and sequentially improves them based on the errors of the previous trees. Here, missclassified samples get a higher weight. This is more prone to overfitting as it improves based on a full single training set. 
"""



"""
## Practical
"""



"""
Add imports
"""



import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt
import numpy as np
from sklearn.tree import DecisionTreeClassifier, DecisionTreeRegressor, plot_tree
from sklearn.model_selection import train_test_split, cross_val_score
from sklearn.metrics import confusion_matrix, mean_squared_error, r2_score
from sklearn.ensemble import RandomForestRegressor, GradientBoostingRegressor
# Classification: PREDICT




"""
Load Carseats dataset
"""



csvFile = pd.read_csv("Carseats.csv", index_col=0)
# Classification: TRAIN




"""
Display the number of features and their names:
"""



colNames = csvFile.columns.tolist()
print(f"Number of columns: {len(colNames)}")
print(f"Column Names: {colNames}")
# Classification: PREDICT




"""
Print a statistic summary of the predictors and the response:
"""



print(csvFile.describe(), "\n")
print(csvFile['ShelveLoc'].value_counts())
print(csvFile['Urban'].value_counts())
print(csvFile['US'].value_counts())
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
# Classification: TRAIN




"""
Correlation Plot
"""



sns.heatmap(csvFile.drop(columns=['ShelveLoc', "Urban", "US"]).corr(), annot=True, fmt=".2f", linewidths=0.5)
plt.show()
# Classification: PREPROCESS




"""
Scatter plot of price to sales
"""



sns.regplot(x="Sales", y="Price", data=csvFile,  scatter_kws={'s': 5, 'color': 'black'}, line_kws={'color': 'black'})
plt.show()
# Classification: TRAIN




"""
Sales is our response and the most correlated predictor is price, and since it is a negative correlation, it means that if price goes down, the sales go up. The second most correlated predictor is Advertising which has a positive correlation. The least correlated predictors are Population and Education. The slope of the above regression plot also shows the -44 correlation between Price and Sales. 
"""



csvFileEncoded = pd.get_dummies(csvFile, columns=["ShelveLoc", "Urban", "US"])
csvFile["High"] = ["No" if sales <= 8 else "Yes" for sales in csvFile["Sales"]]

X = csvFileEncoded.drop(columns=["Sales"]) 
y = csvFile["High"]

tree = DecisionTreeClassifier()
tree.fit(X, y)

print(f"Number of terminal nodes: {tree.get_n_leaves()}")
# Classification: PREPROCESS




plt.figure(figsize=(16, 10))
plot_tree(tree, feature_names=X.columns, class_names=["No", "Yes"], impurity=False, fontsize=5, label="none")
plt.show()
# Classification: PREPROCESS




"""
The tree can be interpreted as when a point reaches the first node it checks if the ShelveLoc is good, and in that case it goes left, else it goes right. If it goes left it will check if the price is <= 92.5 and go left else right. Then it will do this all the way to the bottom where it will get an answer if "High" is Yes or No. 
"""



csvFile_encoded = pd.get_dummies(csvFile, columns=["ShelveLoc", "Urban", "US"], drop_first=True)
X = csvFile_encoded.drop(columns=["Sales", "High"])
y = csvFile["High"]

X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.5, random_state=1)

tree_model = DecisionTreeClassifier(random_state=1)
tree_model.fit(X_train, y_train)

y_pred = tree_model.predict(X_test)

conf_matrix = confusion_matrix(y_test, y_pred)
print(conf_matrix)
# Classification: PREPROCESS




"""
From here we can see that it had 95 true negatives, 25 false positives, 30 false negativesm and 51 true positives. This gives us a precision of 0.67 and a recall of 0.63. It also gives us an accuracy of 72.5%
"""



path = tree_model.cost_complexity_pruning_path(X_train, y_train)
ccpAlphas = path.ccp_alphas

cv_scores = []
best_accuracy = 0
best_alpha = 0
for alpha in ccpAlphas:
    pruned_tree = DecisionTreeClassifier(random_state=0, ccp_alpha=alpha)
    scores = cross_val_score(pruned_tree, X_train, y_train, cv=5)
    accuracy = scores.mean()
    cv_scores.append(accuracy)
    if accuracy > best_accuracy:
        best_accuracy = accuracy
        best_alpha = alpha

print(f"Best accuracy {best_accuracy:.4f}, with alpha: {best_alpha:.4f}")
# Classification: PREPROCESS




"""
In this case pruning the tree gave us a slightly worse score, 71% instead of the previous 72.5%
"""



plt.plot(ccpAlphas, cv_scores, marker='o', color='black')

plt.xlabel("Alpha")
plt.ylabel("Cross-Validation Accuracy")
plt.show()
# Classification: PREPROCESS




"""
This shows our results from the previous test in graph form where we can see that an alpha of 0.0128 gives us a score of 71%
"""



pruned_tree = DecisionTreeClassifier(random_state=0, ccp_alpha=best_alpha)
pruned_tree.fit(X_train, y_train)

plot_tree(pruned_tree, filled=True, feature_names=X_train.columns, class_names=["No", "Yes"], impurity=False)
plt.title("Pruned Decision Tree")
plt.show()
# Classification: PREPROCESS




y_pred = pruned_tree.predict(X_test)

conf_matrix = confusion_matrix(y_test, y_pred)
print(conf_matrix)
# Classification: PREPROCESS




"""
This gives us an accuracy of 72.5% when using the test data which is the same as without the pruning but with a more interperatable tree. 
"""



best_alpha = 0
for alpha in ccpAlphas:
    pruned_tree = DecisionTreeClassifier(random_state=0, ccp_alpha=alpha)
    pruned_tree.fit(X_train, y_train)
    if pruned_tree.get_n_leaves() <= 18:
        best_alpha = alpha
        break

pruned_tree = DecisionTreeClassifier(random_state=0, ccp_alpha=best_alpha)
pruned_tree.fit(X_train, y_train)

y_pred = pruned_tree.predict(X_test)
conf_matrix = confusion_matrix(y_test, y_pred)
print("Confusion Matrix:")
print(conf_matrix)

plt.figure(figsize=(12, 6))
plot_tree(pruned_tree, filled=True, feature_names=X_train.columns, class_names=["No", "Yes"])
plt.show()
# Classification: TRAIN




"""
Now we are getting a slightly better score of 73%
"""



"""
Load Boston dataset
"""



csvFile = pd.read_csv("Boston.csv", index_col=0)
# Classification: TRAIN




"""
Regression tree
"""



X = csvFile.drop(columns=["medv"])
y = csvFile["medv"]
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.5, random_state=1)
tree = DecisionTreeRegressor(random_state=1, max_leaf_nodes=7)
tree.fit(X_train, y_train)

print(f"Number of leaves: {tree.get_n_leaves()}")
print(f"Depth of tree: {tree.get_depth()}")
print(f"Residual mean deviance: {tree.tree_.impurity.mean():.4f}")
# Classification: PREPROCESS




"""
Plot the tree
"""



plot_tree(tree, feature_names=X.columns, filled=True, rounded=True, impurity=False, fontsize=5, label="none")
plt.show()
# Classification: PREDICT




"""
The residual mean deviance is 26.09 which is a way of measuring deviance
"""



path = tree.cost_complexity_pruning_path(X_train, y_train)
ccpAlphas = path.ccp_alphas

cv_scores = []
best_accuracy = 1000000
best_alpha = 0
for alpha in ccpAlphas:
    pruned_tree = DecisionTreeRegressor(random_state=0, ccp_alpha=alpha)
    scores = -cross_val_score(pruned_tree, X_train, y_train, cv=5, scoring="neg_mean_squared_error")
    accuracy = scores.mean()
    cv_scores.append(accuracy)
    if accuracy < best_accuracy:
        best_accuracy = accuracy
        best_alpha = alpha

pruned_tree = DecisionTreeRegressor(random_state=0, ccp_alpha=best_alpha)
pruned_tree.fit(X_train, y_train)
y_pred = pruned_tree.predict(X_test)
mse = mean_squared_error(y_test, y_pred)

print(f"Best error {mse:.4f}, with alpha: {best_alpha:.4f}")
plt.plot(ccpAlphas, cv_scores, marker='o', color='black')

plt.xlabel("Alpha")
plt.ylabel("Cross-Validation Accuracy")
plt.show()
# Classification: PREDICT




"""
We now got an error of 17.92 which is an improvement from without pruning
"""



yhat = tree.predict(X_test)

plt.figure(figsize=(8, 6))
plt.scatter(yhat, y_test, alpha=0.6, edgecolors="k")
plt.plot([min(yhat), max(yhat)], [min(yhat), max(yhat)], color="red", linestyle="--")
plt.xlabel("Predicted MEDV")
plt.ylabel("Actual MEDV")
plt.show()

mse = np.mean((yhat - y_test) ** 2)
print(f"Mean Squared Error: {mse:.4f}")
# Classification: PREPROCESS




"""
Here we can see that the model follows the actual values pretty well with a mean squared error or 17.9 which is about the same as before
"""



"""
Learn and assess Regression Bagging (Trees) and Random Forests
"""



rf = RandomForestRegressor(n_estimators=500, max_features=13, random_state=1)
rf.fit(X_train, y_train)

yhat_bag = rf.predict(X_test)
mse_bag = mean_squared_error(y_test, yhat_bag)
r2_bag = r2_score(y_test, yhat_bag)
print(f"MSE: {mse_bag:.4f}")
print(f"R²: {100 * r2_bag:.2f}%")

plt.figure(figsize=(8, 6))
plt.scatter(yhat_bag, y_test, alpha=0.6, edgecolors="k")
plt.plot([min(yhat_bag), max(yhat_bag)], [min(yhat_bag), max(yhat_bag)], color="red", linestyle="--")
plt.xlabel("Predicted MEDV")
plt.ylabel("Actual MEDV")
plt.title("Bagging Model")
plt.show()
# Classification: PREDICT




"""
This model has an MSE of 11.73 which is better than the previous 17.92
"""



rf = RandomForestRegressor(n_estimators=25, max_features=13, random_state=1)
rf.fit(X_train, y_train)

yhat_bag = rf.predict(X_test)
mse_bag = mean_squared_error(y_test, yhat_bag)
r2_bag = r2_score(y_test, yhat_bag)
print(f"MSE: {mse_bag:.4f}")
print(f"R²: {100 * r2_bag:.2f}%")
# Classification: PREPROCESS




"""
Now we are getting a worse MSE of 13.27 instead because we have fewer parameters the model can use for tuning
"""



rf = RandomForestRegressor(n_estimators=500, max_features=6, random_state=1)
rf.fit(X_train, y_train)

yhat_bag = rf.predict(X_test)
mse_bag = mean_squared_error(y_test, yhat_bag)
r2_bag = r2_score(y_test, yhat_bag)
print(f"MSE: {mse_bag:.4f}")
print(f"R²: {100 * r2_bag:.2f}%")

plt.figure(figsize=(8, 6))
plt.scatter(yhat_bag, y_test, alpha=0.6, edgecolors="k")
plt.plot([min(yhat_bag), max(yhat_bag)], [min(yhat_bag), max(yhat_bag)], color="red", linestyle="--")
plt.xlabel("Predicted MEDV")
plt.ylabel("Actual MEDV")
plt.title("Bagging Model")
plt.show()
# Classification: PREDICT




"""
This was almost the same result as we got before
"""



feature_importances = rf.feature_importances_

sorted_indices = np.argsort(feature_importances)[::-1]
feature_names = X_train.columns

print("Feature Importances:")
for i in sorted_indices:
    print(f"{feature_names[i]}: {feature_importances[i]:.4f}")

plt.figure(figsize=(10, 6))
plt.barh(range(len(feature_importances)), feature_importances[sorted_indices], align="center")
plt.yticks(range(len(feature_importances)), np.array(feature_names)[sorted_indices])
plt.xlabel("Feature Importance")
plt.gca().invert_yaxis()
plt.show()
# Classification: PREPROCESS




"""
Here we can see that lstat is the most important variable and chas is the least important in this random forest based model
"""



boost = GradientBoostingRegressor(loss="squared_error", n_estimators=5000, learning_rate=0.001, random_state=1)
boost.fit(X_train, y_train)
feature_importances = boost.feature_importances_
sorted_indices = np.argsort(feature_importances)[::-1]
feature_names = X.columns

for i in sorted_indices:
    print(f"{feature_names[i]}: {feature_importances[i]:.4f}")

plt.figure(figsize=(10, 6))
plt.barh(range(len(feature_importances)), feature_importances[sorted_indices], align="center")
plt.yticks(range(len(feature_importances)), np.array(feature_names)[sorted_indices])
plt.xlabel("Feature Importance")
plt.gca().invert_yaxis()
plt.show()
# Classification: PREDICT




"""
Same thing here that lstat is the most influential parameter, but this time however, zn is the least influential parameter
"""



yhat = boost.predict(X_test) 
mse_boost = mean_squared_error(y_test, yhat)
print(f"MSE: {mse_boost:.4f}")
# Classification: PREDICT




"""
Here we are getting a slightly better MSE however it is quite small so we probably need a significance test to see wether it is significantly better
"""



boost = GradientBoostingRegressor(loss="squared_error", n_estimators=5000, learning_rate=0.2, random_state=1)
boost.fit(X_train, y_train)
feature_importances = boost.feature_importances_
sorted_indices = np.argsort(feature_importances)[::-1]
feature_names = X.columns

for i in sorted_indices:
    print(f"{feature_names[i]}: {feature_importances[i]:.4f}")

plt.figure(figsize=(10, 6))
plt.barh(range(len(feature_importances)), feature_importances[sorted_indices], align="center")
plt.yticks(range(len(feature_importances)), np.array(feature_names)[sorted_indices])
plt.xlabel("Feature Importance")
plt.gca().invert_yaxis()
plt.show()

yhat = boost.predict(X_test) 
mse_boost = mean_squared_error(y_test, yhat)
print(f"\nMSE: {mse_boost:.4f}")

plt.figure(figsize=(8, 6))
plt.scatter(yhat, y_test, alpha=0.6, edgecolors="k")
plt.plot([min(yhat), max(yhat)], [min(y_test), max(y_test)], color="red", linestyle="--")
plt.xlabel("Predicted MEDV")
plt.ylabel("Actual MEDV")
plt.show()
# Classification: TRAIN




"""
Changing learning_rate to 0.2 gave us a slightly worse score. There is also a scatter plot of the prediction vs the actual values.
"""


