# 29 — SequenceSearching

## Scope

Implement Linear Search, Binary Search, Lower Bound, Upper Bound, Exponential Search, Jump Search and Interpolation Search. State exact input preconditions and result semantics for duplicates.

## Operations

Operations accept an `int[]` and query key. Linear Search returns the first matching index or -1 on any array. The other algorithms require nondecreasing input; Binary Search returns any matching index or -1; Lower Bound returns the first index whose value is >= key; Upper Bound returns the first index whose value is > key. Exponential/Jump/Interpolation return a matching index or -1. A `null` array raises `NullPointerException`. Binary Search, bounds, Exponential and Jump do not accept unsorted arrays as a supported input.

## Invariants

The range narrowed by each ordered search always contains every still-possible matching position. Boundary calculations are overflow-safe. Interpolation avoids division by zero on equal endpoints and handles overflow in arithmetic.

## Verification

Empty/singleton; absent key before/after range; duplicate blocks; negative/extreme int values; large arrays; sorted/reversed preconditions; compare bounds against a simple reference implementation.

## Complexity

Linear: O(n). Binary/bounds: O(log n) on indexed sorted arrays. Exponential: O(log i) to an index i near the first occurrence. Jump: O(sqrt n) with sqrt(n) block size. Interpolation: expected O(log log n) only under near-uniform numeric distributions; worst O(n).
