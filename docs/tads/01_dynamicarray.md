# 01 — DynamicArray

## Scope

Resizable contiguous sequence with indexed access and automatic capacity management.

## Operations

- `size()`: number of stored elements.
- `isEmpty()`: whether the sequence has zero elements.
- `get(index)`: return the element at a valid index.
- `set(index, value)`: replace the element at a valid index.
- `add(value)`: append.
- `insert(index, value)`: insert before the specified index, preserving order.
- `removeAt(index)`: remove the indexed element, preserving order.
- `clear()`: remove all logical elements.
- `capacity()`: report allocated element capacity.

Valid access/removal indices satisfy `0 <= index < size`; valid insertion indices satisfy `0 <= index <= size`. Invalid indices raise `IndexOutOfBoundsException`. Capacity expansion preserves existing values and order. The first version may use `int[]`; exact types and return values are defined in the module contract before coding.

## Invariants

`0 <= size <= capacity`; logical elements occupy `[0, size)` contiguously.

## Verification

Empty and singleton sequences; bounds errors; first and successive expansions; insert/remove at front, middle and end; mixed operations; clear and refill; preservation of order.

## Complexity

`get`, `set`, `size`: O(1). `add`: amortized O(1) under geometric expansion. `insert` and `removeAt`: O(n).
