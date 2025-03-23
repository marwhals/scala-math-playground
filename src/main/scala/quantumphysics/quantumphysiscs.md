# 30 Important Equations in Quantum Physics

Quantum physics is a fundamental theory in physics that describes nature at the smallest scales, such as that of particles like atoms and photons. Below are 30 key equations in this field.

---

### Quantum States

- The **wavefunction** $ \psi(x, t) $ of a quantum system is a solution to the Schrödinger equation:

  $$
  i \hbar \frac{\partial}{\partial t} \psi(x, t) = \hat{H} \psi(x, t)
  $$

  where $ \hbar $ is the reduced Planck constant and $ \hat{H} $ is the Hamiltonian operator.

- The **probability density** $ |\psi(x, t)|^2 $ represents the likelihood of finding a particle at position $ x $ at time $ t $:

  $$
  P(x, t) = |\psi(x, t)|^2
  $$

---

### The Schrödinger Equation

- The **time-dependent Schrödinger equation** describes how quantum states evolve over time:

  $$
  i \hbar \frac{\partial}{\partial t} \psi(x, t) = \hat{H} \psi(x, t)
  $$

- The **time-independent Schrödinger equation** applies to stationary states and is written as:

  $$
  \hat{H} \psi(x) = E \psi(x)
  $$

  where $ E $ is the energy eigenvalue.

---

### Operators and Commutation Relations

- The **position operator** $ \hat{x} $ and the **momentum operator** $ \hat{p} $ satisfy the fundamental commutation relation:

  $$
  [\hat{x}, \hat{p}] = i \hbar
  $$

- The **Hamiltonian operator** for a particle in a potential is given by:

  $$
  \hat{H} = \frac{\hat{p}^2}{2m} + V(\hat{x})
  $$

  where $ m $ is the mass and $ V(\hat{x}) $ is the potential energy.

---

### Heisenberg Uncertainty Principle

- The **Heisenberg uncertainty principle** relates the uncertainty in position $ \Delta x $ and momentum $ \Delta p $:

  $$
  \Delta x \Delta p \geq \frac{\hbar}{2}
  $$

---

### Quantum Tunneling

- The **quantum tunneling** phenomenon occurs when particles pass through potential barriers. The probability of tunneling is related to the transmission coefficient $ T $:

  $$
  T = e^{-2 \kappa L}
  $$

  where $ \kappa = \frac{\sqrt{2m(V - E)}}{\hbar} $ is the decay constant and $ L $ is the width of the barrier.

---

### Wave-Particle Duality

- The **de Broglie wavelength** $ \lambda $ of a particle is given by:

  $$
  \lambda = \frac{h}{p}
  $$

  where $ h $ is Planck's constant and $ p $ is the particle's momentum.

---

### Planck's Relation

- The **energy of a photon** is related to its frequency $ \nu $ by Planck’s relation:

  $$
  E = h \nu
  $$

  where $ h $ is Planck’s constant.

---

### Quantum Harmonic Oscillator

- The **energy levels** of a quantum harmonic oscillator are quantized and given by:

  $$
  E_n = \left( n + \frac{1}{2} \right) \hbar \omega
  $$

  where $ \omega $ is the angular frequency of oscillation, and $ n $ is a non-negative integer.

---

### Angular Momentum

- The **quantization of angular momentum** states that the angular momentum $ L $ is quantized:

  $$
  L = \sqrt{l(l+1)} \hbar
  $$

  where $ l $ is the angular momentum quantum number.

- The **commutation relation** for angular momentum components $ L_x $, $ L_y $, and $ L_z $ is:

  $$
  [L_i, L_j] = i \hbar \epsilon_{ijk} L_k
  $$

---

### Pauli Matrices

- The **Pauli matrices** $ \sigma_x $, $ \sigma_y $, and $ \sigma_z $ are fundamental in spin systems. They are given by:

  $$
  \sigma_x = \begin{pmatrix} 0 & 1 \\ 1 & 0 \end{pmatrix}, \quad \sigma_y = \begin{pmatrix} 0 & -i \\ i & 0 \end{pmatrix}, \quad \sigma_z = \begin{pmatrix} 1 & 0 \\ 0 & -1 \end{pmatrix}
  $$

---

### Bloch Sphere Representation

