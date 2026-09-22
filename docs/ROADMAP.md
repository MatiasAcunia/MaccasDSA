# Roadmap: alcance amplio y acotado

**Objetivo:** conocer, implementar y probar un conjunto sustancial de estructuras de datos en Java, incluyendo variantes con diferencias conceptuales reales. El alcance base propuesto es de **24 módulos**; no son 24 estructuras abstractas distintas: incluye TADs, representaciones concretas, un componente compuesto y algoritmos de grafos. Se puede ajustar explícitamente si la experiencia de los primeros módulos muestra otra prioridad. No se exige implementar cada variante conocida.

**Duración:** ~23 semanas como referencia personal; con 2–4 sesiones semanales y temas de dificultad desigual no hay equivalencia obligatoria de 1 módulo = 1 semana. Respetar dependencias y terminar cada módulo funcionalmente; no acelerar para completar un contador.

| Nº | Módulo | Foco distintivo |
|---:|---|---|
| 01 | [DynamicArray](tads/01_dynamicarray.md) | Capacidad, crecimiento, inserción y desplazamientos |
| 02 | [SinglyLinkedList](tads/02_singlylinkedlist.md) | Enlace next, cabeza y cola |
| 03 | [DoublyLinkedList](tads/03_doublylinkedlist.md) | prev/next y borrado bidireccional |
| 04 | [CircularLinkedList](tads/04_circularlinkedlist.md) | Cierre circular y recorrido con condición de parada |
| 05 | [Stack](tads/05_stack.md) | Contrato LIFO y representación elegida |
| 06 | [Queue](tads/06_queue.md) | Contrato FIFO y buffer circular o enlaces |
| 07 | [Deque](tads/07_deque.md) | Ambos extremos y reutilización de diseños previos |
| 08 | [HashTableChaining](tads/08_hashtablechaining.md) | Buckets, hash/equals, colisiones, carga y rehash |
| 09 | [HashTableOpenAddressing](tads/09_hashtableopenaddressing.md) | Sondeo, borrado/tombstones y load factor |
| 10 | [BinaryTree](tads/10_binarytree.md) | Árbol binario general sin invariante de orden |
| 11 | [BinarySearchTree](tads/11_binarysearchtree.md) | Orden, inserción, búsqueda, eliminación |
| 12 | [AVLTree](tads/12_avltree.md) | Alturas, rotaciones y balanceo |
| 13 | [BinaryHeap](tads/13_binaryheap.md) | PriorityQueue sobre array; heapify |
| 14 | [Graph](tads/14_graph.md) | Representación dirigida/no dirigida, BFS y DFS |
| 15 | [UnionFind](tads/15_unionfind.md) | Conectividad incremental y compresión de caminos |
| 16 | [Trie](tads/16_trie.md) | Prefijos, búsqueda y borrado de strings |
| 17 | [SegmentTree](tads/17_segmenttree.md) | Consultas y modificaciones de intervalos |
| 18 | [FenwickTree](tads/18_fenwicktree.md) | Sumas de prefijo y actualización eficiente |
| 19 | [RedBlackTree](tads/19_redblacktree.md) | Segundo enfoque de árbol balanceado; comparación con AVL |
| 20 | [BPlusTree](tads/20_bplustree.md) | Índice multinivel por páginas y consultas de rango |
| 21 | [SkipList](tads/21_skiplist.md) | Búsqueda ordenada probabilística con niveles |
| 22 | [BloomFilter](tads/22_bloomfilter.md) | Filtro de pertenencia aproximado y falsos positivos |
| 23 | [LRUCache](tads/23_lrucache.md) | Composición mapa + lista doble; política de expulsión |
| 24 | [GraphAlgorithms](tads/24_graphalgorithms.md) | Algoritmos sobre grafos ponderados: caminos y ordenación |

Los módulos 19–24 amplían el alcance anterior de 18: no sustituyen ni invalidan avances hechos en los primeros 18. Se incorporan porque ilustran decisiones realmente diferentes y tienen aplicaciones visibles en colecciones, cachés, motores de almacenamiento y procesamiento de grafos.

**Fuera del alcance base por ahora:** todas las variantes de listas circulares, todos los tipos de heap, cada árbol auto-balanceado, implementaciones concurrentes lock-free, árboles persistentes, B-tree además de B+ tree, tries comprimidos, sparse tables. Se pueden estudiar o añadir después con una razón concreta.

## Condición de cierre por módulo

Definir/aceptar contrato y errores; explicar representación e invariantes; implementar personalmente; probar casos normales, vacíos, bordes y secuencias; registrar complejidad observada/teórica con sus supuestos; hacer commits verificables y una nota de aprendizaje. No basta leer teoría, copiar código, compilar o pasar un ejemplo único.

El orden es orientativo, no una camisa de fuerza; pueden agruparse TADs sencillos o dedicar varias semanas a hashing/árboles si el aprendizaje lo exige. El asistente no adelanta soluciones ni transforma cada módulo en API pública antes de la fase 2.
