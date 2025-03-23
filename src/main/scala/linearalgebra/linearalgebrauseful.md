# 50 Important Results in Linear Algebra

Linear Algebra is fundamental in mathematics and its applications, providing tools for **vector spaces**, **matrices**, **eigenvalues**, and much more. Below are **50 important results** in linear algebra.

---

### Vector Spaces

- A set $ V $ is a **vector space** if it is closed under addition and scalar multiplication, and satisfies the axioms of associativity, commutativity, and distributivity.

- If $ V $ is a vector space, the **zero vector** $ \mathbf{0} $ satisfies $ \mathbf{0} + v = v $ for all $ v \in V $.

- A **subspace** of a vector space $ V $ is a subset $ W \subseteq V $ that is itself a vector space.

- A set $ \{v_1, v_2, \dots, v_k\} $ of vectors in $ V $ is **linearly independent** if the only solution to the equation $ c_1v_1 + c_2v_2 + \dots + c_kv_k = 0 $ is $ c_1 = c_2 = \dots = c_k = 0 $.

- If a set of vectors $ \{v_1, v_2, \dots, v_k\} $ spans a vector space $ V $, every element of $ V $ can be expressed as a linear combination of $ v_1, v_2, \dots, v_k $.

---

### Matrix Operations

- The **transpose** of a matrix $ A $, denoted $ A^T $, is formed by swapping the rows and columns of $ A $.

- For any matrices $ A $ and $ B $, the **product** of $ A $ and $ B $ satisfies $ (AB)^T = B^T A^T $.

- If $ A $ and $ B $ are square matrices of the same size, then $ (A + B)^{-1} = A^{-1} + B^{-1} $ is not generally true, but it holds for diagonal matrices.

- The **inverse** of a matrix $ A $, denoted $ A^{-1} $, satisfies $ AA^{-1} = A^{-1}A = I $, where $ I $ is the identity matrix.

- A matrix $ A $ is **invertible** if and only if $ \det(A) \neq 0 $.

---

### Determinants

- The **determinant** of a 2x2 matrix $ A = \begin{pmatrix} a & b \\ c & d \end{pmatrix} $ is given by:

  $$
  \det(A) = ad - bc
  $$

- The **determinant** of a matrix $ A $ is a linear function of its rows (or columns).

- For a square matrix $ A $, the **determinant** satisfies the property $ \det(A^T) = \det(A) $.

- The **determinant** of a matrix product satisfies:

  $$
  \det(AB) = \det(A) \cdot \det(B)
  $$

- If a matrix has two equal rows (or columns), then its determinant is zero.

---

### Eigenvalues and Eigenvectors

- A scalar $ \lambda $ is an **eigenvalue** of a matrix $ A $ if there exists a non-zero vector $ v $ such that:

  $$
  Av = \lambda v
  $$

- The **eigenvector** corresponding to an eigenvalue $ \lambda $ satisfies the equation $ (A - \lambda I)v = 0 $.

- The characteristic polynomial of a matrix $ A $, denoted $ p_A(\lambda) $, is given by:

  $$
  p_A(\lambda) = \det(A - \lambda I)
  $$

- A matrix is **diagonalizable** if it has a full set of linearly independent eigenvectors.

- If $ A $ is a diagonalizable matrix, it can be written as:

  $$
  A = PDP^{-1}
  $$

  where $ D $ is a diagonal matrix of eigenvalues and $ P $ is the matrix of eigenvectors.

---

### Inner Products and Norms

- The **inner product** of two vectors $ u $ and $ v $ in $ \mathbb{R}^n $ is defined as:

  $$
  \langle u, v \rangle = u_1v_1 + u_2v_2 + \dots + u_nv_n
  $$

- The **norm** of a vector $ v $ is given by:

  $$
  \|v\| = \sqrt{\langle v, v \rangle}
  $$

