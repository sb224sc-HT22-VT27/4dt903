
"""
# Assignment 2 vj222hx
"""



"""
Add imports
"""



import numpy as np
import matplotlib.pyplot as plt
from sklearn.decomposition import PCA
from sympy import Matrix
# Classification: PREDICT




"""
### Generate bi-variate normal random numbers
"""



mu = [2, 3]
cov = [[2, 1.5], [1.5, 4]]

np.random.seed(0)
R = np.random.multivariate_normal(mu, cov, 100)

plt.plot(R[:, 0], R[:, 1], '+')
plt.show()
# Classification: TRAIN




"""
Check variance and correlation
"""



Sample_cov = np.cov(R, rowvar=False)

Cor = np.corrcoef(R, rowvar=False)

print("Sample covariance:\n", Sample_cov)
print("\nCorrelation:\n", Cor)
# Classification: PREPROCESS




"""
Double check cor
"""



print(1.5552 / (2.0479**0.5 * 4.2666**0.5))
# Classification: PREPROCESS




"""
###  Perform PCA on the bi-variate normal random numbers
"""



pca = PCA()
pca.fit(R)

loading_vector = pca.components_.T

latent = pca.explained_variance_

score = pca.transform(R)

variability_explained = pca.explained_variance_ratio_ * 100

print("Loading vectors:\n", loading_vector)
print("\nVariance explained:\n", variability_explained)
# Classification: TRAIN




"""
Check correlation
"""



print(np.corrcoef(score, rowvar=False))
# Classification: PREPROCESS




print("PC1:", np.linalg.norm(loading_vector[:, 0]))
print("PC2:", np.linalg.norm(loading_vector[:, 1]))
print("Dot prod:", np.dot(loading_vector[:, 0], loading_vector[:, 1]))
# Classification: PREPROCESS




plt.scatter(score[:, 0], score[:, 1])

plt.arrow(0, 0, loading_vector[0, 0]*3, loading_vector[0, 1]*3, head_width=0.1)
plt.arrow(0, 0, loading_vector[1, 0]*3, loading_vector[1, 1]*3, head_width=0.1)

plt.xlabel("PC1")
plt.ylabel("PC2")
plt.grid(True)
plt.show()
# Classification: PREPROCESS




"""
### Perform PCA step-by-step
"""



data = R
data[:, 0] = (R[:, 0] - np.mean(R[:, 0])) / np.sqrt(2.0479)
data[:, 1] = (R[:, 1] - np.mean(R[:, 1])) / np.sqrt(4.2666)

Cov = np.cov(data, rowvar=False)

print(Cov)
# Classification: PREPROCESS




eigenvals, eigenvectors = np.linalg.eig(Cov)
print("eigenvectors\n", eigenvectors)
print("eigenvalues\n", eigenvals)
# Classification: PREPROCESS




"""
Check eigenvalues
"""



print(Cov @ eigenvectors[:, 0] - eigenvals[0] * eigenvectors[:, 0])
print(Cov @ eigenvectors[:, 1] - eigenvals[1] * eigenvectors[:, 1])
# Classification: PREPROCESS




print(np.linalg.norm(eigenvectors[:, 0]))
print(np.linalg.norm(eigenvectors[:, 1]))
print(np.dot(eigenvectors[:, 0], eigenvectors[:, 1]))
# Classification: PREPROCESS




score = data@eigenvectors
print(np.corrcoef(score, rowvar=False))
# Classification: PREPROCESS




plt.scatter(score[:, 0], score[:, 1])

plt.arrow(0, 0, eigenvectors[0, 0]*2, eigenvectors[0, 1]*2, head_width=0.1)
plt.arrow(0, 0, eigenvectors[1, 0]*2, eigenvectors[1, 1]*2, head_width=0.1)
plt.xlabel("PC1")
plt.ylabel("PC2")
plt.grid(True)
plt.show()
# Classification: PREPROCESS




variances = np.var(score, axis=0)
print("Variances:", variances)
print("Explained variance ratio:", variances / sum(variances))
# Classification: PREPROCESS




"""
Eigenvectors can be negated and that is probably why my arrows are pointing down while they are pointing up in the matlab example, the fix is just to negate the eigenvectors, below is the fixed version
"""



plt.scatter(score[:, 0], score[:, 1])

plt.arrow(0, 0, -eigenvectors[0, 0]*2, -eigenvectors[0, 1]*2, head_width=0.1)
plt.arrow(0, 0, -eigenvectors[1, 0]*2, -eigenvectors[1, 1]*2, head_width=0.1)
plt.xlabel("PC1")
plt.ylabel("PC2")
plt.grid(True)
plt.show()
# Classification: PREPROCESS




print("Covariance matrix\n", Cov)
a = 1
b = -Cov[0, 0] - Cov[1, 1]
c = Cov[0, 0] * Cov[1, 1] - Cov[0, 1] * Cov[1, 0]

eigenvalues = np.roots([a, b, c])
print("Eigenvalues\n", eigenvalues)
# Classification: PREPROCESS




lambda1 = np.diag([eigenvalues[0], eigenvalues[0]])
print("lambda 1\n", lambda1)
Char1 = Cov - lambda1
print(np.linalg.det(Char1))

lambda2 = np.diag([eigenvalues[1], eigenvalues[1]])
Char2 = Cov - lambda2
print(np.linalg.det(Char2))
# Classification: TRAIN




A1 = Cov - lambda1

print("A1:\n", A1)
print("Rank A1:", np.linalg.matrix_rank(A1))
print("Det A1:", np.linalg.det(A1))
rref = np.array(Matrix(np.round(A1, 5)).rref()[0]).astype(np.float64)
print("RREF A1:\n", rref)
# Classification: TRAIN




v1 = np.array([-rref[0, 1], 1])
print("Eigenvector 1:", v1 / np.linalg.norm(v1))
# Classification: PREPROCESS




A2 = Cov - lambda2
rref2 = np.array(Matrix(np.round(A2, 5)).rref()[0]).astype(np.float64)
v2 = np.array([-rref2[0, 1], 1])
print("Eigenvector 2:", v2 / np.linalg.norm(v2))
# Classification: TRAIN



