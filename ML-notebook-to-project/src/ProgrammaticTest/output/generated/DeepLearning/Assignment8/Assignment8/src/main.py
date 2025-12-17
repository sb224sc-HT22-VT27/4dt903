
"""
# Variational Inference using VAEs and Normalizing Flows

## Setting the Scene

In this assignment, we implement a vanilla VAE from scratch and train it on grayscale images of the MNIST handwritten digits dataset.
Then, we train the same model but use a Normalizing Flow as variational distribution to approximate the true posterior.

For the (vanilla) VAE:

- Suggest one final version that uses dense-layers only *or* convolution/de-convolution.
- Assume a standard normal prior belief.
- Use a diagonal Gaussion as variational distribution.
- As reconstruction loss, choose between MSE and BCE.
- If necessary, implement it as a $\beta$-VAE that allows you to put an (adaptive) weight on the KL-divergence.

Much like the previous assignment, you shall fill out the blanks, answer the questions, and evaluate and compare your trained models.
However, we will not be implementing Normalizing Flows, due to the complexity of bijectors, conditioners, and other required coupling blocks.
Instead, you shall use a library/framework.

Suggested are these 2:

- PyTorch: Use the `normflows` package: <https://github.com/VincentStimper/normalizing-flows> (preferred)
- JAX: Use the `pzflow` package: <https://github.com/jfcrenshaw/pzflow>

It is acceptable to use something else, but make sure you can integrate it nicely into your VAE implementation.
As for the NF model itself:

- Use a diagonal Gaussian base distribution 
- Try to keep the model relatively shallow (less than ca. ten blocks)
- Attempt to use as few as possible parameters in the conditioners


# Part 1: Implement your own VAE

## Recap: Variational Bayes

In our first lecture and assignment, we took a Bayesian variational approach to **quantify uncertainty** in our model's parameters.
Let's call this **Scenario A**.

In **A**,
- we have a polynomial with a handful of parameters.
- Our prior belief over these parameters $p(\mathbf{w})=\mathcal{N}(0,I)$.
- The true posterior, $p(\mathbf{w}\vert\mathbf{X},\mathbf{y})$, is approximated using a mean-field variational distribution. Our choise was a diagonal Gaussian: $q_{\phi}(\mathbf{w})=\mathcal{N}(\mu_{\phi},\Sigma_{\phi})$.
- The ELBO was: $\text{ELBO}=\mathbb{E}_{q_{\phi}(\mathbf{w})}\left[\log{(p(\mathbf{y}|\mathbf{X},\mathbf{w}))}\right]-D_{\text{KL}}\left(q_{\phi}(\mathbf{w})\|p(\mathbf{w})\right)$.
- The Monte Carlo approximation of the ELBO is: $\text{ELBO}(\phi)\approx\frac{1}{S}\sum_{s=1}^{S}\,\underbrace{\left[\sum_{i=1}^{N}\,\log{(p(y_i|x_i,w^{(s)}))}\right]}_{\text{log-sum of i.i.d. observations}}-\underbrace{\left[\log{\left(q_{\mu,\sigma}\left(w^{(s)}\right)\right)}-\log{\left(p\left(w^{(s)}\right)\right)}\right]}_{\text{MC-approx. of KL-divergence}}$.


So, in order to introduce variation, we insert randomness into our model using the reparameterization trick.
Since we optimize the current $\mu,\sigma$ of our variational distribution, it needs to be differentiable w.r.t. those parameters.
Recall that $w=\mu+\sigma\cdot\epsilon$.
So, in order to average the effect of many different $w^{(s)}\in W$, we compute the mean of our model's predictions using these varying parameters.
Then, we maximize the average ELBO.
"""



"""
## Differences in a Variational Autoencoder

Now, in a vanilla variational autoencoder (VAE), we **quantify uncertainty in the latent variables, per individial observation**.
Here, we will make use of so-called **amortized inference**.

A VAE has these components:
- An **Encoder** Network.
    * Takes the input data and predicts, for **each** observation $x_i\in\mathbf{X}$, the parameters of our approximate posterior $q_{\phi}(\mathbf{Z}|\mathbf{X})=\mathcal{N}(\mathbf{Z}, \mathbf{\mu}_{\phi}(\mathbf{X}),\Sigma_{\phi}(\mathbf{X}))$.
    * The conditional prediction (per observation) of the variational parameters is called amortized inference.
    * If our latent dimension is 20, for example, then we would need to predict 20 means and 20 variances, per observation.
    * The reparameterization trick lies in constructing $z=\mu+\sigma\cdot\epsilon$ for an epsilon drawn from a standard normal. Then, it is this $z$ that gets decoded.
- A set of latent variables (denoted $\mathbf{Z}$). Usually the dimensionality of $\mathbf{Z}$ is lower than that of the input, $X$.
- A **Decoder** Network.
    * Given $\mathbf{Z}$, learns to predict a reconstructed $\mathbf{X}'\approx\mathbf{X}$.
"""



