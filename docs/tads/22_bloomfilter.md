# 22 — BloomFilter

## Scope

Filtro probabilístico de pertenencia; no almacena ni recupera valores.

## Operations

add(key)/mightContain(key)/bitSize/hashCount; sin remove en versión base.

## Invariants

bits solo se encienden; no hay falsos negativos para keys insertadas si el hash es estable; puede haber falsos positivos.

## Verification

vacío; repetidos; claves distintas; medir falsos positivos empíricos.

## Complexity

k hashes sobre m bits; tradeoff memoria/tasa de falsos positivos.
