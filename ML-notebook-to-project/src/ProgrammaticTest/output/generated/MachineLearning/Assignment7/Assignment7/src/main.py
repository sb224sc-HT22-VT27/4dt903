
"""
# Assignment 7 vj222hx
"""



"""
## Conceptual
1. SVM aims to create a hyperplane which seperates two classes which tries to maximize the margin to the closest point in each class. If a hyperplane cannot be created between the classes, a slack variable can be added or you can add dimensions to the points which makes it easier to make a hyperplane seperating the classes.
2. SVMs are generally quite robust to overfitting however noisy data can lead to overfitting. Certain kernels such as rbf can be more accurate than linear, but is more susceptible to overfitting. Small values for C allows for some missclassification which reduces overfitting. 
"""



"""
# Practical
"""



"""
Add imports
"""



import numpy as np
import matplotlib.pyplot as plt
import pandas as pd
from sklearn.svm import SVC
from sklearn.model_selection import GridSearchCV
from sklearn.metrics import confusion_matrix
# Classification: TRAIN




"""
Generate 20 random points in two classes
"""



np.random.seed(1)
x = np.random.randn(20, 2)
y = np.concatenate([-np.ones(10), np.ones(10)])
x[y == 1] += 1

plt.scatter(x[:, 0], x[:, 1], c=(3 - y))
plt.show()

print(x)
print(y)
# Classification: TRAIN




dat = pd.DataFrame({'X1': x[:, 0], 'X2': x[:, 1], 'y': y.astype(int)})
print(dat)

svm = SVC(kernel="linear", C=10)
svm.fit(dat[['X1', 'X2']], dat['y'])

plt.figure(figsize=(8, 6))
plt.scatter(x[:, 0], x[:, 1], c=y)

ax = plt.gca()
xlim = ax.get_xlim()
ylim = ax.get_ylim()

xx, yy = np.meshgrid(np.linspace(xlim[0], xlim[1], 50), np.linspace(ylim[0], ylim[1], 50))
xy = np.c_[xx.ravel(), yy.ravel()]
Z = svm.decision_function(xy).reshape(xx.shape)

ax.contour(xx, yy, Z, levels=[-1, 0, 1], linestyles=['dashed', 'solid', 'dashed'], colors='black')

plt.show()
# Classification: PREPROCESS




support_vector_indices = svm.support_
print(support_vector_indices)
# Classification: PREPROCESS




svm = SVC(kernel="linear", C=0.1)
svm.fit(dat[['X1', 'X2']], dat['y'])

plt.figure(figsize=(8, 6))
plt.scatter(x[:, 0], x[:, 1], c=y)

ax = plt.gca()
xlim = ax.get_xlim()
ylim = ax.get_ylim()

xx, yy = np.meshgrid(np.linspace(xlim[0], xlim[1], 50), np.linspace(ylim[0], ylim[1], 50))
xy = np.c_[xx.ravel(), yy.ravel()]
Z = svm.decision_function(xy).reshape(xx.shape)

ax.contour(xx, yy, Z, levels=[-1, 0, 1], linestyles=['dashed', 'solid', 'dashed'], colors='black')

plt.show()
# Classification: PREDICT




"""
The smaller value of C makes it allow for a larger error but also reduces the risk of overfitting. 
"""



param_grid = {'C': [0.001, 0.01, 0.1, 1, 5, 10, 100]}

grid_search = GridSearchCV(SVC(kernel="linear"), param_grid, cv=10)
grid_search.fit(dat[['X1', 'X2']], dat['y'])

cv_results = pd.DataFrame(grid_search.cv_results_)[['param_C', 'mean_test_score', 'std_test_score']]
print(cv_results)

print("\nBest C:", grid_search.best_params_['C'])
print("Best Accuracy:", grid_search.best_score_)
# Classification: TRAIN




"""
Here we are getting a 95% accuracy with a C value of 0.001

Fit a model with the C value
"""



np.random.seed(1)
svm = SVC(kernel="linear", C=0.001)
svm.fit(dat[['X1', 'X2']], dat['y'])
xtest = np.random.randn(20, 2)
ytest = np.random.choice([-1, 1], size=20, replace=True)
xtest[ytest == 1] += 1

