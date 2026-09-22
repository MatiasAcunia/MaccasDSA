# 20 — BPlusTree

## Scope

Índice multinivel de páginas: hojas enlazadas y claves separadoras; relevancia en motores de almacenamiento.

## Operations

put/get/remove/range(from,to)/size; fijar orden mínimo antes de codificar.

## Invariants

todos los valores en hojas; balance por altura; ocupación mínima; separadores correctos.

## Verification

split de raíz/hojas; merge/redistribute; rango atravesando hojas.

## Complexity

altura O(log_B n), costes de E/S según tamaño de página; simplificado en memoria para aprendizaje.
