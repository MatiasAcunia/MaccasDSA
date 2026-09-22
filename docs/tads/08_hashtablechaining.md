# 08 — HashTableChaining

## Scope

Hash map con buckets y listas de colisiones.

## Operations

put(k,v); get(k); containsKey(k); remove(k); size.

## Invariants

cada key aparece una vez; hash/equals consistentes; tamaño correcto.

## Verification

colisiones; actualización; ausencia; borrar cadena; rehash.

## Complexity

O(1) esperado con hash/carga razonables; peor O(n).
