# 50 Important Equations in Statistics

---

### 1. **Mean (Arithmetic Average)**

The mean of a set of values $ x_1, x_2, \dots, x_n $ is given by:

$$
\mu = \frac{1}{n} \sum_{i=1}^{n} x_i
$$

---

### 2. **Variance**

The variance of a set of values is the average of the squared differences from the mean:

$$
\sigma^2 = \frac{1}{n} \sum_{i=1}^{n} (x_i - \mu)^2
$$

---

### 3. **Standard Deviation**

The standard deviation is the square root of the variance:

$$
\sigma = \sqrt{\sigma^2}
$$

---

### 4. **Covariance**

Covariance is a measure of the relationship between two random variables:

$$
\text{Cov}(X, Y) = \frac{1}{n} \sum_{i=1}^{n} (x_i - \mu_X)(y_i - \mu_Y)
$$

---

### 5. **Correlation Coefficient**

The Pearson correlation coefficient measures the linear relationship between two variables:

$$
r = \frac{\text{Cov}(X, Y)}{\sigma_X \sigma_Y}
$$

---

### 6. **Linear Regression Equation**

The equation for linear regression is:

$$
Y = \beta_0 + \beta_1 X + \epsilon
$$

where $ \beta_0 $ is the intercept, $ \beta_1 $ is the slope, and $ \epsilon $ is the error term.

---

### 7. **Probability Mass Function (PMF)**

The probability mass function for a discrete random variable $ X $ is:

$$
P(X = x) = p(x)
$$

---

### 8. **Probability Density Function (PDF)**

The probability density function for a continuous random variable $ X $ is:

$$
f_X(x) = \frac{d}{dx} P(X \leq x)
$$

---

### 9. **Cumulative Distribution Function (CDF)**

The cumulative distribution function for a random variable $ X $ is:

$$
F_X(x) = P(X \leq x)
$$

---

### 10. **Bayes' Theorem**

Bayes' Theorem describes the probability of an event, based on prior knowledge:

$$
P(A|B) = \frac{P(B|A) P(A)}{P(B)}
$$

---

### 11. **Central Limit Theorem**

The central limit theorem states that the sampling distribution of the sample mean approaches a normal distribution as the sample size increases:

$$
\bar{X} \sim N\left(\mu, \frac{\sigma^2}{n}\right)
$$

---

### 12. **Law of Total Probability**

The law of total probability relates marginal and conditional probabilities:

$$
P(B) = \sum_{i} P(B|A_i) P(A_i)
$$

---

### 13. **Chi-Square Test Statistic**

The chi-square statistic is used in hypothesis testing:

$$
\chi^2 = \sum \frac{(O_i - E_i)^2}{E_i}
$$

where $ O_i $ are the observed frequencies, and $ E_i $ are the expected frequencies.

---

### 14. **Student's t-Test Statistic**

The t-test statistic is used to compare sample means:

$$
t = \frac{\bar{X} - \mu_0}{\frac{s}{\sqrt{n}}}
$$

where $ \bar{X} $ is the sample mean, $ \mu_0 $ is the hypothesized population mean, $ s $ is the sample standard deviation, and $ n $ is the sample size.

---

### 15. **F-Test Statistic**

The F-test statistic compares two sample variances:

$$
F = \frac{s_1^2}{s_2^2}
$$

where $ s_1^2 $ and $ s_2^2 $ are the sample variances.

---

### 16. **Z-Score**

The Z-score is a measure of how many standard deviations a value is from the mean:

$$
Z = \frac{X - \mu}{\sigma}
$$

---

### 17. **Exponential Distribution**

The probability density function for the exponential distribution is:

$$
f(x|\lambda) = \lambda e^{-\lambda x}, \quad x \geq 0
$$

where $ \lambda $ is the rate parameter.

---

### 18. **Normal Distribution**

The probability density function for the normal distribution is:

$$
f(x|\mu, \sigma^2) = \frac{1}{\sqrt{2\pi \sigma^2}} e^{-\frac{(x - \mu)^2}{2\sigma^2}}
$$

where $ \mu $ is the mean and $ \sigma^2 $ is the variance.

---

### 19. **Poisson Distribution**

The probability mass function for the Poisson distribution is:

$$
P(X = k) = \frac{\lambda^k e^{-\lambda}}{k!}, \quad k = 0, 1, 2, \dots
$$