"""
<pre>
Input X --> Encoder Network (phi)  --> Latent variables Z ~ q_{phi}(Z|X) -->
    Decoder Network (theta)  -->  Reconstructed X (X').
</pre>
"""



"""
Notice how our **prior** belief relates now to hoe each $z_i$ is distributed.
Again, here we will assume $p(\mathbf{Z})\sim\mathcal{N}(0,I)$.
During training, we will minimize again the Kullback-Leibler divergence between this prior belief and our mean-field approximation:

$$
\begin{align}
    D_{\text{KL}}(q_{\phi}(z|x))\,\|\,p(z)
\end{align}
$$

for **each** observation $x$.
If we now add a reconstruction term, it will constitute the ELBO loss.
Since each observation constitutes itw own Gaussian in latent space, $q_{\phi}(z|x)$ differs for each x.
Therefore, only the **aggregate** distribution $q_{\phi}(z)$ matches the prior.
The encoder network naturally shares (has the same set of) parameters across all observations, making it generalize to the dataset.
"""



"""
## Implementation

The following is a skeleton for a PyTorch-based implementation.

You may or may not follow this skeleton, it is just a suggestion.

Choose one architecture that works best for you (dense *or* convolutional).
"""



import torch
from torch import nn, Tensor
from torch.distributions.normal import Normal

class MyVAE(nn.Module):
    """
    A vanilla VAE with standard normal prior belief and normal independent variational
    distribution. Has a configurable latent size.
    """

    def __init__(self, dim: int, dimZ: int=10, *args, **kwargs):
        super().__init__(*args, **kwargs)
        self.dim = dim
        self.dimZ = dimZ

        self.encoder = nn.Sequential(
            nn.Linear(dim, 512),
            nn.ReLU(),
            nn.Linear(512, 256),
            nn.ReLU()
        )
        self.muLayer = nn.Linear(256, dimZ)
        self.logvarLayer = nn.Linear(256, dimZ)

        self.decoder = nn.Sequential(
            nn.Linear(dimZ, 256),
            nn.ReLU(),
            nn.Linear(256, 512),
            nn.ReLU(),
            nn.Linear(512, dim),
            nn.Sigmoid()
        )

        self.prior = Normal(torch.zeros(dimZ), torch.ones(dimZ))
    
    def encode(self, x: Tensor) -> tuple[Tensor, Tensor]:
        """Encodes the input and returns the mus and variances."""
        h = self.encoder(x)
        mu = self.muLayer(h)
        logvar = self.logvarLayer(h)
        return mu, logvar
        
    def forward(self, x: Tensor) -> tuple[Tensor, Tensor]:
        """
        Takes the original input, encodes it, applies the R-trick,
        reconstructs the inputs, and calculates the KL-divergence.
        Returns the reconstruction and the divergence.
        """
        mu, logvar = self.encode(x)
        std = torch.exp(0.5 * logvar)
        z = mu + torch.randn_like(std) * std
        xRecon = self.decoder(z)
        q = Normal(mu, torch.exp(0.5 * logvar))
        kl = torch.distributions.kl_divergence(q, self.prior).sum(dim=1).mean()
        return xRecon, kl, z
    
    def sample(self, n: int) -> Tensor:
        """Sample from the trained model using the unconditional prior."""
        z = self.prior.sample((n,))
        return self.decoder(z)
    
# Classification: PREDICT




