# 27 — HeapAndHybridSorting

## Scope

Implement Heap Sort, Introsort and TimSort as separate comparison-sorting algorithms. Introsort transitions from quicksort to heapsort at a recursion-depth limit and may use insertion sort for small partitions. TimSort detects runs and performs stable merges while preserving its run-stack invariants.

## Operations

Each algorithm sorts an `int[]` ascending; generic comparator-based versions may be added without changing the algorithm contracts. `null` raises `NullPointerException`. An implementation named TimSort must actually implement run detection, run extension, stack maintenance and merging; a plain run-aware merge sort is not interchangeable with TimSort.

## Invariants

Heap Sort preserves the heap property during extraction. Introsort bounds recursion with a depth-triggered fallback. TimSort preserves input order for equal elements.

## Verification

Empty/singleton; sorted/reverse and nearly sorted; duplicates; pathological quicksort partitions; varied run lengths and alternating runs; randomized differential tests; stability of TimSort with decorated records.

## Complexity

Heap Sort and Introsort: O(n log n) worst-case, with O(1) auxiliary heap storage for Heap Sort aside from method stack. TimSort: O(n log n) worst-case, O(n) temporary memory in typical array implementations; improved behavior on partially ordered inputs.
