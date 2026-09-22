# 30 — StringSearching

## Scope

Implement naive substring search, Knuth–Morris–Pratt, Rabin–Karp and Boyer–Moore for Java strings. Boyer–Moore must specify its bad-character/good-suffix strategies; a one-heuristic simplification must be named accordingly.

## Operations

Each operation accepts text and pattern and returns the index of the first occurrence or -1. Define empty pattern as a match at index 0. `null` inputs raise `NullPointerException`. State whether operations use UTF-16 code units or Unicode code points; all four implementations must share the chosen matching semantics.

## Invariants

Returned indices identify exact matches with no false positives. Rabin–Karp validates character equality after any hash match; KMP failure links preserve the already-matched prefix invariant.

## Verification

Empty text/pattern; full match, missing match, overlapping occurrences, repeated-character adversarial cases, Unicode/surrogate-pair cases under specified semantics, hash collisions for Rabin–Karp, compare with `String.indexOf` under identical semantics.

## Complexity

Naive: O(nm) worst case. KMP: O(n+m) preprocessing and search. Rabin–Karp: expected O(n+m) with rolling hash, O(nm) worst-case collision verification. Boyer–Moore: preprocessing and search costs depend on implemented heuristics and alphabet.