ypred = svm.predict(xtest)
conf_matrix = confusion_matrix(ytest, ypred)
print("Confusion Matrix:\n", conf_matrix)
# Classification: PREDICT




"""
With the newly generated datapoints we are getting an accuracy of 80%
"""



np.random.seed(1)
x = np.random.randn(200, 2)
x[:100] += 2
x[100:150] -= 2
y = np.concatenate([-np.ones(150), np.ones(50)])
dat = pd.DataFrame({'X1': x[:, 0], 'X2': x[:, 1], 'y': y.astype(int)})

plt.figure(figsize=(8, 6))
plt.scatter(x[:, 0], x[:, 1], c=(3 - y), cmap="viridis")
plt.xlabel("X1")
plt.ylabel("X2")
plt.title("Generated Data")
plt.show()

print(x)
print(y)
# Classification: PREDICT




np.random.seed(1)
train_indices = np.random.choice(200, 100, replace=False)

train_data = dat.iloc[train_indices]
test_data = dat.drop(train_indices)

svmfit = SVC(kernel="rbf", gamma=1, C=1)
svmfit.fit(train_data[['X1', 'X2']], train_data['y'])

plt.figure(figsize=(8, 6))
plt.scatter(train_data['X1'], train_data['X2'], c=train_data['y'])
xlim, ylim = plt.xlim(), plt.ylim()
xx, yy = np.meshgrid(np.linspace(xlim[0], xlim[1], 100), np.linspace(ylim[0], ylim[1], 100))
xy = np.c_[xx.ravel(), yy.ravel()]
Z = svmfit.decision_function(xy).reshape(xx.shape)

plt.contour(xx, yy, Z, levels=[0], linestyles=['solid'], colors='black')

plt.xlabel("X1")
plt.ylabel("X2")
plt.show()
# Classification: PREDICT




train_indices = np.random.choice(200, 100, replace=False)

train_data = dat.iloc[train_indices]
test_data = dat.drop(train_indices)

svmfit = SVC(kernel="rbf", gamma=1, C=100)
svmfit.fit(train_data[['X1', 'X2']], train_data['y'])

plt.figure(figsize=(8, 6))
plt.scatter(train_data['X1'], train_data['X2'], c=train_data['y'])
xlim, ylim = plt.xlim(), plt.ylim()
xx, yy = np.meshgrid(np.linspace(xlim[0], xlim[1], 100), np.linspace(ylim[0], ylim[1], 100))
xy = np.c_[xx.ravel(), yy.ravel()]
Z = svmfit.decision_function(xy).reshape(xx.shape)

plt.contour(xx, yy, Z, levels=[0], linestyles=['solid'], colors='black')

plt.xlabel("X1")
plt.ylabel("X2")
plt.show()
# Classification: TRAIN




param_grid = {'C': [0.1, 1, 10, 100, 1000], 'gamma': [0.5, 1]}

grid_search = GridSearchCV(SVC(kernel="rbf"), param_grid, cv=10)
grid_search.fit(dat[['X1', 'X2']], dat['y'])

cv_results = pd.DataFrame(grid_search.cv_results_)[['param_C', 'param_gamma', 'mean_test_score', 'std_test_score']]
print(cv_results)

print("\nBest C:", grid_search.best_params_['C'])
print("Best Gamma:", grid_search.best_params_['gamma'])
print(f"Best Accuracy: {grid_search.best_score_:.2f}")
# Classification: PREPROCESS




"""
Here we got an accuracy of 94% with a C of 1 and a gamma of 0.5
"""



svm = SVC(kernel="rbf", C=1, gamma=0.5)
svm.fit(dat[['X1', 'X2']], dat['y'])

xtest = np.random.randn(100, 2)
xtest[:50] += 2
xtest[50:75] -= 2
ytest = np.concatenate([-np.ones(75), np.ones(25)])

ypred = svm.predict(xtest)
conf_matrix = confusion_matrix(ytest, ypred)
print("Confusion Matrix:\n", conf_matrix)
# Classification: PREDICT




