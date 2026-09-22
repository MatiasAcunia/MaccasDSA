# Algorithm applicability

Sorting and searching algorithms expose contracts based on the capabilities of their inputs. A structure does not acquire an algorithm merely because it is iterable.

## Random-access sequences

`int[]`, `DynamicArray` and other indexed mutable sequences support in-place comparison sorting: bubble, selection, insertion, Shell, quicksort, heapsort, introsort. Merge sort and TimSort may require auxiliary storage. Counting and radix require compatible integer keys; bucket sort requires a defined key domain and distribution.

A generic `Comparator<T>` adaptation for sortable object sequences belongs to the collection-library integration layer. Algorithms are first specified on concrete input types by their modules.

## Linked sequences

Singly and doubly linked lists support linear search, insertion sort and merge sort without requiring indexed access. Index-based binary search, Shell sort, heap sort and conventional array-based quicksort must not be advertised as efficient linked-list operations: repeated indexed access changes their complexity. For such algorithms a documented copy-to-array/sort/rebuild adapter is permitted, with its allocation and copy costs included.

Circular linked lists require iteration bounded by logical size; traversal must not depend on reaching `null`.

## Ordered representations

Binary search, bounds, exponential and jump search require a sorted sequence; binary search additionally requires efficient indexed access to achieve O(log n). Interpolation search requires numeric ordered keys and makes distribution-dependent performance assumptions. Binary search trees, AVL/Red–Black trees, B+ trees, skip lists and tries expose their own search operations, not a second array-based binary search layered over iterators.

Heap storage is partially ordered, not a sorted sequence. Iterating a heap does not imply priority order. Repeated extraction or copying produces sorted output with a separate cost.

## Unordered and specialized representations

Hash tables support key-based lookup with hash/equals, not binary search or meaningful in-place key sorting. A sorted snapshot of entries requires collecting and sorting those entries. Graph searching/traversal (BFS, DFS, paths) is distinct from searching a sorted sequence. Union-Find answers connectivity queries; BloomFilter answers approximate membership and cannot enumerate inserted keys. SegmentTree and FenwickTree answer aggregate/range queries; they do not provide general sorted search over their internal arrays.

## Verification

Compare each algorithm with `Arrays.sort` or a trusted reference on supported inputs, retaining independent implementation of the algorithm. Test empty/singleton sequences, duplicates, negatives where supported, ascending/descending inputs, boundary indices, missing keys and comparator consistency. Stability is checked only for algorithms specified as stable.
