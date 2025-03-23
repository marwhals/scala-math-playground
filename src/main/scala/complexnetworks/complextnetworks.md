# Most Important Results in Complex Networks

---

## 1. **Small-World Effect (Milgram’s Experiment)**

Describes how most pairs of nodes in a network are connected by a **short path**.

- **Result:**  
  In many real-world networks, the **average shortest path length** $ L $ grows **logarithmically** with the number of nodes $ N $.

$$
L \propto \log(N)
$$

- **Significance:**
    - Demonstrates the **"six degrees of separation"** phenomenon in social networks.
    - Applied in **distributed systems** and **routing algorithms**.

---

## 2. **Scale-Free Networks (Power-Law Degree Distribution)**

In many real-world networks, the **degree distribution** follows a power law.

- **Degree Distribution:**
  $$
  P(k) \propto k^{-\gamma}
  $$

Where:
- $ P(k) $ is the probability that a node has $ k $ connections
- $ \gamma $ is the **degree exponent**, typically in the range $ 2 < \gamma < 3 $

- **Significance:**
    - Found in the **internet topology**, **biological networks**, and **citation networks**.
    - Makes networks **resilient to random failures** but vulnerable to **targeted attacks**.

---

## 3. **Preferential Attachment (Barabási-Albert Model)**

Explains the emergence of **scale-free networks**.

- **Growth Rule:**
    - New nodes prefer to connect to **high-degree** existing nodes.
    - "The rich get richer" phenomenon.

- **Mathematical Formulation:**
  $$
  \Pi(k) = \frac{k}{\sum_i k_i}
  $$

Where:
- $ \Pi(k) $ is the probability of connecting to a node with degree $ k $
- The model produces a **power-law degree distribution**

---

## 4. **Clustering Coefficient**

Measures the **likelihood that neighbors of a node are connected**.

- **Local Clustering Coefficient:**
  $$
  C_i = \frac{2T_i}{k_i(k_i - 1)}
  $$

Where:
- $ T_i $ is the number of triangles around node $ i $
- $ k_i $ is the degree of node $ i $

- **Global Clustering Coefficient:**
  $$
  C = \frac{3 \times \text{number of triangles}}{\text{number of connected triples}}
  $$

---

## 5. **Network Assortativity**

Measures the tendency of **nodes to connect to similar nodes**.

- **Assortativity Coefficient:**
  $$
  r = \frac{\sum_{ij}(x_i - \mu)(y_j - \mu)}{\sum_{ij}(x_i - \mu)^2}
  $$

Where:
- $ x_i, y_j $ are the degrees of connected nodes
- $ \mu $ is the mean degree

- **Results:**
    - $ r > 0 $: **Assortative** (similar degrees connect, e.g., social networks)
    - $ r < 0 $: **Disassortative** (dissimilar degrees connect, e.g., biological networks)

---

## 6. **Percolation Theory in Networks**

Describes **network robustness** under random node or edge removal.

- **Critical Percolation Threshold:**
  $$
  p_c = \frac{1}{\langle k^2 \rangle / \langle k \rangle - 1}
  $$

Where:
- $ p_c $ is the fraction of nodes that must be removed for disintegration
- $ \langle k \rangle $ is the average degree
- $ \langle k^2 \rangle $ is the second moment of the degree distribution

- **Significance:**
    - Scale-free networks are **more resilient** to random failures but **vulnerable to targeted attacks**.

---

## 7. **Community Detection**

Identifies **groups of densely connected nodes** in networks.

- **Modularity:**
  $$
  Q = \frac{1}{2m} \sum_{ij} \left[ A_{ij} - \frac{k_i k_j}{2m} \right] \delta(c_i, c_j)
  $$

Where:
- $ A_{ij} $ is the adjacency matrix
- $ k_i, k_j $ are the degrees of nodes $ i $ and $ j $
- $ m $ is the total number of edges
- $ \delta(c_i, c_j) $ is 1 if $ i $ and $ j $ belong to the same community

- **Significance:**
    - Used in **clustering algorithms** and **community detection** in social and biological networks.

---

## 8. **Betweenness Centrality**

Measures how often a **node acts as a bridge** along the shortest path between pairs of nodes.

- **Betweenness Centrality:**
  $$
  g(v) = \sum_{s \neq v \neq t} \frac{\sigma(s, t | v)}{\sigma(s, t)}
  $$

Where:
- $ \sigma(s, t) $ is the number of shortest paths between $ s $ and $ t $
- $ \sigma(s, t | v) $ is the number of those paths passing through $ v $

---

