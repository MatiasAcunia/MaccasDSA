# 24 — GraphAlgorithms

## Scope

Sobre Graph del módulo 14: caminos y orden en grafos dirigidos/ponderados.

## Operations

topologicalSort; dijkstra; connectedComponents; minimumSpanningTree.

## Invariants

precondiciones explícitas: Dijkstra pesos no negativos; topológico solo DAG; uso correcto de visited/dist.

## Verification

inalcanzables; ciclos; pesos cero; múltiples rutas; grafo vacío; compare resultados básicos.

## Complexity

BFS O(V+E); Dijkstra con heap O((V+E) log V); topológico O(V+E).
