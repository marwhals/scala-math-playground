# GPT Generated Useful Mathematical Equations in Cryptography

---

## Modular Arithmetic (Foundation of Many Cryptographic Algorithms)

- **Modulo Operation:**  
  $$
  a \mod n = r
  $$  
  Where:
- $a$ is the dividend
- $n$ is the divisor
- $r$ is the remainder

- **Modular Addition, Subtraction, and Multiplication:**
  $$
  (a + b) \mod n = [(a \mod n) + (b \mod n)] \mod n
  $$
  $$
  (a - b) \mod n = [(a \mod n) - (b \mod n)] \mod n
  $$
  $$
  (a \times b) \mod n = [(a \mod n) \times (b \mod n)] \mod n
  $$
- **Modular Inverse:**  
  If $ a $ and $ n $ are coprime $(gcd = 1)$, the **modular inverse** exists:
  $$
  a^{-1} \mod n
  $$  
  Such that:
  $$
  (a \times a^{-1}) \mod n = 1
  $$

---

## Euclidean and Extended Euclidean Algorithm
Used for computing the greatest common divisor (GCD) and the modular inverse.

- **Euclidean Algorithm:**
  $$
  \text{gcd}(a, b) = \text{gcd}(b, a \mod b)
  $$

- **Extended Euclidean Algorithm:**  
  To find $ x $ and $ y $ such that:
  $$
  a \times x + b \times y = \text{gcd}(a, b)
  $$

---

## Euler’s Totient Function (ϕ)
Used in **RSA encryption** and **public-key cryptography**.

- **Definition:**
  $$
  \varphi(n) = n \times \prod_{p | n} \left(1 - \frac{1}{p}\right)
  $$  
  Where:
- $ p $ are the prime factors of $ n $

For a prime number $ p $:
$$
\varphi(p) = p - 1
$$

For two coprime numbers $ m $ and $ n $:
$$
\varphi(m \times n) = \varphi(m) \times \varphi(n)
$$

---

## RSA Cryptography

- **Key Generation:**
    - Choose two large prime numbers: $ p $ and $ q $
    - Compute $ n = p \times q $
    - Compute Euler’s totient:
      $$
      \varphi(n) = (p-1)(q-1)
      $$

- **Public and Private Keys:**
    - Choose public exponent $ e $ such that:
      $$
      1 < e < \varphi(n), \quad \text{gcd}(e, \varphi(n)) = 1
      $$
    - Compute the private key $ d $ (modular inverse of $ e $):
      $$
      d \times e \mod \varphi(n) = 1
      $$

- **Encryption and Decryption:**
    - **Encryption:**  
      $$
      c = m^e \mod n
      $$
    - **Decryption:**  
      $$
      m = c^d \mod n
      $$

---

## Diffie-Hellman Key Exchange

Used for **secure key exchange** over an insecure channel.

- **Key Generation:**
    - Select a large prime $ p $ and a **primitive root** $ g $
    - Alice picks a private key $ a $ and computes:
      $$
      A = g^a \mod p
      $$
    - Bob picks a private key $ b $ and computes:
      $$
      B = g^b \mod p
      $$

- **Key Exchange:**
    - Both exchange $ A $ and $ B $
    - Alice computes:
      $$
      s = B^a \mod p
      $$
    - Bob computes:
      $$
      s = A^b \mod p
      $$

Both Alice and Bob arrive at the same **shared secret key** $ s $.

---

## ElGamal Encryption

Used in **asymmetric encryption**.

- **Key Generation:**
    - Choose a large prime $ p $ and a primitive root $ g $
    - Select a private key $ x $ and compute:
      $$
      y = g^x \mod p
      $$

- **Encryption:**
    - Choose random $ k $
    - Compute:
      $$
      c_1 = g^k \mod p
      $$
      $$
      c_2 = m \times y^k \mod p
      $$

- **Decryption:**
  $$
  m = c_2 \times c_1^{p-1-x} \mod p
  $$

---

## Elliptic Curve Cryptography (ECC)

- **Elliptic Curve Equation:**
  $$
  y^2 = x^3 + ax + b \mod p
  $$

- **Point Addition (P + Q):**
  $$
  x_r = \lambda^2 - x_p - x_q \mod p
  $$
  $$
  y_r = \lambda(x_p - x_r) - y_p \mod p
  $$

Where:
$$
\lambda = \frac{y_q - y_p}{x_q - x_p} \mod p
$$

- **Point Doubling (2P):**
  $$
  \lambda = \frac{3x_p^2 + a}{2y_p} \mod p
  $$

---

## Hashing Algorithms

Used in **digital signatures** and **message integrity**.

- **MD5 Hash:**
  $$
  H = \text{MD5}(m)
  $$

- **SHA-256 Hash:**
  $$
  H = \text{SHA-256}(m)
  $$

- **HMAC (Hash-based Message Authentication Code):**
  $$
  H = \text{HMAC}(K, m) = \text{hash}((K' \oplus \text{opad}) || \text{hash}((K' \oplus \text{ipad}) || m))
  $$

---

## Symmetric Encryption (AES)

- **AES Round Key Expansion:**
  $$
  w[i] = w[i - N_k] \oplus \text{SubWord}(\text{RotWord}(w[i - 1])) \oplus Rcon[i/N_k]
  $$

- **AES Encryption:**
  $$
  \text{Ciphertext} = E_k(plaintext)
  $$

- **AES Decryption:**
  $$
  \text{Plaintext} = D_k(ciphertext)
  $$

---

## Shamir's Secret Sharing
Used for **splitting secrets into multiple shares**.

