# PageRank Algorithm: Steps and Equations

## Steps to Compute PageRank:

1. **Initialization**:
   Assign an initial PageRank value to each page. Typically:
   $$
   PR(P) = \frac{1}{N}, \quad \forall P \in \text{Pages}
   $$
   Where $ N $ is the total number of pages.

2. **Iterative Calculation**:
   Apply the PageRank formula iteratively to update the values of each page:
   $$
   PR(P) = \frac{1 - d}{N} + d \sum_{i \in \text{In}(P)} \frac{PR(i)}{L(i)}
   $$
    - $ PR(P) $: PageRank of page $ P $
    - $ d $: Damping factor (typically $ 0.85 $)
    - $ \text{In}(P) $: Set of pages linking to page $ P $
    - $ L(i) $: Number of outgoing links from page $ i $

3. **Convergence**:
   Repeat the iteration until the PageRank values converge (i.e., the values stabilize and changes are smaller than a threshold).

4. **Normalization**:
   Normalize the PageRank values so that their sum equals 1:
   $$
   \sum_{P} PR(P) = 1
   $$

## Matrix Formulation:

1. **Link Matrix Representation**:
   The PageRank can be written in matrix form:
   $$
   \mathbf{PR} = (1 - d) \cdot \frac{1}{N} \mathbf{1} + d \cdot M \mathbf{PR}
   $$
   Where:
    - $ \mathbf{PR} $ is the PageRank vector.
    - $ M $ is the link matrix.
    - $ \mathbf{1} $ is a vector of ones.

2. **Final Equation**:
   Rearrange the equation to compute the PageRank vector:
   $$
   \mathbf{PR} = (I - d M)^{-1} \cdot \left( (1 - d) \cdot \frac{1}{N} \mathbf{1} \right)
   $$
   Where:
    - $ I $ is the identity matrix.

## Key Concepts:

- **Damping factor $ d $**: Accounts for random jumps in the web structure. Typically set to 0.85.
- **Convergence**: The process continues until the PageRank values stop changing significantly.
