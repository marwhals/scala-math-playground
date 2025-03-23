# 50 Most Important Concepts in Galois Theory

1. **Field Extension**
    - A field $ E $ is an extension of a field $ F $ if $ F \subseteq E $.
      $$
      E/F \quad \text{(read as "E is a field extension of F")}
      $$

2. **Degree of a Field Extension**
    - The degree of a field extension $ E/F $ is the dimension of $ E $ as a vector space over $ F $.
      $$
      [E : F] = \dim_F E
      $$

3. **Subfields**
    - A subfield of a field extension $ E/F $ is a field $ K \subseteq E $ such that $ F \subseteq K \subseteq E $.

4. **Algebraic Extension**
    - A field extension $ E/F $ is algebraic if every element of $ E $ is algebraic over $ F $, i.e., it is the root of some non-zero polynomial with coefficients in $ F $.

5. **Transcendental Extension**
    - A field extension $ E/F $ is transcendental if at least one element of $ E $ is transcendental over $ F $ (i.e., not the root of any non-zero polynomial in $ F $).

6. **Algebraic Closure**
    - The algebraic closure of a field $ F $ is the smallest algebraic extension of $ F $ that contains all algebraic elements over $ F $.

7. **Minimal Polynomial**
    - For an element $ \alpha \in E $, the minimal polynomial of $ \alpha $ over $ F $ is the monic polynomial of smallest degree in $ F[x] $ that has $ \alpha $ as a root.

8. **Galois Group**
    - The Galois group of a field extension $ E/F $, denoted $ \text{Gal}(E/F) $, is the group of automorphisms of $ E $ that fix every element of $ F $.
      $$
      \text{Gal}(E/F) = \{ \sigma : E \to E \mid \sigma(a) = a \text{ for all } a \in F \}
      $$

9. **Automorphism**
    - An automorphism of a field $ E $ is a bijective map $ \sigma : E \to E $ that preserves addition and multiplication.

10. **Galois Correspondence**
    - A one-to-one correspondence between the intermediate fields of a field extension $ E/F $ and the subgroups of the Galois group $ \text{Gal}(E/F) $.

11. **Normal Extension**
    - A field extension $ E/F $ is normal if it contains all the roots of any polynomial in $ F[x] $ that has at least one root in $ E $.

12. **Separable Extension**
    - A field extension $ E/F $ is separable if for every element $ \alpha \in E $, the minimal polynomial of $ \alpha $ over $ F $ is separable, i.e., has no repeated roots.

13. **Galois Extension**
    - A field extension $ E/F $ is Galois if it is both normal and separable.

14. **Fundamental Theorem of Galois Theory**
    - For a Galois extension $ E/F $, there is a one-to-one correspondence between the subfields of $ E $ that contain $ F $ and the subgroups of the Galois group $ \text{Gal}(E/F) $.

15. **Fixed Field**
    - The fixed field of a group $ G \subseteq \text{Gal}(E/F) $ is the set of elements in $ E $ that are fixed by every automorphism in $ G $.
      $$
      E^G = \{ e \in E \mid \sigma(e) = e \text{ for all } \sigma \in G \}
      $$

16. **Galois Closure**
    - The Galois closure of a field extension $ E/F $ is the smallest Galois extension of $ F $ that contains $ E $.

17. **Galois Group of a Polynomial**
    - The Galois group of a polynomial $ f(x) $ over $ F $ is the Galois group of its splitting field over $ F $.

18. **Splitting Field**
    - The splitting field of a polynomial $ f(x) $ over $ F $ is the smallest field extension of $ F $ in which $ f(x) $ factors completely into linear factors.

19. **Cyclotomic Extension**
    - A cyclotomic extension is a field extension obtained by adjoining a root of unity, i.e., a root of a polynomial of the form $ x^n - 1 $.

20. **Radical Extension**
    - A radical extension is a field extension formed by adjoining roots of elements of the field, often used in solving polynomial equations by radicals.

21. **Finite Field Extensions**
    - A field extension $ E/F $ is finite if the degree $ [E : F] $ is finite.

