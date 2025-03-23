---

### 1. **Limit Definition of the Derivative**

The **derivative** of a function $ f(x) $ at a point $ x = a $ is defined as:

$$
f'(a) = \lim_{h \to 0} \frac{f(a+h) - f(a)}{h}
$$

---

### 2. **Power Rule**

The **power rule** states that for any real number $ n $, the derivative of $ f(x) = x^n $ is:

$$
f'(x) = n x^{n-1}
$$

---

### 3. **Product Rule**

The **product rule** for the derivative of the product of two functions $ f(x) $ and $ g(x) $ is:

$$
(fg)' = f'g + fg'
$$

---

### 4. **Quotient Rule**

The **quotient rule** for the derivative of the quotient of two functions $ f(x) $ and $ g(x) $ is:

$$
\left( \frac{f}{g} \right)' = \frac{f'g - fg'}{g^2}
$$

---

### 5. **Chain Rule**

The **chain rule** gives the derivative of a composite function $ f(g(x)) $ as:

$$
\frac{d}{dx} f(g(x)) = f'(g(x)) \cdot g'(x)
$$

---

### 6. **Mean Value Theorem**

The **Mean Value Theorem** states that for a continuous and differentiable function $ f(x) $ on the interval $ [a, b] $, there exists at least one point $ c \in (a, b) $ such that:

$$
f'(c) = \frac{f(b) - f(a)}{b - a}
$$

---

### 7. **Fundamental Theorem of Calculus (Part 1)**

The **Fundamental Theorem of Calculus**, part 1, states that if $ f(x) $ is continuous on $ [a, b] $, then the function $ F(x) = \int_a^x f(t) \, dt $ is differentiable, and:

$$
F'(x) = f(x)
$$

---

### 8. **Fundamental Theorem of Calculus (Part 2)**

The **Fundamental Theorem of Calculus**, part 2, states that if $ f(x) $ is continuous on $ [a, b] $, then:

$$
\int_a^b f(x) \, dx = F(b) - F(a)
$$

where $ F(x) $ is any antiderivative of $ f(x) $.

---

### 9. **Integration by Parts**

**Integration by parts** is given by:

$$
\int u \, dv = uv - \int v \, du
$$

where $ u $ and $ v $ are functions of $ x $.

---

### 10. **Integration by Substitution**

**Integration by substitution** is used to simplify integrals by making a substitution:

$$
\int f(g(x)) g'(x) \, dx = \int f(u) \, du
$$

where $ u = g(x) $.

---

### 11. **L'Hopital's Rule**

**L'Hopital's Rule** is used to evaluate limits of indeterminate forms like $ \frac{0}{0} $ or $ \frac{\infty}{\infty} $:

$$
\lim_{x \to c} \frac{f(x)}{g(x)} = \lim_{x \to c} \frac{f'(x)}{g'(x)}
$$

if the limit on the right-hand side exists.

---

### 12. **Taylor Series Expansion**

The **Taylor series** of a function $ f(x) $ around a point $ a $ is given by:

$$
f(x) = f(a) + f'(a)(x-a) + \frac{f''(a)}{2!}(x-a)^2 + \cdots
$$

---

### 13. **Maclaurin Series**

The **Maclaurin series** is a special case of the Taylor series where the expansion is around $ a = 0 $:

$$
f(x) = f(0) + f'(0)x + \frac{f''(0)}{2!}x^2 + \cdots
$$

---

### 14. **Critical Points and Local Extrema**

A **critical point** of a function $ f(x) $ occurs when $ f'(x) = 0 $ or $ f'(x) $ is undefined. A function has a local extremum at a critical point if the sign of $ f'(x) $ changes.

---

### 15. **Concavity and the Second Derivative Test**

If the second derivative $ f''(x) > 0 $, the function is concave up, and if $ f''(x) < 0 $, the function is concave down. The **Second Derivative Test** helps classify critical points:

- If $ f''(x) > 0 $, the critical point is a local minimum.
- If $ f''(x) < 0 $, the critical point is a local maximum.
- If $ f''(x) = 0 $, the test is inconclusive.

---

### 16. **Divergence Theorem**

The **Divergence Theorem** relates the flux of a vector field through a closed surface to the volume integral of the divergence of the field:

$$
\int_V (\nabla \cdot \mathbf{F}) \, dV = \oint_S \mathbf{F} \cdot d\mathbf{A}
$$

