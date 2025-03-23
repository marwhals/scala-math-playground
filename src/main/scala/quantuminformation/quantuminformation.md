# 30 Important Equations in Quantum Information Theory

---

### Quantum States

- The **state vector** $ |\psi\rangle $ in a quantum system is a vector in a Hilbert space, representing the state of the system.

  $$
  |\psi\rangle = \alpha|0\rangle + \beta|1\rangle
  $$

  where $ |0\rangle $ and $ |1\rangle $ are the computational basis states and $ \alpha $ and $ \beta $ are complex coefficients satisfying $ |\alpha|^2 + |\beta|^2 = 1 $.

- The **density matrix** $ \rho $ of a quantum state is defined as:

  $$
  \rho = |\psi\rangle \langle \psi|
  $$

  for a pure state $ |\psi\rangle $, and more generally for mixed states.

---

### Quantum Measurement

- The probability $ p $ of measuring a state $ |\psi\rangle $ in a state $ |a\rangle $ is given by:

  $$
  p(a) = |\langle a|\psi \rangle|^2
  $$

- The **Born rule** states that the probability of obtaining outcome $ a $ when measuring a quantum system in state $ |\psi\rangle $ is given by $ |\langle a|\psi \rangle|^2 $.

---

### Entanglement

- Two qubits are entangled if their joint state cannot be factored into product states. A general two-qubit state is:

  $$
  |\psi\rangle = \alpha|00\rangle + \beta|01\rangle + \gamma|10\rangle + \delta|11\rangle
  $$

- The **entanglement of formation** of a quantum state is defined as the minimum average entanglement of a mixed state when it is maximally entangled.

---

### Quantum Gates

- A **quantum gate** is a unitary transformation on a quantum state. The Pauli-X gate, which flips the state of a qubit, is represented as:

  $$
  X = \begin{pmatrix} 0 & 1 \\ 1 & 0 \end{pmatrix}
  $$

- The **Hadamard gate** creates superposition and is represented as:

  $$
  H = \frac{1}{\sqrt{2}} \begin{pmatrix} 1 & 1 \\ 1 & -1 \end{pmatrix}
  $$

---

### Quantum Circuits

- The **CNOT gate** (Controlled-NOT) is represented as:

  $$
  \text{CNOT} = \begin{pmatrix} 1 & 0 & 0 & 0 \\ 0 & 1 & 0 & 0 \\ 0 & 0 & 0 & 1 \\ 0 & 0 & 1 & 0 \end{pmatrix}
  $$

- The **controlled gate** can be applied to a qubit based on the control qubit's state. For example, the **controlled-Z** gate is represented as:

  $$
  \text{C-Z} = \begin{pmatrix} 1 & 0 & 0 & 0 \\ 0 & 1 & 0 & 0 \\ 0 & 0 & -1 & 0 \\ 0 & 0 & 0 & 1 \end{pmatrix}
  $$

---

### Quantum Teleportation

- The **state** of the qubit to be teleported, $ |\psi\rangle $, is given by:

  $$
  |\psi\rangle = \alpha|0\rangle + \beta|1\rangle
  $$

- The **Bell state** is used for teleportation, and it is a maximally entangled state:

  $$
  |\Phi^+\rangle = \frac{1}{\sqrt{2}} (|00\rangle + |11\rangle)
  $$

- The teleportation protocol involves applying a **Bell state measurement** to the entangled pair and the state to be teleported, followed by a **classical communication**.

---

### Quantum Information and Entropy

- The **von Neumann entropy** of a quantum state $ \rho $ is defined as:

  $$
  S(\rho) = -\text{Tr}(\rho \log \rho)
  $$

  where $ \text{Tr} $ is the trace of the matrix and $ \log $ is the matrix logarithm.

- The **Shannon entropy** of a probability distribution $ p(x) $ is defined as:

  $$
  H(X) = - \sum_{x} p(x) \log p(x)
  $$

- The **mutual information** between two quantum systems $ A $ and $ B $ is given by:

  $$
  I(A:B) = S(\rho_A) + S(\rho_B) - S(\rho_{AB})
  $$

  where $ S(\rho_A) $ is the von Neumann entropy of subsystem $ A $, $ \rho_A $ is the reduced density matrix of $ A $, and $ \rho_{AB} $ is the joint density matrix of the systems $ A $ and $ B $.

---

### Quantum Error Correction

- The **quantum Hamming bound** for error correction is given by:

  $$
  2k + 1 \leq n
  $$

  where $ n $ is the total number of qubits, and $ k $ is the number of correctable errors.

- The **Shannon capacity** of a quantum channel is given by the **Holevo bound**:

  $$
  \chi(\rho) = S(\rho) - \sum_i p_i S(\rho_i)
  $$

  where $ \rho_i $ is the reduced state of the subsystem and $ p_i $ are the corresponding probabilities.

---

### Quantum Algorithms

- The **Hadamard transform** applied to $ |0\rangle $ creates an equal superposition state:

  $$
  H|0\rangle = \frac{1}{\sqrt{2}}(|0\rangle + |1\rangle)
  $$

- The **quantum Fourier transform** is used in Shor's algorithm, and for a state $ |x\rangle $, it is given by:

  $$
  QFT|x\rangle = \frac{1}{\sqrt{N}} \sum_{y=0}^{N-1} e^{2\pi i xy/N}|y\rangle
  $$

---

### Quantum Communication

- The **superdense coding** protocol allows sending 2 classical bits by sending just 1 qubit, using an entangled state:

  $$
  |\Phi^+\rangle = \frac{1}{\sqrt{2}}(|00\rangle + |11\rangle)
  $$

  where the sender encodes 2 bits in one qubit by applying the appropriate Pauli gate.

- The **quantum channel capacity** is given by the Holevo bound:

  $$
  C = \max_{\rho} \chi(\rho)
  $$

---

### Quantum Cryptography

- The **BB84 protocol** for quantum key distribution uses the following four states:

  $$
  |\phi^+\rangle = \frac{1}{\sqrt{2}}(|00\rangle + |11\rangle), \quad |\phi^-\rangle = \frac{1}{\sqrt{2}}(|00\rangle - |11\rangle)
  $$

- The **security** of quantum cryptography relies on the **no-cloning theorem**, which states that:

  $$
  |\psi\rangle \neq |\psi\rangle \otimes |\psi\rangle
  $$

  meaning a quantum state cannot be copied exactly.

---

### Quantum Complexity

- The **time complexity** of Grover's search algorithm is given by:

  $$
  O(\sqrt{N})
  $$

  where $ N $ is the number of possible solutions in the database.

- The **quantum speedup** in solving certain problems is given by:

  $$
  O(\log N)
  $$

  in comparison to classical algorithms.

---

### Quantum Fourier Transform

- The **Quantum Fourier Transform (QFT)** of a state $ |x\rangle $ is:

  $$
  QFT|x\rangle = \frac{1}{\sqrt{N}} \sum_{y=0}^{N-1} e^{2\pi i xy/N}|y\rangle
  $$

  This is used in algorithms such as Shor's algorithm for integer factorization.

---

### Quantum State Tomography

- The **quantum state tomography** process estimates the density matrix $ \rho $ from measurements. For a system with $ n $ qubits, it involves:

  $$
  \rho = \frac{1}{2^n} \sum_{i} M_i \rho M_i^\dagger
  $$

  where $ M_i $ are the measurement operators.

---