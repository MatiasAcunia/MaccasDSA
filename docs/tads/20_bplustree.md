# 20 — BPlusTree

Estado: **pendiente**. Nueva incorporación al alcance amplio: las firmas concretas se acuerdan al iniciar el módulo, no es código para copiar.

## Qué aprender y para qué sirve
Índice multinivel de páginas: hojas enlazadas y claves separadoras; relevancia en motores de almacenamiento.

## Contrato funcional inicial
put/get/remove/range(from,to)/size; fijar orden mínimo antes de codificar.

## Invariantes/diseño a comprender
todos los valores en hojas; balance por altura; ocupación mínima; separadores correctos.

## Pruebas relevantes
split de raíz/hojas; merge/redistribute; rango atravesando hojas.

## Complejidad a justificar
altura O(log_B n), costes de E/S según tamaño de página; simplificado en memoria para aprendizaje.

## Diario del estudiante
- [ ] Estudiar teoría / implementación explicada si es nueva.
- [ ] Acordar contrato, casos de error, representación e invariantes.
- [ ] Implementar operaciones y tests por cuenta propia.
- [ ] Registrar decisiones, dificultades y commits verificables.