where $ S $ is the boundary surface of a volume $ V $, and $ \mathbf{F} $ is a vector field.

---

### 17. **Green's Theorem**

**Green's Theorem** relates a line integral around a simple closed curve $ C $ to a double integral over the region $ D $ it encloses:

$$
\oint_C (P \, dx + Q \, dy) = \iint_D \left( \frac{\partial Q}{\partial x} - \frac{\partial P}{\partial y} \right) dA
$$

---

### 18. **Stokes' Theorem**

**Stokes' Theorem** generalizes Green's theorem to higher dimensions and relates the surface integral of the curl of a vector field over a surface $ S $ to the line integral over the boundary curve $ C $:

$$
\oint_C \mathbf{F} \cdot d\mathbf{r} = \iint_S (\nabla \times \mathbf{F}) \cdot d\mathbf{S}
$$

---

### 19. **Riemann Integral Definition**

The **Riemann integral** of a function $ f(x) $ over an interval $ [a, b] $ is defined as:

$$
\int_a^b f(x) \, dx = \lim_{\|P\| \to 0} \sum_{i=1}^{n} f(x_i^*) \Delta x_i
$$

where $ P $ is a partition of the interval and $ x_i^* $ is a sample point in each subinterval.

---

### 20. **Improper Integrals**

An **improper integral** is an integral where either the limits of integration are infinite or the integrand has an infinite discontinuity. The integral is defined as a limit:

$$
\int_a^\infty f(x) \, dx = \lim_{b \to \infty} \int_a^b f(x) \, dx
$$

---

### 21. **Partial Fraction Decomposition**

The **partial fraction decomposition** is used to break down rational functions into simpler fractions for easier integration:

$$
\frac{P(x)}{Q(x)} = \frac{A}{x - r} + \frac{B}{x - s} + \cdots
$$

where $ P(x) $ and $ Q(x) $ are polynomials, and $ r, s, \dots $ are the roots of $ Q(x) $.

---

### 22. **Integration of Rational Functions**

For rational functions of the form $ \frac{P(x)}{Q(x)} $, where $ P(x) $ and $ Q(x) $ are polynomials, the integral is often computed using partial fraction decomposition.

---

### 23. **Separation of Variables**

**Separation of variables** is a method used to solve differential equations, where variables are separated on opposite sides of the equation:

$$
\frac{dy}{dx} = g(x)h(y) \quad \Rightarrow \quad \frac{1}{h(y)} \, dy = g(x) \, dx
$$

---

### 24. **Euler's Method**

**Euler's method** is a numerical technique for solving ordinary differential equations:

$$
y_{n+1} = y_n + h f(x_n, y_n)
$$

where $ h $ is the step size, and $ f(x, y) $ is the function defining the differential equation.

---

### 25. **Laplace Transform**

The **Laplace transform** of a function $ f(t) $ is defined as:

$$
\mathcal{L}\{ f(t) \} = \int_0^\infty e^{-st} f(t) \, dt
$$

where $ s $ is a complex number.

---

### 26. **Inverse Laplace Transform**

The **inverse Laplace transform** is used to recover the original function $ f(t) $ from its Laplace transform:

$$
f(t) = \mathcal{L}^{-1} \{ F(s) \}
$$

---

### 27. **Fourier Series**

A **Fourier series** represents a periodic function $ f(x) $ as a sum of sine and cosine functions:

$$
f(x) = \frac{a_0}{2} + \sum_{n=1}^{\infty} a_n \cos(nx) + b_n \sin(nx)
$$

---

### 28. **Fourier Transform**

The **Fourier transform** of a function $ f(t) $ is defined as:

$$
\mathcal{F}\{ f(t) \} = \int_{-\infty}^{\infty} e^{-i \omega t} f(t) \, dt
$$

where $ \omega $ is the frequency variable.

---

### 29. **Convolution**

The **convolution** of two functions $ f(x) $ and $ g(x) $ is defined as:

$$
(f * g)(x) = \int_{-\infty}^{\infty} f(t) g(x - t) \, dt
$$

---

### 30. **Gradient of a Function**

The **gradient** of a scalar function $ f(x, y, z) $ is the vector of partial derivatives:

$$
\nabla f = \left( \frac{\partial f}{\partial x}, \frac{\partial f}{\partial y}, \frac{\partial f}{\partial z} \right)
$$

---