where $ \lambda $ is the expected number of occurrences.

---

### 20. **Binomial Distribution**

The probability mass function for the binomial distribution is:

$$
P(X = k) = \binom{n}{k} p^k (1 - p)^{n - k}
$$

where $ n $ is the number of trials, and $ p $ is the probability of success.

---

### 21. **Geometric Distribution**

The probability mass function for the geometric distribution is:

$$
P(X = k) = (1 - p)^{k-1} p
$$

where $ p $ is the probability of success.

---

### 22. **Negative Binomial Distribution**

The probability mass function for the negative binomial distribution is:

$$
P(X = k) = \binom{k-1}{r-1} p^r (1 - p)^{k-r}
$$

where $ r $ is the number of successes, and $ p $ is the probability of success.

---

### 23. **Hypergeometric Distribution**

The probability mass function for the hypergeometric distribution is:

$$
P(X = k) = \frac{\binom{K}{k} \binom{N-K}{n-k}}{\binom{N}{n}}
$$

where $ K $ is the number of successes, $ N $ is the population size, and $ n $ is the sample size.

---

### 24. **Bernoulli Distribution**

The probability mass function for the Bernoulli distribution is:

$$
P(X = x) = p^x (1 - p)^{1 - x}
$$

where $ p $ is the probability of success, and $ x $ is either 0 (failure) or 1 (success).

---

### 25. **Moment-Generating Function**

The moment-generating function $ M_X(t) $ is:

$$
M_X(t) = \mathbb{E}[e^{tX}]
$$

---

### 26. **Cauchy Distribution**

The probability density function for the Cauchy distribution is:

$$
f(x) = \frac{1}{\pi \gamma \left( 1 + \left( \frac{x - x_0}{\gamma} \right)^2 \right)}
$$

where $ x_0 $ is the location parameter, and $ \gamma $ is the scale parameter.

---

### 27. **Confidence Interval**

The confidence interval for the mean is given by:

$$
\left( \bar{x} - z_{\alpha/2} \frac{\sigma}{\sqrt{n}}, \bar{x} + z_{\alpha/2} \frac{\sigma}{\sqrt{n}} \right)
$$

where $ \bar{x} $ is the sample mean, $ \sigma $ is the sample standard deviation, and $ n $ is the sample size.

---

### 28. **Markov Chain**

The transition matrix $ P $ for a Markov chain is given by:

$$
P = \left[ p_{ij} \right]
$$

where $ p_{ij} $ represents the probability of transitioning from state $ i $ to state $ j $.

---

### 29. **Kolmogorov-Smirnov Test Statistic**

The Kolmogorov-Smirnov test statistic for a sample is:

$$
D_n = \sup_x |F_n(x) - F(x)|
$$

where $ F_n(x) $ is the empirical distribution function, and $ F(x) $ is the cumulative distribution function.

---

### 30. **Likelihood Function**

The likelihood function $ L(\theta) $ for a set of observations $ x_1, x_2, \dots, x_n $ is:

$$
L(\theta) = P(x_1, x_2, \dots, x_n | \theta)
$$

---

### 31. **Maximum Likelihood Estimation (MLE)**

The MLE estimate $ \hat{\theta} $ is obtained by maximizing the likelihood function:

$$
\hat{\theta} = \arg \max_{\theta} L(\theta)
$$

---

### 32. **Entropy**

The entropy $ H(X) $ of a discrete random variable $ X $ is:

$$
H(X) = - \sum_{i=1}^{n} P(x_i) \log P(x_i)
$$

---

### 33. **Kullback-Leibler Divergence**

The Kullback-Leibler divergence $ D_{\text{KL}}(P || Q) $ between two probability distributions $ P $ and $ Q $ is:

$$
D_{\text{KL}}(P || Q) = \sum_{i} P(x_i) \log \frac{P(x_i)}{Q(x_i)}
$$

---

### 34. **Bayesian Inference**

The posterior distribution $ P(\theta|x) $ is given by:

$$
P(\theta|x) = \frac{P(x|\theta) P(\theta)}{P(x)}
$$

where $ P(x|\theta) $ is the likelihood, $ P(\theta) $ is the prior, and $ P(x) $ is the marginal likelihood.

---

### 35. **Empirical Distribution Function**

The empirical distribution function $ F_n(x) $ is:

$$
F_n(x) = \frac{1}{n} \sum_{i=1}^{n} I(x_i \leq x)
$$