- The **Cauchy-Schwarz inequality** states that for any vectors $ u $ and $ v $:

  $$
  |\langle u, v \rangle| \leq \|u\| \|v\|
  $$

- The **triangle inequality** for vectors states that:

  $$
  \|u + v\| \leq \|u\| + \|v\|
  $$

- If $ u $ and $ v $ are orthogonal, then $ \langle u, v \rangle = 0 $.

---

### Singular Value Decomposition

- The **Singular Value Decomposition (SVD)** of a matrix $ A \in \mathbb{R}^{m \times n} $ is:

  $$
  A = U \Sigma V^T
  $$

  where $ U $ is an $ m \times m $ orthogonal matrix, $ \Sigma $ is an $ m \times n $ diagonal matrix, and $ V $ is an $ n \times n $ orthogonal matrix.

- The **singular values** of a matrix are the entries of the diagonal matrix $ \Sigma $, and they are the square roots of the eigenvalues of $ A^T A $ or $ A A^T $.

- The **rank** of a matrix is the number of non-zero singular values.

---

### Matrix Factorizations

- **QR Factorization**: Any matrix $ A \in \mathbb{R}^{m \times n} $ can be factorized as:

  $$
  A = QR
  $$

  where $ Q $ is an orthogonal matrix and $ R $ is an upper triangular matrix.

- **LU Factorization**: A matrix $ A $ can be factored as:

  $$
  A = LU
  $$

  where $ L $ is a lower triangular matrix and $ U $ is an upper triangular matrix.

---

### Rank and Nullity

- The **rank** of a matrix $ A $, denoted $ \text{rank}(A) $, is the dimension of the row space or column space of $ A $.

- The **nullity** of a matrix $ A $, denoted $ \text{null}(A) $, is the dimension of the null space of $ A $.

- The **rank-nullity theorem** states:

  $$
  \text{rank}(A) + \text{nullity}(A) = n
  $$

  where $ n $ is the number of columns of $ A $.

---

### Linear Transformations

- A **linear transformation** $ T: V \to W $ satisfies:

  $$
  T(c_1 v_1 + c_2 v_2) = c_1 T(v_1) + c_2 T(v_2)
  $$

  for any vectors $ v_1, v_2 \in V $ and scalars $ c_1, c_2 $.

- The **matrix representation** of a linear transformation $ T $ with respect to bases $ \{v_1, v_2, \dots, v_n\} $ and $ \{w_1, w_2, \dots, w_m\} $ is given by the matrix $ [T] $ such that:

  $$
  T(v_i) = \sum_{j=1}^m [T]_{ji} w_j
  $$

---

### Diagonalization

- A matrix $ A $ is diagonalizable if there exists an invertible matrix $ P $ and a diagonal matrix $ D $ such that:

  $$
  A = PDP^{-1}
  $$

- A matrix is diagonalizable if and only if it has **n linearly independent eigenvectors**.

- The eigenvalues of a diagonal matrix are simply the entries on its diagonal.

---

### Matrix Exponentiation

- The **matrix exponential** $ e^A $ of a square matrix $ A $ is defined by the power series:

  $$
  e^A = \sum_{n=0}^{\infty} \frac{A^n}{n!}
  $$

- For any diagonal matrix $ D $, the matrix exponential $ e^D $ is simply the exponential of each diagonal entry.

---

### Orthogonality

- Two vectors $ u $ and $ v $ are **orthogonal** if:

  $$
  \langle u, v \rangle = 0
  $$

- A set of vectors $ \{v_1, v_2, \dots, v_k\} $ is **orthogonal** if $ \langle v_i, v_j \rangle = 0 $ for all $ i \neq j $.

- If a set of vectors is orthogonal and each vector has unit length, the set is said to be **orthonormal**.

---

### Conclusion

These **50 results** represent key concepts in **linear algebra**, covering vector spaces, matrices, determinants, eigenvalues, inner products, and much more. These results form the foundation of many applications in mathematics, engineering, computer science, and physics.
