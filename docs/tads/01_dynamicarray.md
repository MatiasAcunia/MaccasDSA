# 01 — DynamicArray

Estado: **pendiente**. Tipo: estructura / implementación concreta.

## Qué aprender
Capacidad y desplazamientos.

## Contrato inicial (definir firmas exactas al abrir el módulo)
get(i); set(i,x); add(x); insert(i,x); removeAt(i); size(); capacity().

## Representación e invariantes
0 <= size <= capacity; elementos lógicos contiguos.

## Tests importantes
vacío; primer crecimiento; inserción y borrado cabeza/medio/cola.

## Costos a comprender
get O(1); add amortizado O(1); insert/remove O(n).

## Registro personal
- [ ] Teoría y un ejemplo visual entendidos.
- [ ] Contrato, bordes e invariantes definidos por el estudiante.
- [ ] Operaciones implementadas por el estudiante, sin copiar un tutorial completo.
- [ ] Tests y secuencias revisados; complejidad anotada.
- [ ] Código y evidencia de cierre presentes en GitHub.

Sesiones, decisiones, errores y commits:
