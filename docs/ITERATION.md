# Iteration contract

An iteration layer exposes logical elements without leaking node references, hash buckets, capacity slots, tree balancing metadata or internal index buffers.

## API

For collections with enumerable logical elements, provide `Iterable<E>` and `Iterator<E>` or an equivalent entry/element iterator for keyed structures. `iterator()` must return an independent iterator starting at the beginning; `hasNext()` does not advance; `next()` returns one element and raises `NoSuchElementException` after exhaustion. Specify whether `remove()` is unsupported or implemented with the standard iterator contract.

## Collection-specific order

| Structure | Iteration semantics |
|---|---|
| DynamicArray, singly/doubly/circular linked lists, Deque | Logical sequence order; circular traversal terminates after `size` elements. |
| Stack | LIFO order; traversal must not pop elements. |
| Queue | FIFO order; traversal must not dequeue elements. |
| Hash tables | Entry iteration in unspecified order; each stored key once; do not expose tombstones or empty buckets. |
| BinaryTree | Explicit traversal order (pre/in/post/level), with a documented default. |
| BST, AVL, RedBlackTree, BPlusTree, SkipList | Ascending key order; map variants yield key–value entries. |
| BinaryHeap | Unspecified heap-storage order; priority-ordered traversal requires a distinct sorted snapshot or destructive extraction method. |
| Graph | Vertex/edge iteration without duplicates as appropriate; BFS/DFS are separate traversal algorithms. |
| Trie | Enumeration of stored keys with a documented ordering. |
| LRUCache | Documented recency order, distinct from map bucket order. |
| UnionFind | Index/element iteration if the represented universe is enumerable; no general element iteration for connectivity alone. |
| SegmentTree, FenwickTree | Iterate original logical values if retained or reconstructable, never raw tree/index metadata. |
| BloomFilter | No element iterator: inserted keys cannot be reconstructed from its bitset. |

## Mutation semantics

Define iterator behavior when a collection is structurally modified after iterator creation. A fail-fast `modCount` approach is acceptable for mutable collections, but is not a concurrency guarantee. Snapshot-based and weakly-consistent iterators require separate explicit contracts.

## Acceptance

Verify empty, one-element and multi-element collections, repeated `hasNext`, exhaustion, independent iterators, order where specified, non-destructive iteration and mutation policy. Iteration support does not imply that indexed sorting or binary search is efficient.