where $ I(x_i \leq x) $ is the indicator function.

---

### 36. **Mann-Whitney U Test**

The test statistic for the Mann-Whitney U test is:

$$
U = \sum_{i=1}^{n_1} R_i - \frac{n_1 (n_1 + 1)}{2}
$$

where $ R_i $ is the rank of the $ i $-th observation.

---

### 37. **Bootstrap Resampling**

Bootstrap resampling generates a sample of size $ n $ by drawing with replacement from the observed data.

---

### 38. **Spearman’s Rank Correlation**

Spearman’s rank correlation coefficient $ \rho $ is given by:

$$
\rho = 1 - \frac{6 \sum d_i^2}{n(n^2 - 1)}
$$

where $ d_i $ is the difference in ranks of paired values.

---

### 39. **Wald Test**

The Wald test statistic is:

$$
W = \frac{\hat{\theta} - \theta_0}{\text{SE}(\hat{\theta})}
$$

where $ \hat{\theta} $ is the estimator and $ \text{SE}(\hat{\theta}) $ is its standard error.

---

### 40. **Pearson’s Chi-Square Test Statistic**

The Pearson chi-square test statistic is:

$$
\chi^2 = \sum_{i=1}^{k} \frac{(O_i - E_i)^2}{E_i}
$$

where $ O_i $ and $ E_i $ are the observed and expected frequencies, respectively.

---

### 41. **Cox Proportional Hazards Model**

The hazard function in the Cox model is:

$$
h(t | X) = h_0(t) e^{\beta^T X}
$$

where $ h(t | X) $ is the hazard at time $ t $, $ X $ is a vector of covariates, and $ \beta $ is the coefficient vector.

---

### 42. **Multinomial Distribution**

The probability mass function for the multinomial distribution is:

$$
P(X_1 = x_1, X_2 = x_2, \dots, X_k = x_k) = \frac{n!}{x_1! x_2! \dots x_k!} p_1^{x_1} p_2^{x_2} \dots p_k^{x_k}
$$

where $ n $ is the total number of trials, and $ p_i $ is the probability of each outcome.

---

### 43. **Markov Chain Transition Matrix**

The transition matrix $ P $ for a Markov chain with states $ S = \{1, 2, \dots, n\} $ is:

$$
P = \left[ p_{ij} \right]
$$

where $ p_{ij} $ represents the transition probability from state $ i $ to state $ j $.

---

### 44. **Logistic Regression Model**

The logistic regression model is:

$$
P(Y = 1 | X) = \frac{1}{1 + e^{-(\beta_0 + \beta_1 X)}}
$$

where $ \beta_0 $ and $ \beta_1 $ are the model parameters.

---

### 45. **Poisson Regression**

The model for Poisson regression is:

$$
\log(\lambda) = \beta_0 + \beta_1 X
$$

where $ \lambda $ is the rate parameter and $ X $ is the independent variable.

---

### 46. **Log-likelihood Function**

The log-likelihood function $ \ell(\theta) $ is:

$$
\ell(\theta) = \sum_{i=1}^{n} \log f(x_i; \theta)
$$

---

### 47. **Bivariate Normal Distribution**

The probability density function for the bivariate normal distribution is:

$$
f(x, y) = \frac{1}{2 \pi \sigma_x \sigma_y \sqrt{1 - \rho^2}} \exp\left( - \frac{1}{2(1 - \rho^2)} \left( \frac{(x - \mu_x)^2}{\sigma_x^2} + \frac{(y - \mu_y)^2}{\sigma_y^2} - \frac{2\rho (x - \mu_x)(y - \mu_y)}{\sigma_x \sigma_y} \right) \right)
$$

---

### 48. **Shannon Entropy**

The Shannon entropy of a discrete random variable $ X $ is:

$$
H(X) = - \sum_{i=1}^{n} p(x_i) \log p(x_i)
$$

---

### 49. **Expected Value**

The expected value $ \mathbb{E}[X] $ of a discrete random variable $ X $ is:

$$
\mathbb{E}[X] = \sum_{i=1}^{n} x_i P(x_i)
$$

---

### 50. **Variance of a Sum of Random Variables**

The variance of the sum of random variables is:

$$
\text{Var}(X + Y) = \text{Var}(X) + \text{Var}(Y) + 2 \text{Cov}(X, Y)
$$
