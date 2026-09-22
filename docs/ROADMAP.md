# Alcance inicial: 18 módulos

Las fichas incluyen TADs (Stack, Queue, Deque), implementaciones concretas (listas, hash tables, árboles) y técnicas de consulta (árboles de rango). No son 18 TADs abstractos distintos.

| Nº | Estructura o TAD | Objetivo |
|---:|---|---|
| 01 | [DynamicArray](tads/01_dynamicarray.md) | Capacidad y desplazamientos |
| 02 | [SinglyLinkedList](tads/02_singlylinkedlist.md) | Nodos y enlace next |
| 03 | [DoublyLinkedList](tads/03_doublylinkedlist.md) | Enlaces prev y next |
| 04 | [CircularLinkedList](tads/04_circularlinkedlist.md) | Lista simplemente circular; doble circular como ampliación |
| 05 | [Stack](tads/05_stack.md) | TAD LIFO sobre array o lista |
| 06 | [Queue](tads/06_queue.md) | TAD FIFO; buffer circular o lista |
| 07 | [Deque](tads/07_deque.md) | TAD de doble extremo |
| 08 | [HashTableChaining](tads/08_hashtablechaining.md) | Hash map con buckets y listas de colisiones |
| 09 | [HashTableOpenAddressing](tads/09_hashtableopenaddressing.md) | Hash map con sondeo dentro del array |
| 10 | [BinaryTree](tads/10_binarytree.md) | Árbol binario general SIN orden BST |
| 11 | [BinarySearchTree](tads/11_binarysearchtree.md) | Árbol de búsqueda no balanceado |
| 12 | [AVLTree](tads/12_avltree.md) | BST con alturas y rotaciones de balanceo |
| 13 | [BinaryHeap](tads/13_binaryheap.md) | Priority Queue con heap binario sobre array |
| 14 | [Graph](tads/14_graph.md) | Grafo: lista de adyacencia y matriz; BFS/DFS |
| 15 | [UnionFind](tads/15_unionfind.md) | Conjuntos disjuntos con compresión de caminos |
| 16 | [Trie](tads/16_trie.md) | Strings organizados por prefijos |
| 17 | [SegmentTree](tads/17_segmenttree.md) | Consultas y actualizaciones de rangos |
| 18 | [FenwickTree](tads/18_fenwicktree.md) | Suma prefijo mediante binary indexed tree |

**Variantes incluidas:** lista simple, doble y circular; hash table chaining y open addressing; árbol binario general (sin orden), BST y AVL. BinaryHeap no es BST. Para grafo, comparar lista de adyacencia/matriz e implementar BFS/DFS; como extensión posterior, grafos ponderados y caminos mínimos.

**Extensiones posteriores, fuera del cierre:** Red-Black, B/B+ Tree, Skip List, Bloom Filter, sparse table, estructuras concurrentes y persistentes. No convertir «aprender todo DSA» en un objetivo imposible de cerrar. La fase 2 arranca al cerrar estos 18 módulos, salvo que el estudiante cambie explícitamente el alcance.

## Regla de cierre
Cada módulo: contrato operativo, representación/invariantes, implementación personal, tests normales/de borde y secuencias, análisis honesto de costos y commit(s) verificables. No confundir leer sobre la estructura con tenerla implementada.