- The **Bloch sphere** representation of a qubit state $ |\psi\rangle = \alpha|0\rangle + \beta|1\rangle $ is:

  $$
  |\psi\rangle = \cos\left(\frac{\theta}{2}\right) |0\rangle + e^{i \phi} \sin\left(\frac{\theta}{2}\right) |1\rangle
  $$

  where $ \theta $ and $ \phi $ are spherical coordinates on the Bloch sphere.

---

### Born Rule and Measurement

- The **Born rule** relates the probability of observing a measurement outcome in quantum mechanics:

  $$
  p(a) = |\langle a|\psi \rangle|^2
  $$

  where $ |a\rangle $ is the measurement state and $ |\psi \rangle $ is the system state.

---

### Bell's Theorem and Entanglement

- Bell's inequality provides a test for quantum entanglement and is expressed as:

  $$
  |E(\theta_1, \theta_2) - E(\theta_1', \theta_2')| \leq 2
  $$

  where $ E(\theta_1, \theta_2) $ is the correlation function.

---

### Energy Eigenvalues in Potential Wells

- The **energy eigenvalues** for a particle in a one-dimensional infinite potential well are:

  $$
  E_n = \frac{n^2 \pi^2 \hbar^2}{2mL^2}
  $$

  where $ L $ is the width of the well and $ n $ is a positive integer.

---

### Quantum Electrodynamics (QED)

- The **photon propagator** in QED is given by:

  $$
  D_{\mu \nu}(x, x') = \langle 0 | T \{ A_{\mu}(x) A_{\nu}(x') \} | 0 \rangle
  $$

---

### Feynman Diagrams and Path Integral

- The **path integral formulation** of quantum mechanics involves summing over all possible paths:

  $$
  \langle q_b, t_b | q_a, t_a \rangle = \int \mathcal{D} q \, e^{\frac{i}{\hbar} S[q]}
  $$

  where $ S[q] $ is the action functional and $ \mathcal{D}q $ represents integration over all possible paths.

---

### Dirac Delta Function

- The **Dirac delta function** $ \delta(x) $ satisfies:

  $$
  \int_{-\infty}^{\infty} \delta(x) f(x) \, dx = f(0)
  $$

  for any test function $ f(x) $.

---

### Quantum Field Theory

- The **field commutation relation** in quantum field theory is:

  $$
  [\hat{\phi}(x), \hat{\pi}(y)] = i \hbar \delta(x - y)
  $$

  where $ \hat{\phi}(x) $ is the field operator and $ \hat{\pi}(y) $ is the conjugate momentum.

---

### Klein-Gordon Equation

- The **Klein-Gordon equation** is a relativistic wave equation for scalar fields:

  $$
  (\Box + m^2) \phi(x) = 0
  $$

  where $ \Box = \frac{\partial^2}{\partial t^2} - \nabla^2 $ is the d'Alembert operator and $ m $ is the mass.

---

### Quantum Zeno Effect

- The **quantum Zeno effect** states that the evolution of a quantum system can be halted by frequent measurements:

  $$
  P(\tau) = 1 - \frac{\gamma \tau}{1 + \gamma \tau}
  $$

  where $ \gamma $ is the decay rate and $ \tau $ is the time between measurements.

---

### Covariance in Quantum Mechanics

- The **covariance relation** between the position and momentum operators is:

  $$
  \langle \Delta x \Delta p \rangle = \frac{\hbar}{2}
  $$

---

### Relativistic Energy-Momentum Relation

- The **relativistic energy-momentum relation** for a free particle is:

  $$
  E^2 = p^2 c^2 + m^2 c^4
  $$

  where $ E $ is the energy, $ p $ is the momentum, $ m $ is the mass, and $ c $ is the speed of light.

---

### Fermi's Golden Rule

- The **Fermi golden rule** for the transition rate between quantum states is given by:

  $$
  W_{fi} = \frac{2\pi}{\hbar} | \langle f | H' | i \rangle |^2 \rho(E_f)
  $$

  where $ H' $ is the perturbation Hamiltonian, and $ \rho(E_f) $ is the density of final states.

---

### The Bardeen-Cooper-Schrieffer (BCS) Theory

- The **gap equation** in superconductivity is:

  $$
  \Delta = \frac{1}{\beta} \sum_k \tanh\left(\frac{E_k}{2k_B T}\right)
  $$

  where $ \Delta $ is the energy gap, $ E_k $ is the quasiparticle energy, and $ T $ is the temperature.

---

These **30 equations** provide key insights into the core concepts of **quantum physics**, spanning from quantum mechanics to quantum field theory, particle physics, and superconductivity.
