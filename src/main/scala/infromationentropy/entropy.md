# GPT generated Equations in Information Theory
## TODO See Data Processing Inequality 
---

## **Entropy (Shannon Entropy)**

Measures the **average uncertainty** of a random variable.

$$
H(X) = - \sum_{i=1}^{n} p(x_i) \log p(x_i)
$$

Where:
- $ H(X) $ is the entropy of the random variable $ X $
- $ p(x_i) $ is the probability of $ x_i $
- $ \log $ is typically base-2, representing bits

---

## **Joint Entropy**

Measures the **uncertainty of two random variables** together.

$$
H(X, Y) = - \sum_{x \in X} \sum_{y \in Y} p(x, y) \log p(x, y)
$$

---

## **Conditional Entropy**

Represents the **entropy of $ X $** given $ Y $.

$$
H(X | Y) = - \sum_{x, y} p(x, y) \log p(x | y)
$$

---

## **Mutual Information**

Measures the **amount of information shared** between two variables.

$$
I(X; Y) = H(X) + H(Y) - H(X, Y)
$$

Alternatively:
$$
I(X; Y) = \sum_{x, y} p(x, y) \log \frac{p(x, y)}{p(x)p(y)}
$$

---

## **Kullback-Leibler (KL) Divergence**

Measures the **difference between two probability distributions**.

$$
D_{\text{KL}}(P \parallel Q) = \sum_{x \in X} p(x) \log \frac{p(x)}{q(x)}
$$

---

## **Jensen-Shannon Divergence**

A symmetric version of the KL divergence.

$$
D_{\text{JS}}(P \parallel Q) = \frac{1}{2} D_{\text{KL}}(P \parallel M) + \frac{1}{2} D_{\text{KL}}(Q \parallel M)
$$

Where:
$$
M = \frac{P + Q}{2}
$$

---

## **Shannon's Channel Capacity**

The **maximum achievable data transmission rate** over a noisy channel.

$$
C = B \log_2(1 + \text{SNR})
$$

Where:
- $ C $ is the channel capacity
- $ B $ is the bandwidth
- $ \text{SNR} $ is the signal-to-noise ratio

---

## **Fano's Inequality**

A lower bound on the **error probability** in decoding.

$$
H(X | Y) \leq H_b(P_e) + P_e \log(|\mathcal{X}| - 1)
$$

Where:
- $ P_e $ is the probability of error
- $ H_b(P_e) $ is the binary entropy function
- $ |\mathcal{X}| $ is the size of the input alphabet

---

## **Binary Entropy Function**

Measures the **entropy of a binary variable**.

$$
H_b(p) = -p \log(p) - (1-p) \log(1-p)
$$

---

## **Data Processing Inequality**

Ensures that **processing data** cannot increase the amount of information.

$$
I(X; Y) \geq I(X; Z)
$$

Where:
$$
X \rightarrow Y \rightarrow Z
$$

---

## **Rate-Distortion Function**

Defines the **minimum rate required** for a given distortion level.

$$
R(D) = \min_{p(\hat{x} | x) : \mathbb{E}[d(X, \hat{X})] \leq D} I(X; \hat{X})
$$

Where:
- $ D $ is the distortion
- $ d(X, \hat{X}) $ is the distortion measure

---

## **Source Coding Theorem**

Defines the **minimum average length** of encoded symbols.

$$
L \geq H(X)
$$

Where:
- $ L $ is the average code length
- $ H(X) $ is the entropy of the source

---

## **Noisy Channel Coding Theorem**

Defines the **maximum achievable rate** for reliable communication over a noisy channel.

$$
R < C
$$

Where:
- $ R $ is the transmission rate
- $ C $ is the channel capacity

---

## **Asymptotic Equipartition Property (AEP)**

States that **typical sequences** have a probability close to $ 2^{-nH(X)} $.

$$
\frac{1}{n} \log P(X_1, X_2, \dots, X_n) \approx -H(X)
$$

---

## **Relative Entropy (Cross Entropy)**

Measures the **distance between two distributions**.

$$
H(P, Q) = -\sum_x p(x) \log q(x)
$$

---

## **Channel Coding Rate**

Represents the **efficiency of encoding**.

$$
R = \frac{k}{n}
$$

Where:
- $ k $ is the number of message bits
- $ n $ is the total number of transmitted bits

---

## **Hamming Distance**

Measures the **difference between two binary strings**.

$$
d(x, y) = \sum_{i=1}^{n} (x_i \oplus y_i)
$$

Where:
- $ \oplus $ is the XOR operator

---

## **Shannon-Fano-Elias Coding**

Defines the **codeword length** for optimal coding.

$$
l(x) = \lceil -\log_2(p(x)) \rceil
$$

---

## **Rate of Convergence in Source Coding**

Defines the **rate at which entropy converges**.

$$
\frac{1}{n} H(X_1, X_2, \dots, X_n) \rightarrow H(X) \quad \text{as} \quad n \rightarrow \infty
$$

---

## **Kolmogorov Complexity**

Measures the **complexity of a string**.

$$
K(x) = \min \{ |p| : U(p) = x \}
$$

Where:
- $ K(x) $ is the Kolmogorov complexity of $ x $
- $ U(p) $ is a universal Turing machine executing program $ p $

---