# 50 Useful Equations for Econometrics

1. **Linear Regression Model**
   $$
   y = \beta_0 + \beta_1 x + \epsilon
   $$
   Where $$ y $$ is the dependent variable, $$ x $$ is the independent variable, $$ \beta_0 $$ and $$ \beta_1 $$ are the regression coefficients, and $$ \epsilon $$ is the error term.

2. **Multiple Linear Regression Model**
   $$
   y = \beta_0 + \beta_1 x_1 + \beta_2 x_2 + \dots + \beta_k x_k + \epsilon
   $$
   Where $$ y $$ is the dependent variable, $$ x_1, x_2, \dots, x_k $$ are the independent variables.

3. **Ordinary Least Squares (OLS) Estimator**
   $$
   \hat{\beta} = (X'X)^{-1} X'y
   $$
   Where $$ X $$ is the matrix of independent variables and $$ y $$ is the vector of dependent variables.

4. **Residuals in OLS Regression**
   $$
   \hat{\epsilon} = y - X \hat{\beta}
   $$
   Where $$ \hat{\epsilon} $$ are the residuals, $$ y $$ is the observed values, and $$ X \hat{\beta} $$ are the predicted values.

5. **Variance of the Error Term**
   $$
   \hat{\sigma}^2 = \frac{1}{n-k} \sum_{i=1}^n \hat{\epsilon}_i^2
   $$
   Where $$ \hat{\sigma}^2 $$ is the estimated variance, $$ n $$ is the number of observations, and $$ k $$ is the number of predictors.

6. **R-Squared (Coefficient of Determination)**
   $$
   R^2 = 1 - \frac{\sum_{i=1}^n \hat{\epsilon}_i^2}{\sum_{i=1}^n (y_i - \bar{y})^2}
   $$
   Where $$ R^2 $$ represents the proportion of variance explained by the model.

7. **Adjusted R-Squared**
   $$
   R^2_{\text{adj}} = 1 - \left( 1 - R^2 \right) \frac{n-1}{n-k-1}
   $$
   Where $$ R^2_{\text{adj}} $$ adjusts $$ R^2 $$ for the number of predictors in the model.

8. **Variance-Covariance Matrix of OLS Estimators**
   $$
   \text{Var}(\hat{\beta}) = \hat{\sigma}^2 (X'X)^{-1}
   $$
   Where $$ \hat{\sigma}^2 $$ is the estimated variance of the errors.

9. **Test Statistic for Hypothesis Testing (t-Test)**
   $$
   t = \frac{\hat{\beta}_j}{\text{SE}(\hat{\beta}_j)}
   $$
   Where $$ \hat{\beta}_j $$ is the coefficient estimate and $$ \text{SE}(\hat{\beta}_j) $$ is its standard error.

10. **F-Statistic for Joint Hypothesis Testing**
    $$
    F = \frac{(RSS_{\text{restricted}} - RSS_{\text{unrestricted}})/q}{RSS_{\text{unrestricted}}/(n-k)}
    $$
    Where $$ RSS_{\text{restricted}} $$ is the residual sum of squares for the restricted model, $$ RSS_{\text{unrestricted}} $$ is for the unrestricted model, and $$ q $$ is the number of restrictions.

11. **Breusch-Pagan Test for Heteroskedasticity**
    $$
    \text{BP} = \frac{n}{2} R^2
    $$
    Where $$ R^2 $$ is from the auxiliary regression of squared residuals on the independent variables.

12. **Durbin-Watson Statistic (for Autocorrelation)**
    $$
    DW = \frac{\sum_{i=2}^n (\hat{\epsilon}_i - \hat{\epsilon}_{i-1})^2}{\sum_{i=1}^n \hat{\epsilon}_i^2}
    $$
    Where $$ \hat{\epsilon}_i $$ are the residuals of the regression.

13. **Instrumental Variables (IV) Estimator**
    $$
    \hat{\beta}_{IV} = (Z'X)^{-1} Z'y
    $$
    Where $$ Z $$ is the instrument matrix, $$ X $$ is the independent variable matrix, and $$ y $$ is the dependent variable.

14. **Two-Stage Least Squares (2SLS) Estimation**
    - Stage 1: $$ \hat{X} = Z(Z'Z)^{-1}Z'X $$
    - Stage 2: $$ \hat{\beta} = (\hat{X}'\hat{X})^{-1} \hat{X}'y $$

15. **Heteroskedasticity-Consistent Standard Errors (White's Standard Errors)**
    $$
    \text{SE}(\hat{\beta}_j) = \sqrt{\hat{\sigma}^2 \left( (X'X)^{-1} \right)_{jj}}
    $$
    Where the diagonal elements of $$ (X'X)^{-1} $$ are adjusted for heteroskedasticity.

16. **Autoregressive Model (AR)**
    $$
    y_t = \phi y_{t-1} + \epsilon_t
    $$
    Where $$ y_t $$ is the dependent variable at time $$ t $$, $$ \phi $$ is the autoregressive coefficient, and $$ \epsilon_t $$ is the error term.

17. **Moving Average Model (MA)**
    $$
    y_t = \mu + \epsilon_t + \theta \epsilon_{t-1}
    $$
    Where $$ \mu $$ is the mean, $$ \theta $$ is the moving average coefficient, and $$ \epsilon_t $$ is the white noise error term.

18. **Autoregressive Integrated Moving Average Model (ARIMA)**
    $$
    (1 - \phi_1 L - \dots - \phi_p L^p)(1 - L)^d y_t = \epsilon_t + \theta_1 \epsilon_{t-1} + \dots + \theta_q \epsilon_{t-q}
    $$
    Where $$ L $$ is the lag operator, and $$ p, d, q $$ are the AR, differencing, and MA orders, respectively.

19. **Panel Data Model**
    $$
    y_{it} = \alpha_i + \beta x_{it} + \epsilon_{it}
    $$
    Where $$ y_{it} $$ is the dependent variable, $$ x_{it} $$ is the independent variable, $$ \alpha_i $$ is the individual effect, and $$ \epsilon_{it} $$ is the error term.

20. **Fixed Effects Model**
    $$
    y_{it} = \alpha_i + \beta x_{it} + \epsilon_{it}
    $$
    Where $$ \alpha_i $$ is a fixed individual effect, used in the analysis of panel data.

21. **Random Effects Model**
    $$
    y_{it} = \alpha + \beta x_{it} + u_i + \epsilon_{it}
    $$
    Where $$ u_i $$ is a random effect.

22. **Variance Inflation Factor (VIF)**
    $$
    \text{VIF}_j = \frac{1}{1 - R_j^2}
    $$
    Where $$ R_j^2 $$ is the R-squared from the regression of $$ x_j $$ on the other predictors.

23. **GARCH (Generalized Autoregressive Conditional Heteroskedasticity) Model**
    $$
    y_t = \mu + \epsilon_t, \quad \epsilon_t = \sigma_t z_t
    $$
    Where $$ \sigma_t^2 = \alpha_0 + \alpha_1 \epsilon_{t-1}^2 + \beta_1 \sigma_{t-1}^2 $$.

24. **Cox Proportional Hazards Model**
    $$
    h(t) = h_0(t) \exp(\beta_1 x_1 + \beta_2 x_2 + \dots + \beta_k x_k)
    $$
    Where $$ h(t) $$ is the hazard function at time $$ t $$, and $$ x_1, x_2, \dots, x_k $$ are the predictors.

25. **Logit Model (Binary Response Model)**
    $$
    P(y = 1) = \frac{1}{1 + \exp(-(\beta_0 + \beta_1 x_1 + \dots + \beta_k x_k))}
    $$
    Where $$ P(y = 1) $$ is the probability of success.

26. **Probit Model (Binary Response Model)**
    $$
    P(y = 1) = \Phi(\beta_0 + \beta_1 x_1 + \dots + \beta_k x_k)
    $$
    Where $$ \Phi $$ is the cumulative distribution function of the standard normal distribution.

27. **Log-Linear Model**
    $$
    \ln y = \beta_0 + \beta_1 x_1 + \dots + \beta_k x_k + \epsilon
    $$
    Where $$ \ln y $$ is the natural logarithm of the dependent variable.

28. **Hansen's J-Test (for Instrumental Variables)**
    $$
    J = n \hat{\epsilon}^2 (Z'X)^{-1} Z'Z (X'X)^{-1} \hat{\epsilon}
    $$
    Where $$ Z $$ is the matrix of instruments, and $$ \hat{\epsilon} $$ is the residual.

29. **Simultaneous Equations Model**
    $$
    y_1 = \alpha_1 + \beta_1 y_2 + \epsilon_1
    $$
    $$
    y_2 = \alpha_2 + \beta_2 y_1 + \epsilon_2
    $$

30. **Bayesian Econometrics**
    $$
    P(\beta | y) = \frac{P(y|\beta) P(\beta)}{P(y)}
    $$
    Where $$ P(\beta | y) $$ is the posterior distribution of the parameters.

31. **Causal Inference (Difference-in-Differences)**
    $$
    \Delta Y = (\text{Post} - \text{Pre}) \times (\text{Treatment} - \text{Control})
    $$

32. **Endogeneity**
    $$
    \text{Cov}(x, \epsilon) \neq 0
    $$
    Where $$ \epsilon $$ is the error term, and endogeneity arises when this condition is violated.

33. **Instrumental Variables Regressions (2SLS)**
    $$
    \hat{y} = X \hat{\beta}_{IV} + \epsilon
    $$

34. **Cointegration (Engle-Granger)**
    $$
    y_t = \alpha + \beta x_t + u_t
    $$
    Where $$ u_t $$ is stationary.

35. **Johansen Cointegration Test**
    $$
    \Delta y_t = \alpha + \beta x_t + \gamma \Delta x_t + \epsilon_t
    $$

36. **Granger Causality Test**
    $$
    y_t = \alpha + \sum_{i=1}^p \beta_i y_{t-i} + \sum_{i=1}^p \gamma_i x_{t-i} + \epsilon_t
    $$

37. **Time Series Decomposition**
    $$
    y_t = T_t + S_t + C_t + I_t
    $$
    Where $$ T_t $$ is the trend, $$ S_t $$ is the seasonal component, $$ C_t $$ is the cyclical component, and $$ I_t $$ is the irregular component.

38. **Lag Operator**
    $$
    L^k y_t = y_{t-k}
    $$

39. **Unit Root Test (Augmented Dickey-Fuller Test)**
    $$
    \Delta y_t = \alpha + \beta t + \gamma y_{t-1} + \sum_{i=1}^p \delta_i \Delta y_{t-i} + \epsilon_t
    $$

40. **The Phillips Curve**
    $$
    \pi_t = \pi_t^e - \beta (u_t - u_n)
    $$
    Where $$ \pi_t $$ is inflation, $$ \pi_t^e $$ is expected inflation, $$ u_t $$ is the unemployment rate, and $$ u_n $$ is the natural rate of unemployment.

41. **Exponential Smoothing (Holt-Winters)**
    $$
    S_t = \alpha y_t + (1 - \alpha) S_{t-1}
    $$

42. **Multinomial Logit Model**
    $$
    P(y = j) = \frac{\exp(\beta_j x)}{\sum_{k=1}^K \exp(\beta_k x)}
    $$

43. **Cox Regression (Hazard Ratio)**
    $$
    h(t|X) = h_0(t) \exp(\beta_1 x_1 + \beta_2 x_2 + \dots + \beta_k x_k)
    $$

44. **Likelihood Function for OLS**
    $$
    L(\beta, \sigma^2) = \prod_{i=1}^n \frac{1}{\sqrt{2 \pi \sigma^2}} \exp\left(-\frac{(y_i - X_i \beta)^2}{2 \sigma^2}\right)
    $$

45. **Maximum Likelihood Estimation (MLE)**
    $$
    \hat{\theta} = \arg \max_\theta L(\theta)
    $$

46. **Z-Score Transformation**
    $$
    Z = \frac{x - \mu}{\sigma}
    $$

47. **Probabilistic Forecasting**
    $$
    P(y_t = 1 | X) = \frac{1}{1 + \exp(-X\beta)}
    $$

48. **Bootstrap Resampling**
    - Sample with replacement, repeat N times to estimate distribution.

49. **Rho Coefficient (Autocorrelation)**
    $$
    \rho = \frac{\text{Cov}(y_t, y_{t-1})}{\text{Var}(y_t)}
    $$

50. **Wald Test for Model Parameters**
    $$
    W = (\hat{\beta} - \beta_0)' \text{Var}(\hat{\beta})^{-1} (\hat{\beta} - \beta_0)
    $$
