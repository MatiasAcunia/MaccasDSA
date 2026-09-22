# 23 — LRUCache

Estado: **pendiente**. Nueva incorporación al alcance amplio: las firmas concretas se acuerdan al iniciar el módulo, no es código para copiar.

## Qué aprender y para qué sirve
Combinar mapa y lista doble: cache de tamaño acotado con política least recently used.

## Contrato funcional inicial
get/put/remove/containsKey/size/capacity; contratos de actualización y expulsión.

## Invariantes/diseño a comprender
cada entrada del mapa tiene un único nodo en lista; cabeza/cola reflejan recencia; tamaño <= capacidad.

## Pruebas relevantes
lectura cambia recencia; actualización; expulsión; capacidad uno y cero según contrato.

## Complejidad a justificar
get/put O(1) esperado si mapa y enlaces O(1).

## Diario del estudiante
- [ ] Estudiar teoría / implementación explicada si es nueva.
- [ ] Acordar contrato, casos de error, representación e invariantes.
- [ ] Implementar operaciones y tests por cuenta propia.
- [ ] Registrar decisiones, dificultades y commits verificables.
