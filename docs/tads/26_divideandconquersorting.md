# 26 — DivideAndConquerSorting

## Scope

Implement Merge Sort, Quicksort and three-way Quicksort. Specify pivot selection and handling of duplicates.

## Operations

Provide distinct sorting operations over `int[]`; sort ascending. Merge Sort may allocate auxiliary memory; Quicksort and three-way Quicksort are in-place aside from recursion/stack. `null` raises `NullPointerException`.

## Invariants

All algorithms preserve the input multiset and yield a nondecreasing sequence. Merge sort must be stable. Quicksort stability is not guaranteed. Each partition recursively decreases its subproblem size.

## Verification

Empty/singleton; sorted/reversed; many duplicates and all-equal; random and adversarial pivot cases; long arrays; recursion termination; check merge stability using decorated records in generic variant.

## Complexity

Merge Sort: O(n log n) time, O(n) auxiliary space. Quicksort variants: expected O(n log n), worst O(n²); recursion-space bounds depend on implementation. Three-way partitioning handles duplicate-heavy inputs without repeatedly partitioning an equal range.
