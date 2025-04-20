# 30 Key Results in Formal Methods

## Foundational Concepts

1. **Turing Completeness**  
   A system is *Turing complete* if it can simulate any Turing machine.

2. **Church-Turing Thesis**  
   All effectively computable functions are computable by a Turing machine or lambda calculus.

3. **Gödel’s Incompleteness Theorems**  
   No consistent formal system can prove all truths about the arithmetic of natural numbers.

4. **Hoare Logic**  
   Introduced a formal system using triples:  
   $$ \{P\}~C~\{Q\} $$  
   Where $P$ is the precondition, $C$ the command, and $Q$ the postcondition.

5. **Dijkstra’s Weakest Precondition**  
   Given a postcondition $Q$ and command $C$, the weakest precondition $\text{wp}(C, Q)$ guarantees $Q$ holds after $C$ executes.

6. **Curry-Howard Correspondence**  
   Establishes an isomorphism between proofs and programs:  
   *Proofs ⟷ Programs*, *Propositions ⟷ Types*

7. **Denotational Semantics**  
   Defines programs by mathematical functions mapping inputs to outputs.

8. **Operational Semantics**  
   Describes how program statements change state step-by-step.

9. **Axiomatic Semantics**  
   Uses logical assertions to describe program behavior without specifying execution.

10. **Type Soundness Theorem**  
   If a program is well-typed, then it will not produce type errors at runtime.  
   (Preservation and Progress theorems)

---

## Program Verification Techniques

11. **Model Checking**  
   Exhaustively explores system state spaces to verify properties automatically.

12. **SAT Solving**  
   Determines satisfiability of propositional logic formulas.

13. **SMT Solving**  
   Extends SAT with background theories like arithmetic, arrays, and bit-vectors.

14. **Abstract Interpretation**  
   Over-approximates program behavior using abstract domains.

15. **Predicate Abstraction**  
   Reduces infinite-state programs to finite models via boolean abstraction.

16. **Symbolic Execution**  
   Executes programs on symbolic rather than concrete inputs to explore paths.

17. **Craig Interpolation**  
   Given $A \rightarrow B$, finds $I$ such that $A \rightarrow I$ and $I \rightarrow B$, with $I$ only using common symbols.

18. **IC3 / PDR Algorithm**  
   Incremental, property-directed algorithm for hardware/software safety proving.

19. **Refinement Calculus**  
   Supports derivation of correct programs by stepwise refinement from specifications.

20. **Compositional Verification**  
   Allows modular reasoning: verify parts of a system independently.

---

## Formal Specification & Tools

21. **Z Notation**  
   A specification language based on set theory and first-order logic.

22. **TLA+**  
   A logic for specifying concurrent and reactive systems.

23. **Alloy**  
   A declarative modeling language for lightweight formal analysis.

24. **Coq**  
   A proof assistant based on dependent type theory.

25. **Isabelle/HOL**  
   A generic proof assistant for higher-order logic.

26. **Lean Theorem Prover**  
   A formal proof system emphasizing mathematics and type theory.

27. **F\***  
   A language for program verification with support for effects and proofs.

28. **Agda**  
   A dependently typed language that is also a proof assistant.

29. **HOL4**  
   A theorem prover for higher-order logic, focused on industrial use.

30. **Why3**  
   A platform for deductive program verification, supporting multiple provers.