"""
# Part 2: Enhance VAE with a Normalizing Flow

When we change our the variational distribution of a VAE to be a Normalizing Flow, we still use the same ELBO.
But things change a little, because we kind of use the flow "backwards":

1. The encoder, as before, outputs variational parameters $\mu$ and $\sigma$, conditioned (*amortized*) on the input $x$.
2. We will assume a normal isotropic Gaussian as the NF's base distribution.
    * However, instead of parameterizing it directly and sampling from it, we have to apply the reparameterization trick.
    * It is simpler to just sample from a standard normal isotropic Gaussian and construct $z_0=\mu+\sigma\cdot\epsilon$.
3. $z_0$ enters the flow.
    * Through a series of $K$ transformations, it becomes $z_K=T_K\circ T_{K-1}\circ\dots\circ T_1(z_0)$.
    * The variational distribution is now $q_{\phi}(z_K\vert x)$.
4. $z_K$ is now fed into the decoder, that is, $x'\sim p_{\theta}(x\vert z_K)$, which shall reconstruct the original inputs $x$.

"""



"""
----

Since we assume a diagonal normal as base distribution for our normalizing flow here ($\psi$), the change-of-variables formula is defined as:

$$
\begin{align}
    q_{\phi}(z_K\vert x)=\psi_{\phi}(z_0)\,\left\lvert\operatorname{det}\frac{\partial\,z_0}{\partial\,z_K}\right\rvert=\psi_{\phi}(z_0)\prod_{k=1}^{K}\,\left\lvert\operatorname{det}\frac{\partial\,z_{k-1}}{\partial\,z_k}\right\rvert.
\end{align}
$$

----
"""



"""
## Define the Flow Model

Below is some boilerplate code for constructing a Normalizing Flow using the `normflows` package.
Even if you choose something else, perhaps you want to conceptually construct your flow similar to how it's done here.
"""



from normflows import NormalizingFlow
from normflows.flows import Flow, AutoregressiveRationalQuadraticSpline, LULinearPermute
from typing import override

def makeFlows(dim: int, K: int, units: int=128, layers: int=2) -> list[Flow]:
    """Repeats a sequence of pre-defined coupling blocks K times."""
    flows: list[Flow] = []
    for _ in range(K):
        flows.append(AutoregressiveRationalQuadraticSpline(
            num_input_channels=dim, num_blocks=layers, num_hidden_channels=units))
        flows.append(LULinearPermute(num_channels=dim))
    return flows

class MyVAEwithNF(MyVAE):
    @override
    def __init__(self, K: int, dim: int, dimZ: int=10, *args, **kwargs):
        super().__init__(dim=dim, dimZ=dimZ, *args, **kwargs)
        
        self.flow = NormalizingFlow(q0=Normal(torch.zeros(dimZ), torch.ones(dimZ)), flows=makeFlows(dimZ, K))

    @override
    def sample(self, n: int) -> Tensor:
        """Draw unconditional samples (z_0), pass them through the flow (z_K), then decode."""
        z0 = self.flow.q0.sample((n,))
        zK = self.flow.forward(z0)
        xRecon = self.decoder(zK)
        return xRecon

    @override
    def forward(self, x: Tensor) -> tuple[Tensor, Tensor, Tensor]:
        """Returns the reconstruction and KL-divergence."""
        mu, logvar = self.encode(x)
        std = torch.exp(0.5 * logvar)
        eps = torch.randn_like(std)
        z0 = mu + std * eps
    
        z, log_det = z0, 0.0
        for flow in self.flow.flows:
            z, ld = flow(z)
            log_det += ld
        zK = z
    
        log_qz0 = Normal(mu, std).log_prob(z0).sum(dim=1)
        log_pzK = self.prior.log_prob(zK).sum(dim=1)
    
        kl = (log_qz0 - log_pzK - log_det).mean()
    
        xRecon = self.decoder(zK)
        return xRecon, kl, zK
# Classification: PREDICT




"""
# Training

We will train on grayscale MNIST handwritten digits.
The goal is to train either architecture and then to compare the results.
"""



"""
## Download and Prepare the Data
"""



from torchvision import datasets, transforms
from torch.utils.data import DataLoader

batch_size = 192

transform = transforms.Compose([ transforms.ToTensor() ])

# Download and load MNIST training set
train_dataset = datasets.MNIST(root='./data', train=True, transform=transform, download=True)
train_loader = DataLoader(dataset=train_dataset, batch_size=batch_size, drop_last=True, shuffle=True)

# Load MNIST test set
test_dataset = datasets.MNIST(root='./data', train=False, transform=transform, download=True)
test_loader = DataLoader(dataset=test_dataset, batch_size=batch_size, drop_last=True, shuffle=False)
# Classification: PREDICT




train_dataset.data.shape, test_dataset.data.shape
# Classification: PREDICT




