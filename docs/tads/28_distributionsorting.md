# 28 — DistributionSorting

## Scope

Implement Counting Sort, LSD Radix Sort and Bucket Sort for documented key domains. Distinguish integer-key sorting from comparison sorting.

## Operations

Counting Sort accepts integer arrays and a documented bounded key-range policy, including negative values via an offset. Radix Sort supports the full signed 32-bit integer domain and defines digit width/base. Bucket Sort accepts floating-point keys in a declared bounded interval with documented treatment of boundary values and invalid numbers. None may silently allocate memory proportional to an unrestricted numeric range.

## Invariants

Counting preserves multiplicities and respects the declared key range. LSD Radix relies on stable per-digit passes. Bucket membership and collection order yield globally sorted output.

## Verification

Empty/singleton; negatives; zero; duplicates; min/max signed integers; sparse/extreme key ranges; bucket boundary cases and skewed distributions; differential checks against reference sorting.

## Complexity

Counting: O(n+k) time/space where k is the key range. Radix: O(d(n+b)) for d digits and radix b; additional O(n+b) memory. Bucket Sort: expected linear under the declared distribution assumptions; worst case depends on in-bucket sorting.
