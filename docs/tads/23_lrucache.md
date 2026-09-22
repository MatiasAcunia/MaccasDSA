# 23 — LRUCache

## Scope

Combinar mapa y lista doble: cache de tamaño acotado con política least recently used.

## Operations

get/put/remove/containsKey/size/capacity; contratos de actualización y expulsión.

## Invariants

cada entrada del mapa tiene un único nodo en lista; cabeza/cola reflejan recencia; tamaño <= capacidad.

## Verification

lectura cambia recencia; actualización; expulsión; capacidad uno y cero según contrato.

## Complexity

get/put O(1) esperado si mapa y enlaces O(1).