"""
## Using ELBO

Recall that the ELBO is essentially the expectation of the log-likelihood of the data under our currently parameterized model minus the KL-divergence of the variational distribution and the prior belief.

Recall that the (log-)likelihood function does not have to be a proper probability density.
Instead, it should yield values that allow relative comparisons on how well the certain parameters represent our data.
Here, $f_{\theta}$ represents our decoder that reconstructs the inputs, i.e., $f\mapsto X'$.

$$
\begin{align}
    \text{ELBO}(\theta,\phi;x)=\mathbb{E}_{q_{\phi}(z|x)}\left[-\text{reconstruction loss}\left(x,f_{\theta}(z)\right)\right]-D_{\text{KL}}\left(q_{\phi}(z|x)\,\|\,p(z)\right)\nonumber.
\end{align}
$$


In a VAE, we typically have a reconstruction loss like MSE.
We can just plug it into the expectation and use it as our likelihood.
Then, we negate the ELBO to obtain our loss objective $\mathcal{J}$ for minimization:

$$
\begin{align}
    \operatorname{MSE}\left(x,\mu_{\theta}(z)\right)&=\left\|x-\mu_{\theta}(z)\right\|^2,\nonumber
    \\[1em]
    \mathcal{J}(\theta,\phi;x)&=\underbrace{\mathbb{E}_{q_{\phi}(z|x)}\left[\left\|x-\mu_{\theta}(z)\right\|^2\right]}_{\text{expected (mean) reconstr. error}} + D_{\text{KL}}\left(q_{\phi}(z|x)\,\|\,p(z)\right)\nonumber.
\end{align}
$$
"""



"""
## The Vanilla VAE

Let's train this model first.
It is perhaps easiest to use the same training routine for either model (with/without NF).
"""



import numpy as np
from torch import device
from torch.optim import Adam
from torch.nn.functional import binary_cross_entropy
import random

seed = 42
np.random.seed(seed)
torch.manual_seed(seed)
random.seed(seed)

DEVICE = device("cpu")
DIM_Z = 12
LEARNING_RATE = 0.001
EPOCHS = 10
KL_DIV_BETA = 1

# For MNIST digits, this is 768
model = MyVAE(dim=np.prod(train_dataset.data.shape[1:]).item(), dimZ=DIM_Z).to(device=DEVICE)
optim = Adam(params=model.parameters(), lr=LEARNING_RATE)

reconLosses = []
klDivs = []

for epoch in range(EPOCHS):
    model.train()
    epochRecon = 0
    epochKl = 0

    for batch in train_loader:
        x, _ = batch
        x = x.view(x.size(0), -1).to(DEVICE)
        
        xRecon, kl_div, _ = model(x)
        recon_loss = binary_cross_entropy(xRecon, x, reduction='sum') / x.size(0)
        loss = recon_loss + KL_DIV_BETA * kl_div

        optim.zero_grad()
        loss.backward()
        optim.step()

        epochRecon += recon_loss.item()
        epochKl += kl_div.item()

    reconLosses.append(epochRecon / len(train_loader))
    klDivs.append(epochKl / len(train_loader))
    print(f"Epoch: {epoch+1}, Recon Loss: {reconLosses[-1]:.4f}, KL: {klDivs[-1]:.4f}")
# Classification: TRAIN




"""
### Evaluation

Please provide **4** kinds of plots now:

1. Training progress. Show the reconstruction loss and KL-divergence separately.
2. "Animation" of the latent space. For example, draw a sample from your prior belief and gradually manipulate it along a single dimension (keep others constant) to demonstrate what this dimensions has effectively learned.
3. Draw at least 25 random samples using your prior belief from the trained model.
4. Use the trained model to encode all the images from the holdout dataset. Further reduce the dimensionality to 2 using TSNE and plot the results


**Question**: For the second plot: What did any of the latent dimensions learned? What happens when you animate a single dimension between, say, `[-3,3]`?

**Question**: What is your qualitative evaluation of the samples from the 3rd plot?

**Question**: What is your interpretation of the 4th plot? Has the model learned something useful?
"""



import matplotlib.pyplot as plt
from sklearn.manifold import TSNE

plt.figure(figsize=(10,4))
plt.subplot(1,2,1)
plt.plot(reconLosses, label='Reconstruction Loss')
plt.xlabel('Epoch')
plt.ylabel('Loss')
plt.title('Reconstruction Loss')
plt.legend()
plt.subplot(1,2,2)
plt.plot(klDivs, label='KL Divergence', color='orange')
plt.xlabel('Epoch')
plt.ylabel('KL Divergence')
plt.title('KL Divergence')
plt.legend()
plt.tight_layout()
plt.show()

