# 50 Important Results in Category Theory

---

### 1. **Category Definition**

A **category** $ \mathcal{C} $ consists of:
- A collection of objects.
- A collection of morphisms (arrows) between objects.
- For each pair of morphisms $ f: A \to B $ and $ g: B \to C $, a composition $ g \circ f: A \to C $.
- An identity morphism $ \text{id}_A: A \to A $ for each object $ A $.

---

### 2. **Functors**

A **functor** $ F: \mathcal{C} \to \mathcal{D} $ between categories $ \mathcal{C} $ and $ \mathcal{D} $ consists of:
- A map $ F: \text{Ob}(\mathcal{C}) \to \text{Ob}(\mathcal{D}) $ between objects.
- A map $ F: \text{Mor}(\mathcal{C}) \to \text{Mor}(\mathcal{D}) $ between morphisms, such that for all $ f: A \to B $, $ F(f): F(A) \to F(B) $.
- $ F $ preserves composition and identity morphisms.

---

### 3. **Natural Transformation**

A **natural transformation** $ \eta $ between two functors $ F, G: \mathcal{C} \to \mathcal{D} $ is a family of morphisms $ \eta_A: F(A) \to G(A) $ for each object $ A \in \mathcal{C} $, satisfying the naturality condition:

$$
G(f) \circ \eta_A = \eta_B \circ F(f)
$$

for all morphisms $ f: A \to B $.

---

### 4. **Monoids as Categories**

A **monoid** can be viewed as a category with a single object, where the morphisms are the elements of the monoid and composition corresponds to the monoid operation.

---

### 5. **Limits and Colimits**

A **limit** of a diagram $ D: \mathcal{I} \to \mathcal{C} $ in a category $ \mathcal{C} $ is an object $ L $ along with morphisms from each object in the diagram to $ L $, satisfying a universal property. The **colimit** is the dual notion.

---

### 6. **Products**

The **product** of objects $ A $ and $ B $ in a category $ \mathcal{C} $ is an object $ A \times B $ together with projection morphisms $ \pi_1: A \times B \to A $ and $ \pi_2: A \times B \to B $, such that for any object $ C $ with morphisms $ f: C \to A $ and $ g: C \to B $, there exists a unique morphism $ h: C \to A \times B $ such that:

$$
\pi_1 \circ h = f, \quad \pi_2 \circ h = g
$$

---

### 7. **Coproducts**

The **coproduct** of objects $ A $ and $ B $ in a category $ \mathcal{C} $ is an object $ A + B $ together with injection morphisms $ \iota_1: A \to A + B $ and $ \iota_2: B \to A + B $, such that for any object $ C $ with morphisms $ f: A \to C $ and $ g: B \to C $, there exists a unique morphism $ h: A + B \to C $ such that:

$$
h \circ \iota_1 = f, \quad h \circ \iota_2 = g
$$

---

### 8. **Epimorphisms**

An **epimorphism** is a morphism $ f: A \to B $ such that for any pair of morphisms $ g, h: B \to C $, if $ g \circ f = h \circ f $, then $ g = h $.

---

### 9. **Monomorphisms**

A **monomorphism** is a morphism $ f: A \to B $ such that for any pair of morphisms $ g, h: C \to A $, if $ f \circ g = f \circ h $, then $ g = h $.

---

### 10. **Isomorphisms**

An **isomorphism** is a morphism $ f: A \to B $ such that there exists a morphism $ g: B \to A $ with $ f \circ g = \text{id}_B $ and $ g \circ f = \text{id}_A $.

---

### 11. **Initial Objects**

An **initial object** in a category $ \mathcal{C} $ is an object $ I $ such that for every object $ A $, there exists a unique morphism from $ I $ to $ A $.

---

### 12. **Terminal Objects**

A **terminal object** in a category $ \mathcal{C} $ is an object $ T $ such that for every object $ A $, there exists a unique morphism from $ A $ to $ T $.

---

### 13. **Adjoint Functors**

Two functors $ F: \mathcal{C} \to \mathcal{D} $ and $ G: \mathcal{D} \to \mathcal{C} $ are **adjoint** if there is a natural isomorphism between the hom-sets:

$$
\text{Hom}_{\mathcal{D}}(F(A), B) \cong \text{Hom}_{\mathcal{C}}(A, G(B))
$$

where $ A \in \mathcal{C} $ and $ B \in \mathcal{D} $.

---

### 14. **Kernels and Cokernels**

The **kernel** of a morphism $ f: A \to B $ is the monomorphism $ \ker(f): K \to A $ such that $ f \circ \ker(f) = 0 $. The **cokernel** of a morphism $ f: A \to B $ is the epimorphism $ \text{coker}(f): B \to C $ such that $ \text{coker}(f) \circ f = 0 $.

---

### 15. **Yoneda Lemma**

The **Yoneda Lemma** states that for any functor $ F: \mathcal{C} \to \text{Set} $ and any object $ A \in \mathcal{C} $, there is a natural isomorphism between the set of natural transformations:

$$
\text{Nat}(\text{Hom}(-, A), F) \cong F(A)
$$

---

### 16. **Limit of a Functor**

A **limit** of a functor $ F: \mathcal{C} \to \text{Set} $ is an object $ L $ along with a universal morphism from $ F $ to $ L $.

---

### 17. **Colimit of a Functor**

The **colimit** of a functor $ F: \mathcal{C} \to \text{Set} $ is an object $ C $ together with a universal morphism from $ C $ to $ F $.

---

### 18. **Commutative Diagrams**

A **commutative diagram** is a diagram where the composition of morphisms along any path from one object to another is the same, i.e., for every pair of paths in the diagram, the morphisms involved must satisfy the commutativity condition.

