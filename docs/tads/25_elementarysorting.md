# 25 — ElementarySorting

## Scope

Implement Bubble Sort, Selection Sort, Insertion Sort and Shell Sort over mutable integer arrays. Include early-exit optimization for bubble sort and document the chosen Shell gap sequence.

## Operations

For each algorithm expose a sorting operation accepting an `int[]`. Sort in ascending order in place. A `null` input raises `NullPointerException`. Zero/one-element arrays remain unchanged. No library sorting method may be used to implement the algorithm.

## Invariants

The output is a nondecreasing permutation of the input. Insertion and bubble sort preserve the relative order of equal keys; selection and Shell sort have no stability guarantee.

## Verification

Empty/singleton; sorted and reverse-sorted; equal keys; duplicates; negative values; extreme int values; randomized arrays compared with a reference result.

## Complexity

Bubble, selection and insertion: O(n²) worst case. Bubble and insertion: O(n) best case with respective optimizations. Shell: bounds depend on chosen gap sequence. Auxiliary space: O(1).