"""
When trying with the test data, we get an accuracy 82% on the training data
"""



x = np.vstack([x, np.random.randn(50, 2)])
y = np.concatenate([y, np.zeros(50)])

x[y == 0, 1] += 2 

dat = pd.DataFrame({'X1': x[:, 0], 'X2': x[:, 1], 'y': y})

plt.figure(figsize=(8, 6))
plt.scatter(dat['X1'], dat['X2'], c=dat['y'])
plt.xlabel("X1")
plt.ylabel("X2")
plt.show()

print(dat)
# Classification: TRAIN




np.random.seed(1)
train_indices = np.random.choice(250, 125, replace=False)

train_data = dat.iloc[train_indices]
test_data = dat.drop(train_indices)

svm = SVC(kernel="rbf", C=10, gamma=1)
svm.fit(train_data[['X1', 'X2']], train_data['y'])

plt.figure(figsize=(8, 6))
plt.scatter(dat['X1'], dat['X2'], c=dat['y'])

xlim, ylim = plt.xlim(), plt.ylim()
xx, yy = np.meshgrid(np.linspace(xlim[0], xlim[1], 100), np.linspace(ylim[0], ylim[1], 100))

xy = np.c_[xx.ravel(), yy.ravel()]
Z = svm.predict(xy)
Z = Z.reshape(xx.shape)

plt.contour(xx, yy, Z)
plt.xlabel("X1")
plt.ylabel("X2")
plt.title("SVM Decision Boundaries for Multi-Class Classification")
plt.show()
# Classification: PREPROCESS




param_grid = {'C': [0.1, 1, 10, 100, 1000], 'gamma': [0.5, 1, 2, 3, 4]}


grid_search = GridSearchCV(SVC(kernel="rbf"), param_grid, cv=10)
grid_search.fit(dat[['X1', 'X2']], dat['y'])

cv_results = pd.DataFrame(grid_search.cv_results_)[['param_C', 'param_gamma', 'mean_test_score', 'std_test_score']]
print(cv_results)

print("\nBest C:", grid_search.best_params_['C'])
print("Best Gamma:", grid_search.best_params_['gamma'])
print(f"Best Accuracy: {grid_search.best_score_:.2f}")
# Classification: TRAIN




svm = SVC(kernel="rbf", C=1, gamma=0.5)
svm.fit(train_data[['X1', 'X2']], train_data['y'])
y_pred = svm.predict(test_data[['X1', 'X2']])
cm = confusion_matrix(test_data['y'], y_pred)
print("Confusion Matrix:\n", conf_matrix)
# Classification: PREDICT




"""
Here we are getting a 93% accuracy using the training data
"""



"""
Load the datasets
"""



xtrain = pd.read_csv("data/Khan_xtrain.csv", index_col=0)
xtest = pd.read_csv("data/Khan_xtest.csv", index_col=0)
ytrain = pd.read_csv("data/Khan_ytrain.csv", index_col=0)
ytest = pd.read_csv("data/Khan_ytest.csv", index_col=0)

print(len(xtrain), len(xtrain.columns.tolist()))
print(len(xtest), len(xtest.columns.tolist()))
# Classification: PREPROCESS




ytrain = ytrain.iloc[:, 0]

svm_model = SVC(kernel="linear", C=10)
svm_model.fit(xtrain, ytrain)

print("Number of Support:", svm_model.n_support_)
print("Number of classes:", svm_model.classes_)
# Classification: PREPROCESS




y_train_pred = svm_model.predict(xtrain)
conf_matrix = confusion_matrix(ytrain, y_train_pred)
conf_matrix_df = pd.DataFrame(conf_matrix, index=svm_model.classes_, columns=svm_model.classes_)

print(conf_matrix_df)
# Classification: PREDICT




y_test_pred = svm_model.predict(xtest)
conf_matrix_test = confusion_matrix(ytest, y_test_pred)

conf_matrix_test_df = pd.DataFrame(conf_matrix_test, index=svm_model.classes_, columns=svm_model.classes_)
print(conf_matrix_test_df)
# Classification: PREDICT




"""
Here, we are only getting two predictions wrong which leads to a 90% accuracy
"""