---

### 19. **Set Functors**

A **set functor** is a functor from a category $ \mathcal{C} $ to the category of sets, $ \text{Set} $. Set functors are often used to define various structures in category theory.

---

### 20. **Category of Categories**

The **category of categories** is a category where objects are categories and morphisms are functors between categories.

---

### 21. **Functor Category**

A **functor category** is a category whose objects are functors between two categories, and whose morphisms are natural transformations between these functors.

---

### 22. **Monoid in a Category**

A **monoid in a category** is an object $ M $ in a category $ \mathcal{C} $ with two morphisms: an associative multiplication $ \mu: M \times M \to M $ and an identity morphism $ e: I \to M $, satisfying the usual monoid laws.

---

### 23. **Preorders and Categories**

A **preorder** is a category where for any two objects $ A $ and $ B $, there is at most one morphism from $ A $ to $ B $, and the morphisms are reflexive and transitive.

---

### 24. **Groupoids**

A **groupoid** is a category in which every morphism is an isomorphism.

---

### 25. **Finite Limits and Colimits**

A category is said to have **finite limits** and **colimits** if the category has products, coproducts, and other finite limits and colimits.

---

### 26. **Subcategory**

A **subcategory** $ \mathcal{D} \subset \mathcal{C} $ of a category $ \mathcal{C} $ consists of a collection of objects and morphisms of $ \mathcal{C} $ that satisfy the conditions of a category.

---

### 27. **Fibration and Cofibration**

A **fibration** is a functor $ p: \mathcal{E} \to \mathcal{B} $ that satisfies the **lifting property**. A **cofibration** is the dual notion.

---

### 28. **Quotient Category**

The **quotient category** $ \mathcal{C}/\mathcal{D} $ is a category where the objects of $ \mathcal{C} $ are partitioned into equivalence classes determined by a subcategory $ \mathcal{D} $.

---

### 29. **Action of a Group on a Category**

A **group action** on a category is a functor $ G \times \mathcal{C} \to \mathcal{C} $, where $ G $ is a group and $ \mathcal{C} $ is a category, satisfying the group axioms.

---

### 30. **Category of Monoids**

The **category of monoids** is the category whose objects are monoids and whose morphisms are monoid homomorphisms.

---

### 31. **Topoi**

A **topos** is a category that satisfies certain conditions making it a generalization of the category of sets. It has all finite limits and is a cartesian closed category.

---

### 32. **Cartesian Closed Categories**

A **cartesian closed category** is a category in which the product of any two objects and the exponential object for any object exist and satisfy the adjunction:

$$
\text{Hom}(A \times B, C) \cong \text{Hom}(A, C^B)
$$

---

### 33. **Categories of Sheaves**

A **category of sheaves** is a category associated with a site (a category equipped with a Grothendieck topology) in which objects are sheaves on that site.

---

### 34. **Functorial Factorization**

The **functorial factorization** theorem provides a factorization of any morphism in a category as a composition of a monomorphism and an epimorphism.

---

### 35. **Cauchy Completion**

The **Cauchy completion** of a category is a construction that completes a category with respect to certain limits and colimits.

---

### 36. **Universal Property of the Product**

The **universal property of the product** states that for any pair of morphisms $ f: A \to C $ and $ g: B \to C $, there exists a unique morphism $ h: A \times B \to C $ such that:

$$
f = \pi_1 \circ h, \quad g = \pi_2 \circ h
$$

---

### 37. **Pushouts and Pullbacks**

**Pushouts** and **pullbacks** are categorical constructions that generalize the notions of coproducts and products in a way that fits with the gluing of objects and morphisms.

---

### 38. **Kan Extensions**

A **Kan extension** is a construction in category theory that generalizes the idea of extending functors along other functors.

---

### 39. **Adjunctions and Monads**

An **adjunction** between two functors often gives rise to a **monad**, which is a structure used in the theory of computations and category theory.

---

### 40. **Algebraic Categories**

An **algebraic category** is a category that is equivalent to the category of modules over a ring or algebra.

---

### 41. **Fibered Categories**

A **fibered category** is a category equipped with a functor to a base category that satisfies a certain lifting property.

---

### 42. **Grothendieck Topos**

A **Grothendieck topos** is a category that generalizes the category of sets and allows for a more flexible approach to sheaf theory.

---

### 43. **Stalks and Sheaf Theory**

A **stalk** is the value of a sheaf at a specific point in a space, which is used in sheaf theory to study local properties of a topological space.

---

### 44. **Slice Category**

A **slice category** is a category that is constructed by considering objects over a fixed object in another category, used for studying relative structures.

---

### 45. **Cocomplete Category**

A **cocomplete category** is a category that has all small colimits, meaning it has coproducts, coequalizers, and other colimits.

---

### 46. **Abelian Categories**

An **abelian category** is a category where morphisms can be composed, and where the kernel and cokernel of each morphism exist and satisfy the usual properties.

---

### 47. **Action Categories**

An **action category** is a category in which the objects have a group action, and the morphisms respect this group action.

---

### 48. **Monoid Actions on Categories**

A **monoid action on a category** is a structure where a monoid acts on the morphisms and objects of a category, following certain compatibility rules.

---

### 49. **Fibrations and Cofibrations in Topos Theory**

Fibrations and cofibrations are key concepts in topos theory that generalize the notion of a fibration in topology and the theory of fiber bundles.

---

### 50. **Categorical Logic**

**Categorical logic** is a branch of logic that applies category theory to the foundations of mathematics, formalizing logical systems using categorical constructions.
