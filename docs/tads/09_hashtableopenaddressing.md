# 09 — HashTableOpenAddressing

## Scope

Hash map con sondeo dentro del array.

## Operations

put(k,v); get(k); containsKey(k); remove(k); size.

## Invariants

estados empty/occupied/deleted; probing consistente; factor de carga.

## Verification

colisiones; borrado y búsqueda posterior; resize.

## Complexity

O(1) esperado bajo carga apropiada; peor O(n).