22. **Infinite Field Extensions**
    - A field extension $ E/F $ is infinite if the degree $ [E : F] $ is infinite.

23. **Characterization of Separable Extensions**
    - A finite field extension $ E/F $ is separable if and only if the polynomial whose roots generate the extension has distinct roots.

24. **Galois Group of a Simple Extension**
    - If $ E = F(\alpha) $ for some algebraic element $ \alpha $, the Galois group $ \text{Gal}(E/F) $ consists of automorphisms of $ E $ that permute the roots of the minimal polynomial of $ \alpha $.

25. **Solvability of Polynomials**
    - A polynomial is solvable by radicals if its Galois group is a solvable group, meaning that the Galois group can be derived from its abelian subgroups.

26. **Solvable Group**
    - A group $ G $ is solvable if it has a finite series of subgroups where each quotient group is abelian.

27. **Transitive Extension**
    - An extension $ E/F $ is transitive if for any two elements $ \alpha, \beta \in E $, there exists an automorphism of $ E $ that sends $ \alpha $ to $ \beta $.

28. **Insolvability of Quintic Equations**
    - The quintic equation (degree 5) cannot be solved by radicals in general because its Galois group is not solvable.

29. **Kummer’s Theory**
    - A method in Galois theory used to solve radical equations involving roots of unity.

30. **Automorphism Group**
    - The automorphism group of a field is the set of all automorphisms of that field.

31. **Monodromy Group**
    - A group that describes how solutions to a differential equation behave when analytic continuation is performed along paths in the complex plane.

32. **Inclusion of Fields**
    - If $ E/F $ is a Galois extension, the intermediate fields between $ E $ and $ F $ correspond to certain subgroups of $ \text{Gal}(E/F) $.

33. **Minimal Galois Group**
    - The minimal Galois group of an extension is the smallest possible Galois group that can describe the extension.

34. **Algebraic Closure of Finite Fields**
    - The algebraic closure of a finite field is an infinite field that contains all roots of polynomials over the finite field.

35. **Radical Extension of Fields**
    - An extension formed by adjoining radicals, such as square roots, cube roots, etc., of elements in the base field.

36. **The Artin-Schreier Theorem**
    - A theorem that characterizes finite separable extensions of characteristic $ p $ fields.

37. **Solvable Galois Groups**
    - Galois groups that are solvable, meaning they can be decomposed into a series of subgroups that have abelian quotients.

38. **Picard-Vessiot Theory**
    - A theory used to study linear differential equations using Galois theory, connecting the theory of differential equations with algebraic geometry.

39. **Galois Connection**
    - A general mathematical relationship between two partially ordered sets, commonly used in the study of Galois theory and field extensions.

40. **Normal Closure**
    - The normal closure of a field extension $ E/F $ is the smallest normal extension of $ F $ containing $ E $.

41. **Topological Galois Group**
    - An extension of Galois theory to the context of topology, examining automorphisms in topological spaces.

42. **Automorphism of Field Extensions**
    - An automorphism of a field extension is a map that is a field homomorphism and fixes the base field.

43. **Jacques Herbrand’s Theorem**
    - A theorem used in algebraic Galois theory that links Galois groups and number theory.

44. **Galois Representation**
    - A homomorphism from the Galois group of an extension to a linear group, which encodes information about the field extension.

45. **Abelian Galois Theory**
    - A branch of Galois theory dealing with abelian extensions, where the Galois group is abelian.

46. **The Kronecker-Weber Theorem**
    - A theorem stating that every finite abelian extension of the rationals is contained in a cyclotomic field.

47. **Fixed Points of Automorphisms**
    - The set of elements in the field that remain unchanged by an automorphism, also called the fixed field.

48. **Artin’s Reciprocity Law**
    - A central result in class field theory, providing a deep link between field extensions and Galois groups.

49. **Fermat’s Last Theorem and Galois Theory**
    - The link between Galois theory and the proof of Fermat’s Last Theorem, particularly in the study of the modularity of elliptic curves.

50. **Differential Galois Theory**
    - The study of differential equations using Galois theory, which involves looking at the symmetries of the solutions to differential equations.