- **Polynomial Representation:**
  $$
  f(x) = a_0 + a_1x + a_2x^2 + \dots + a_{k-1}x^{k-1} \mod p
  $$

- **Share Generation:**
  $$
  s_i = f(i) \mod p
  $$

Any **k of n shares** can reconstruct the secret using **Lagrange interpolation**.

---

# More Important Mathematical Equations in Cryptography

In addition to the fundamental equations listed earlier, here are **10 more important mathematical equations and concepts** used in cryptography, covering **lattice-based cryptography, zero-knowledge proofs, pairing-based cryptography**, and more.

---

## Chinese Remainder Theorem (CRT)

Used in **RSA optimization** and **multi-prime cryptosystems**.

- **CRT Theorem:**
  Given:
  $$
  x \equiv a_1 \pmod{m_1}
  $$
  $$
  x \equiv a_2 \pmod{m_2}
  $$
  $$
  \vdots
  $$
  $$
  x \equiv a_k \pmod{m_k}
  $$

Where $ m_1, m_2, \dots, m_k $ are pairwise coprime, the solution is:
$$
x = \sum_{i=1}^{k} a_i M_i y_i \mod M
$$

Where:
- $ M = m_1 \times m_2 \times \dots \times m_k $
- $ M_i = M / m_i $
- $ y_i = M_i^{-1} \mod m_i $ (modular inverse)

---

## Lattice-based Cryptography: Learning With Errors (LWE)

Used in **post-quantum cryptography**.

- **LWE Equation:**
  $$
  b = \langle \mathbf{a}, \mathbf{s} \rangle + e \pmod{q}
  $$

Where:
- $ \mathbf{a} $ is a random vector
- $ \mathbf{s} $ is the secret vector
- $ e $ is a small error term
- $ q $ is the modulus

The hardness of solving LWE forms the basis of lattice-based cryptosystems.

---

## Paillier Cryptosystem (Homomorphic Encryption)

Supports **homomorphic addition** of encrypted values.

- **Key Generation:**
    - Select two primes $ p $ and $ q $
    - Compute $ n = p \times q $
    - Compute $ \lambda = \text{lcm}(p-1, q-1) $

- **Encryption:**
  $$
  c = g^m \times r^n \mod n^2
  $$

- **Decryption:**
  $$
  m = \frac{L(c^\lambda \mod n^2)}{L(g^\lambda \mod n^2)} \mod n
  $$

Where:
$$
L(x) = \frac{x - 1}{n}
$$

---

## Elliptic Curve Diffie-Hellman (ECDH)

Used for **secure key exchange** with elliptic curves.

- **Key Generation:**
    - Alice picks a private key $ a $
    - Bob picks a private key $ b $
    - Both compute the corresponding public keys:  
      $$
      A = a \times G
      $$  
      $$
      B = b \times G
      $$

- **Shared Key:**
  $$
  S = a \times B = b \times A = a \times b \times G
  $$

---

## Bilinear Pairing (Pairing-based Cryptography)

Used in **identity-based encryption (IBE)** and **attribute-based encryption (ABE)**.

- **Bilinear Map:**  
  $$
  e: G_1 \times G_2 \rightarrow G_T
  $$

- **Properties:**
    - Bilinear:  
      $$
      e(aP, bQ) = e(P, Q)^{ab}
      $$
    - Non-degenerate:  
      $$
      e(P, Q) \neq 1
      $$

Where:
- $ P, Q \in G_1 $
- $ G_T $ is a finite group

---

## Zero-Knowledge Proof (ZKP)

Used for **privacy-preserving authentication**.

- **Schnorr Protocol (ZKP):**
    - Prover chooses random $ r $ and computes:
      $$
      R = g^r \mod p
      $$
    - Sends $ R $ to the verifier
    - Verifier sends random challenge $ c $
    - Prover computes:
      $$
      s = r + c \times x \mod (p-1)
      $$
    - Verifier checks:
      $$
      g^s \equiv R \times y^c \mod p
      $$

---

## Shor’s Algorithm (Quantum Cryptography)

Used to **factor large integers** and break RSA with quantum computers.

- **Quantum Period Finding:**
  $$
  f(x) = a^x \mod N
  $$

The goal is to find the **period** $$ r $$ of the function:
$$
f(x + r) = f(x)
$$

- **Factorization:**
    - If $$ r $$ is even:
      $$
      \text{gcd}(a^{r/2} - 1, N)
      $$
    - This reveals a factor of $ N $.

---

## Hamming Distance

Used in **error correction codes** and cryptographic protocols.

- **Hamming Distance Equation:**
  $$
  d(a, b) = \sum_{i=1}^{n} (a_i \oplus b_i)
  $$

Where:
- $ a $ and $ b $ are binary strings
- $ \oplus $ is the XOR operator

---

## Polynomial Commitment Schemes

Used in **zero-knowledge proofs** and **verifiable computations**.

- **Polynomial Commitment:**
  $$
  C = g^{f(x)} \mod p
  $$

Where:
- $ f(x) $ is the polynomial
- $ g $ is a generator
- $ p $ is a prime modulus

- **Evaluation Proof:**
    - Prove that $ f(z) = v $ for a given $ z $
    - Compute:
      $$
      q(x) = \frac{f(x) - v}{x - z}
      $$

---

## Blake2 and SHA-3 Hash Functions

Modern cryptographic hash functions with stronger security properties.

- **Blake2 Hash Function:**
  $$
  H = \text{Blake2}(m, k)
  $$

- **SHA-3 Hash:**
  $$
  H = \text{Keccak}(m)
  $$

Where:
- $ m $ is the input message
- $ k $ is the key for keyed hashing

---