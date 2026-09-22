# 21 — SkipList

## Scope

Índice ordenado probabilístico con nodos de varios niveles.

## Operations

put/get/remove/contains/inorder/size; generar alturas con semilla controlable para tests.

## Invariants

cada nivel superior es subsecuencia ordenada del inferior.

## Verification

alturas distintas; duplicados; borrados y búsquedas; nivel máximo.

## Complexity

O(log n) esperado; O(n) peor caso.