nSteps = 10
z = torch.zeros((nSteps, DIM_Z)).to(DEVICE)
values = torch.linspace(-3, 3, nSteps)
for i, val in enumerate(values):
    z[i, 0] = val
with torch.no_grad():
    samples = model.decoder(z).cpu().numpy()
plt.figure(figsize=(15,2))
for i, img in enumerate(samples):
    plt.subplot(1, nSteps, i+1)
    plt.imshow(img.reshape(28,28), cmap='gray')
    plt.axis('off')
plt.suptitle('Varying the first latent dimension')
plt.show()

with torch.no_grad():
    prior_samples = model.sample(25).cpu().numpy()
plt.figure(figsize=(5,5))
for i, img in enumerate(prior_samples):
    plt.subplot(5,5,i+1)
    plt.imshow(img.reshape(28,28), cmap='gray')
    plt.axis('off')
plt.suptitle('25 Random Samples from Prior')
plt.show()

allZ = []
allLabels = []
model.eval()
with torch.no_grad():
    for x, y in test_loader:
        x = x.to(DEVICE).view(x.size(0), -1)
        mu, _ = model.encode(x)
        allZ.append(mu.cpu().numpy())
        allLabels.append(y.numpy())
allZ = np.concatenate(allZ, axis=0)
allLabels = np.concatenate(allLabels, axis=0)
tsne = TSNE(n_components=2, random_state=42)
z2d = tsne.fit_transform(allZ)
plt.figure(figsize=(8,6))
scatter = plt.scatter(z2d[:,0], z2d[:,1], c=allLabels, cmap='tab10', alpha=0.6, s=10)
plt.colorbar(scatter, ticks=range(10))
plt.title('t-SNE of Encoded Test Images')
plt.xlabel('t-SNE 1')
plt.ylabel('t-SNE 2')
plt.show()
# Classification: PREDICT




"""
## Answers for questions

1. The animation shows that as you vary the first latent dimension, the generated digit morphs smoothly from one style to another. This shows that the first latent dimension has learned to encode a feature. The smooth transitions mean the latent space is well-structured and the model is using this dimension effectively.

2. The samples are clearly digit-like and diverse. Most images are recognizable as MNIST digits, but some are a bit blurry or ambiguous. This suggests the model has learned a good mapping from latent space to image space, and can produce plausible new digits.

3. The TSNE plot shows well-separated clusters, each corresponding to a different digit. This means the encoder is mapping images of the same digit close together in the latent space, and different digits are mapped to distinct regions. This is evidence that the model has learned useful, discriminative features in its latent space.
"""



"""
## The NF-backed VAE

The ELBO stays the exact same.
However, we have to plug in our more flexible variational distribution (which is calculated using the NF's chosen base-distribution and the determinant of the transformation).
"""



"""
Recall that ($z_0$ being the output of the encoder):

$$
\begin{align}
    q_{\phi}(z_K\vert x)&=\psi_{\phi}(z_0)\,\left\lvert\operatorname{det}\frac{\partial\,z_0}{\partial\,z_K}\right\rvert=\psi_{\phi}(z_0)\prod_{k=1}^{K}\,\left\lvert\operatorname{det}\frac{\partial\,z_{k-1}}{\partial\,z_k}\right\rvert.
    \\[1em]
    \log{\left(q_{\phi}(z_K\vert x)\right)}&=\log{\left(\psi_{\phi}(z_0)\right)} + \underbrace{\log{\left(\left\lvert\operatorname{det}\frac{\partial\,z_0}{\partial\,z_K}\right\rvert\right)}}_{\text{the "logabsdet"}}=\log{\left(\psi_{\phi}(z_0)\right)}+\sum_{k=1}^{K}\,\log{\left(\left\lvert\operatorname{det}\frac{\partial\,z_{k-1}}{\partial\,z_k}\right\rvert\right)}.

\end{align}
$$
"""



