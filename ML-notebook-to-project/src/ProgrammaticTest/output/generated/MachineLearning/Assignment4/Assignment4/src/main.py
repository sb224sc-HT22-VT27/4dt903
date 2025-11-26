		
"""
# Assignmen 4 vj222hx
"""


		
"""
## Conceptual
1. LDA assumes that all classes share the same covariance matrix, but we cannot assume this for QDA meaning we need k covariance matrices for k classes.
   
   The decision boundary for LDA is linear and it is quadratic for QDA as per their names. 

   LDA generally reqires fewer samples than QDA because it is fewer parameters to estimate. 

   Since QDA has more parameters it can be more accurate but it also has a higher possibility to be overfitted. 

2. a) There are different distance metrics that can be used such as Euclidean distance and Manhattan distance. If the predictors have different scales, the data can be normalized to bring them onto a similar scale. 

b) Curse of dimentionality referes to the issue with distance based algorithms that the datapoints get sparser the more dimentions are added which can make the alorithm less accurate. 
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
from sklearn.discriminant_analysis import LinearDiscriminantAnalysis as LDA
from sklearn.discriminant_analysis import QuadraticDiscriminantAnalysis as QDA
from sklearn.metrics import accuracy_score
from sklearn.neighbors import KNeighborsClassifier as KNN
# Classification: PREPROCESS



		
"""
Load Smarket dataset
"""


		
csvFile = pd.read_csv("Smarket.csv", index_col=0)
# Classification: PREPROCESS



		
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


		
print(csvFile.describe())
print(csvFile['Direction'].value_counts())
# Classification: TRAIN



		
"""
Display the number of datapoints
"""


		
print(f"Number of datapoints {len(csvFile)}")
# Classification: PREPROCESS



		
"""
Display the data in a table
"""


		
print(csvFile.head(20))
# Classification: PREDICT



		
"""
Correlation Plot
"""


		
sns.heatmap(csvFile.drop(columns=['Direction']).corr(), annot=True, fmt=".2f", linewidths=0.5)
plt.show()
# Classification: PREPROCESS



		
"""
Here we can see that most values have very little to no correlation except for year and volume which have a correlation of 0.54. This means that an increase in year number correlates with an increase in volume. 
"""


		
sns.scatterplot(data=csvFile, x='Year', y='Volume', color="black")
sns.regplot(data=csvFile, x="Year", y="Volume", color="black")
# Classification: TRAIN



		
"""
This graph reinforces what we saw in the previous heatmap that an increase in year has a positive coorelation with Volume
"""


		
"""
Logistics regression
"""


		
X = csvFile[['Lag1', 'Lag2', 'Lag3', 'Lag4', 'Lag5', 'Volume']]
X = sm.add_constant(X)
y = csvFile['Direction'].map({'Up': 1, 'Down': 0})
model = sm.Logit(y, X).fit()

print(model.summary())
# Classification: PREPROCESS



		
"""
The p values for the coefficients are all > 0.05 which means they are not significant enough for predicting the direction
"""


		
"""
Predict using the model
"""


		
probs = model.predict()

for i in range(10):
    print(f"{i + 1}   {probs[i]}")
# Classification: TRAIN



		
"""
This shows the probability that the value market will go up rather than down as that is what we defined with csvFile['Direction'].map({'Up': 1, 'Down': 0})
"""


		
"""
Confusion matrix
"""


		
pred = []
for i in probs:
    if i > 0.5:
        pred.append("Up")
    else:
        pred.append("Down")

print(pd.crosstab(pred, csvFile["Direction"]))
accuracy = np.mean(pred == csvFile["Direction"])
print(f"Model Accuracy: {accuracy}")
# Classification: PREDICT



		
"""
When we printed 10 values we can see that all values are close to 0.5 which indicates that it it not a confident prediction. This is reinforced with a model accuracy of 52.16% which is slightly better than a coin toss. 
"""


		
X = csvFile[['Lag1', 'Lag2']]
X = sm.add_constant(X)
model = sm.Logit(y, X).fit()
probs = model.predict(X)

pred = []
for i in probs:
    if i > 0.5:
        pred.append("Up")
    else:
        pred.append("Down")

print(pd.crosstab(pred, csvFile["Direction"]))
accuracy = np.mean(pred == csvFile['Direction'])
print(f"Model Accuracy: {accuracy}")
# Classification: PREDICT



		
"""
This shows that only using Lag1 and Lag2 gives a slightly better accuracy than having all the predictors, however we do not know if this is significant. 
"""


		
X = csvFile[['Lag1', 'Lag2']]
model = LDA()
model.fit(X, y)
print(f"Prior probabilities of groups: {model.priors_}")
print(f"Group means:\n{model.means_}")
print(f"Coefficients of linear discriminants: {model.coef_}")

transform = model.transform(X)
lda_df = pd.DataFrame({'LDA1': transform[:, 0], 'Direction': y})

fig, axes = plt.subplots(nrows=2, ncols=1, figsize=(8, 6))

subset = lda_df[lda_df['Direction'] == 0]
axes[0].hist(subset['LDA1'], bins=20, density=True)
axes[0].set_ylabel("Density")
axes[0].set_title(f"Group Down")

subset = lda_df[lda_df['Direction'] == 1]
axes[1].hist(subset['LDA1'], bins=20, density=True)
axes[1].set_ylabel("Density")
axes[1].set_title(f"Group Down")

plt.xlabel("LDA Projection")
plt.tight_layout()
plt.show()
# Classification: PREPROCESS



		
"""
From the first print we can see that there is 51.84% up in the data and the rest is down. From the second print we can see that the average value for Lag1 when the direction is down is 0.05, the average value for Lag2 when the direction is down is 0.03. Lag1 and Up is -0.04 and Lag2 and Up is -0.02. The last print shows that an increase in Lag1 or Lag2 will generally trend towards a down direction because the coefficients are negative. The graphs show that there is some overlap meaning that it might not be a good predictor of direction.
"""


		
lda_class = model.predict(X)
conf_matrix = pd.crosstab(lda_class, y)
accuracy = accuracy_score(y, lda_class)
print("Confusion Matrix:\n", conf_matrix)
print("Accuracy:", accuracy)
# Classification: PREPROCESS



		
"""
Here we get the same result as when we used logistics regression which means LDA does not contrinbute any more than logistics regression
"""


		
"""
QDA
"""


		
model = QDA()
model.fit(X, y)
print(f"Prior probabilities of groups: {model.priors_}")
print(f"Group means:\n{model.means_}")
# Classification: TRAIN



		
"""
These numbers are the same as with LDA which is excpected since we are using the same data
"""


		
"""
Predict using QDA
"""


		
qda_class = model.predict(X)

conf_matrix = pd.crosstab(qda_class, y, rownames=['Predicted'], colnames=['Actual'])

accuracy = accuracy_score(y, qda_class)

# Print results
print("\nConfusion Matrix:\n", conf_matrix)
print("\nAccuracy:", accuracy)
# Classification: PREDICT



		
"""
Here we got a slightly better accuracy than with LDA which is expected since it has more parameters to utilize, however it also has a higher risk of overfitting
"""


		
"""
Use KNN clustering
"""


		
train = csvFile['Year'] < 2005
print(csvFile[~train].shape)
# Classification: TRAIN



		
train_X = csvFile[['Lag1', 'Lag2']][train]
test_X = csvFile[['Lag1', 'Lag2']][~train]

train_direction = csvFile['Direction'][train]
test_direction = csvFile['Direction'][~train]

knn_model = KNN(n_neighbors=1)
knn_model.fit(train_X, train_direction)

knn_pred = knn_model.predict(test_X)

conf_matrix = pd.crosstab(knn_pred, test_direction, rownames=['Predicted'], colnames=['Actual'])

accuracy = accuracy_score(test_direction, knn_pred)

print("Confusion Matrix:\n", conf_matrix)
print("Accuracy:", accuracy)
# Classification: PREDICT



		
knn_model = KNN(n_neighbors=3)
knn_model.fit(train_X, train_direction)

knn_pred = knn_model.predict(test_X)

conf_matrix = pd.crosstab(knn_pred, test_direction, rownames=['Predicted'], colnames=['Actual'])

accuracy = accuracy_score(test_direction, knn_pred)

print("Confusion Matrix:\n", conf_matrix)
print("Accuracy:", accuracy)
# Classification: TRAIN



		
"""
When K=1 we get an accuracy of 0.5 is worse than before, however when putting k=3 we get a better accuracy than before, however we dont know if it is significant or not. 
"""


