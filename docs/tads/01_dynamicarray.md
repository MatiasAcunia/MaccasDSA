# 01 — DynamicArray

Estado: **pendiente**. Primer módulo; la ficha define el **QUÉ**, no contiene una solución.

## Propósito
Colección contigua redimensionable: practicar índices, capacidad distinta de tamaño, desplazamientos, crecimiento geométrico y coste amortizado.

## Propuesta de contrato para aprobar con el estudiante al iniciar
Primera implementación en Java sobre `int[]` o `Object[]`/genérica **a decidir juntos antes de programar**, según el valor pedagógico y su familiaridad con referencias/genéricos. No cambiar el tipo a mitad de módulo sin razón.

Operaciones de la primera versión: `size()`, `isEmpty()`, `get(index)`, `set(index, value)`, `add(value)`, `insert(index, value)`, `removeAt(index)`, `clear()`. `capacity()` queda disponible para inspección didáctica; los detalles exactos de tipos de retorno y de excepciones se acuerdan en apertura. `ensureCapacity`/shrink-to-fit quedan como ampliaciones opcionales; el módulo base sí incluye crecimiento automático.

## Comportamiento y tests que importan
Acceso por índice no altera el tamaño; insertar conserva orden desplazando elementos; remover devuelve/identifica el elemento retirado y cierra el hueco; `size` nunca supera `capacity`; índices fuera de rango fallan de forma definida; append con capacidad llena crece sin perder valores. Probar vacío, un elemento, primer crecimiento, insertar/borrar en cabeza/medio/cola y combinaciones de operaciones.

## Invariantes que el estudiante debe poder explicar
Los elementos lógicos ocupan índices `[0, size)`; `capacity` corresponde al almacenamiento asignado; `0 <= size <= capacity`. Acceso indexado O(1), desplazamientos O(n), append amortizado O(1) con crecimiento geométrico.

## Evidencia
- [ ] Contrato y decisiones de tipo definidos con el estudiante.
- [ ] Representación/crecimiento explicados por el estudiante.
- [ ] Implementación y tests escritos por el estudiante.
- [ ] Bugs/decisiones y commits propios registrados.
- [ ] Módulo verificado y cerrado; no trasladar todavía a API pública.