"""

$$
\begin{align}
    \text{ELBO}(\theta,\phi;x)&=\mathbb{E}_{q_{\phi}(z_K\vert x)}\left[\log{\left(p_{\theta}(z_K\vert x)\right)}\right]-D_{\text{KL}}\left[q_{\phi}(z\vert x)\,\|\,p(z)\right],
    \\[1em]
    &=\mathbb{E}_{q_{\phi}(z_K\vert x)}\left[\log{\left(p_{\theta}(z_K\vert x)\right)}\right]-\mathbb{E}_{q_{\phi}(z_K\vert x)}\left[\log{\left(\frac{q_{\phi}(z_K\vert x)}{p(z_K)}\right)}\right],
    \\[1em]
    &=\mathbb{E}_{q_{\phi}(z_K\vert x)}\left[\log{\left(p_{\theta}(z_K\vert x)\right)}\right]-\mathbb{E}_{q_{\phi}(z_K\vert x)}\left[\underbrace{\log{\left(\psi_{\phi}(z_0)\right)-\sum_{k=1}^{K}\,\log{\left\lvert\operatorname{det}\frac{\partial\,z_k}{\partial\,z_{k-1}}\right\rvert}}}_{q_{\phi}(z_K\vert x)}-\log{\left(p(z_K)\right)}\right],
    \\[3em]
    \text{Notice that}&\text{ numerator and denominator in the determinant (and its sign) have flipped! (see below)}\nonumber
    \\[1em]
    &=\mathbb{E}_{q_{\phi}(z_K\vert x)}\left[\log{\left(p_{\theta}(z_K\vert x)\right)}-\log{\left(\psi_{\phi}(z_0)\right)+\sum_{k=1}^{K}\,\log{\left\lvert\operatorname{det}\frac{\partial\,z_k}{\partial\,z_{k-1}}\right\rvert}}+\log{\left(p(z_K)\right)}\right]
    \\[2em]
    \text{Notice that}&\text{ the Monte Carlo approximation for $l$ samples becomes:}\nonumber
    \\[1em]
    &\approx\frac{1}{L}\sum_{l=1}^{L}\,\left(-\mathcal{R}\left(x,z_K^{(l)};\theta\right)\right)-\log{\left(\psi_{\phi}\left(z_0^{(l)}\right)\right)+\sum_{k=1}^{K}\,\log{\left\lvert\operatorname{det}\frac{\partial\,z_k^{(l)}}{\partial\,z_{k-1}^{(l)}}\right\rvert}}+\log{\left(p\left(z_K^{(l)}\right)\right)}.
    \\[2em]
    \text{Notice that}&\text{ $\mathcal{R}$ is the reconstruction loss.}\nonumber
\end{align}
$$
"""



"""
The fraction of computing the determinant flips according to the logarithm laws (determinants satisfy precisely the reciprocal relationship $\operatorname{det}(\frac{a}{b})=\left(\operatorname{det}\frac{b}{a}\right)^{-1}$).

Therefore, we have $\log{\left\lvert\operatorname{det}(a/b)\right\rvert}=-\log{\left\lvert\operatorname{det}(b/a)\right\rvert}$.
We have to flip it because usually we would transform $z_0$ to $z_K$, giving us the determinant for that transformation.
However, to evaluate the log-likelihood of $z_0$, we require the determinant from the inverse transformation!
Therefore, we have to subtract its reciprocal instead.

The NF-backed VAE in a nutshell:

- $x\mapsto z_0$
    * Use the encoder and reparameterization trick to produce $z_0$.
- $z_0\mapsto z_K$
    * For a discrete normalizing flow with $K$ transformations.
- $z_K\mapsto\approx x$
    * Use the decoder to reconstruct the original $x\approx x'$.
"""



"""
### Training

Here, train your NF-backed VAE with the optimal parameters found by you.

In order to get comparable results, do **not** alter the number of latent dimensions.
"""



LEARNING_RATE = 0.001
EPOCHS = 10
KL_DIV_BETA = 1.5

seed = 42
np.random.seed(seed)
torch.manual_seed(seed)
random.seed(seed)

model = MyVAEwithNF(K=6, dim=np.prod(train_dataset.data.shape[1:]).item(), dimZ=DIM_Z).to(device=DEVICE)
model.beta = KL_DIV_BETA
optim = Adam(params=model.parameters(), lr=LEARNING_RATE)

reconLossesNf = []
klDivsNf = []