## 9. **PageRank Algorithm**

Ranks **nodes by importance** based on incoming links.

- **PageRank Equation:**
  $$
  PR(i) = \frac{1 - d}{N} + d \sum_{j \in M(i)} \frac{PR(j)}{L(j)}
  $$

Where:
- $ PR(i) $ is the PageRank of node $ i $
- $ M(i) $ is the set of nodes linking to $ i $
- $ L(j) $ is the number of outbound links from node $ j $
- $ d $ is the **damping factor** (typically $ d = 0.85 $)

---

## 10. **Network Synchronization**

Describes the **synchronization of dynamic processes** on networks.

- **Master Stability Function:**
  $$
  \lambda_c = \frac{\alpha}{\beta}
  $$

Where:
- $ \lambda_c $ is the synchronization threshold
- $ \alpha $ and $ \beta $ are coupling parameters

- **Significance:**
    - Used to model **epidemic spreading** and **consensus dynamics**.

---

## 11. **Random Graphs (Erdős–Rényi Model)**

Describes networks formed by **randomly connecting pairs of nodes**.

- **Connection Probability:**
  $$
  P(G) = p^E(1 - p)^{\binom{N}{2} - E}
  $$

Where:
- $ N $ is the number of nodes
- $ E $ is the number of edges
- $ p $ is the connection probability

---

## 12. **Mean-Field Theory for Epidemic Spreading**

Models the **spread of diseases** on networks.

- **Basic Reproduction Number:**
  $$
  R_0 = \frac{\beta}{\mu}
  $$

Where:
- $ R_0 $ is the basic reproduction number
- $ \beta $ is the infection rate
- $ \mu $ is the recovery rate

---

## 13. **Network Reciprocity and Cooperation**

Describes how **cooperation emerges** in social networks.

- **Reciprocity Index:**
  $$
  r = \frac{L_{\text{reciprocal}}}{L}
  $$

Where:
- $ L_{\text{reciprocal}} $ is the number of reciprocal edges
- $ L $ is the total number of edges

---

## 14. **Graph Laplacian**

The **Laplacian matrix** of a graph captures **connectivity information**.

- **Laplacian Matrix:**
  $$
  L = D - A
  $$

Where:
- $ D $ is the degree matrix (diagonal matrix of vertex degrees)
- $ A $ is the adjacency matrix

- **Significance:**
    - Used in **spectral graph theory**, **network robustness**, and **clustering**.

---

## 15. **Cheeger's Inequality**

Relates the **expansion of a graph** to its **spectral gap**.

- **Inequality:**
  $$
  \frac{h(G)}{2} \leq \lambda_2 \leq h(G)
  $$

Where:
- $ h(G) $ is the **edge expansion** of the graph
- $ \lambda_2 $ is the **second smallest eigenvalue** of the graph Laplacian

---

## 16. **Rich-Club Phenomenon**

Describes the tendency for **high-degree nodes** to be more connected to each other.

- **Rich-Club Coefficient:**
  $$
  RC(k) = \frac{E_{k}}{E_{k_{\text{max}}}}
  $$

Where:
- $ E_k $ is the number of edges among nodes with degree $ k $
- $ E_{k_{\text{max}}} $ is the maximum possible number of edges for nodes with degree $ k $

---

## 17. **Harmonic Centrality**

A variation of **centrality** that accounts for the **distance** between nodes.

- **Harmonic Centrality:**
  $$
  h(v) = \sum_{u \neq v} \frac{1}{d(u, v)}
  $$

Where:
- $ d(u, v) $ is the distance between nodes $ u $ and $ v $

---

## 18. **Node Degree Distribution**

Describes the **distribution of connections** per node in a network.

- **Degree Distribution:**
  $$
  P(k) = \frac{k^{-\gamma}}{Z}
  $$

Where:
- $ P(k) $ is the probability that a node has degree $ k $
- $ Z $ is the normalization constant

---

## 19. **Dynamic Network Growth Models**

Model how **networks evolve over time**.

- **General Growth Rule:**
  $$
  N(t+1) = N(t) + \Delta N
  $$

Where:
- $ N(t) $ is the number of nodes at time $ t $
- $ \Delta N $ is the change in the number of nodes

---

## 20. **Social Network Dynamics (Social Contagion Models)**

Describes the **spread of behaviors or information** in social networks.

- **Basic Model:**
  $$
  S(t+1) = S(t) + \beta I(t)
  $$

Where:
- $ S(t) $ is the number of susceptible individuals
- $ I(t) $ is the number of infected individuals
- $ \beta $ is the transmission rate

---