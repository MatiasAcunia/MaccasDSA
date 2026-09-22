# 21 — SkipList

Estado: **pendiente**. Nueva incorporación al alcance amplio: las firmas concretas se acuerdan al iniciar el módulo, no es código para copiar.

## Qué aprender y para qué sirve
Índice ordenado probabilístico con nodos de varios niveles.

## Contrato funcional inicial
put/get/remove/contains/inorder/size; generar alturas con semilla controlable para tests.

## Invariantes/diseño a comprender
cada nivel superior es subsecuencia ordenada del inferior.

## Pruebas relevantes
alturas distintas; duplicados; borrados y búsquedas; nivel máximo.

## Complejidad a justificar
O(log n) esperado; O(n) peor caso.

## Diario del estudiante
- [ ] Estudiar teoría / implementación explicada si es nueva.
- [ ] Acordar contrato, casos de error, representación e invariantes.
- [ ] Implementar operaciones y tests por cuenta propia.
- [ ] Registrar decisiones, dificultades y commits verificables.