for epoch in range(EPOCHS):
    model.train()
    epochRecon = 0
    epochKl = 0

    for batch in train_loader:
        x, _ = batch
        x = x.view(x.size(0), -1).to(DEVICE)
        
        xRecon, kl_div, _ = model(x)  
        recon_loss = binary_cross_entropy(xRecon, x, reduction='sum') / x.size(0)
        loss = loss = recon_loss + KL_DIV_BETA * kl_div

        optim.zero_grad()
        loss.backward()
        optim.step()

        epochRecon += recon_loss.item()
        epochKl += kl_div.item()

    reconLossesNf.append(epochRecon / len(train_loader))
    klDivsNf.append(epochKl / len(train_loader))
    print(f"Epoch: {epoch+1}, Recon Loss: {reconLossesNf[-1]:.4f}, KL: {klDivsNf[-1]:.4f}")
# Classification: PREDICT




"""
### Evaluation
"""



plt.figure(figsize=(10,4))
plt.subplot(1,2,1)
plt.plot(reconLossesNf, label='Reconstruction Loss')
plt.xlabel('Epoch')
plt.ylabel('Loss')
plt.title('Reconstruction Loss')
plt.legend()
plt.subplot(1,2,2)
plt.plot(klDivsNf, label='KL Divergence', color='orange')
plt.xlabel('Epoch')
plt.ylabel('KL Divergence')
plt.title('KL Divergence')
plt.legend()
plt.tight_layout()
plt.show()

z = torch.zeros((nSteps, DIM_Z)).to(DEVICE)
values = torch.linspace(-3, 3, nSteps)
for i, val in enumerate(values):
    z[i, 0] = val
with torch.no_grad():
    samples = model.decoder(z).cpu().numpy()
plt.figure(figsize=(15,2))
for i, img in enumerate(samples):
    plt.subplot(1, nSteps, i+1)
    plt.imshow(img.reshape(28,28), cmap='gray')
    plt.axis('off')
plt.suptitle('Varying the first latent dimension (NF-backed VAE)')
plt.show()

with torch.no_grad():
    prior_samples = model.sample(25).cpu().numpy()
plt.figure(figsize=(5,5))
for i, img in enumerate(prior_samples):
    plt.subplot(5,5,i+1)
    plt.imshow(img.reshape(28,28), cmap='gray')
    plt.axis('off')
plt.suptitle('25 Random Samples from Prior (NF-backed VAE)')
plt.show()

allZ = []
allLabels = []
model.eval()
with torch.no_grad():
    for x, y in test_loader:
        x = x.to(DEVICE).view(x.size(0), -1)
        mu, _ = model.encode(x)
        allZ.append(mu.cpu().numpy())
        allLabels.append(y.numpy())

allZ = np.concatenate(allZ, axis=0)
allLabels = np.concatenate(allLabels, axis=0)

tsne = TSNE(n_components=2, random_state=42)
z2d = tsne.fit_transform(allZ)
plt.figure(figsize=(8,6))
scatter = plt.scatter(z2d[:,0], z2d[:,1], c=allLabels, cmap='tab10', alpha=0.6, s=10)
plt.colorbar(scatter, ticks=range(10))
plt.title('t-SNE of Encoded Test Images (NF-backed VAE)')
plt.xlabel('t-SNE 1')
plt.ylabel('t-SNE 2')
plt.show()
# Classification: TRAIN




"""
## Answers for questions

1. The animation shows that as you vary the first latent dimension, the generated digit morphs smoothly from one style to another, in the case of this random seed, a 6 to a 9. This shows that the first latent dimension has learned to encode a feature. The smooth transitions mean the latent space is well-structured and the model is using this dimension effectively.

2. Most of the samples are recognizable however not as clearly as with the first model. The loss still has a negative derivative so the result could probably be improved with more epochs. 

3. The TSNE plot shows decently separated clusters, each corresponding to a different digit. This means the encoder is mapping images of the same digit close together in the latent space, and different digits are mapped to distinct regions. This is evidence that the model has learned useful, discriminative features in its latent space. The clusters however are not quite as seperated as in the first model which could explain the slightly more blurry images from the samples. 

**Another Question**: The vanilla VAE seems to perform better than the NF-backed VAE. The vanilla VAE produces clearer and more recognizable digit samples, while the NF-backed VAE samples are somewhat blurrier and less distinct. The t-SNE visualization of the latent space shows that the vanilla VAE achieves better-separated clusters for different digits, showing it has a better seperation in the latent space. 90 86. The vanilla VAE also has a lower final loss of 86 compared to 90 for the NF backed model which is a quantitative way of showing that it is better.
"""


