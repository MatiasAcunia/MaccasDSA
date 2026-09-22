# 22 — BloomFilter

Estado: **pendiente**. Nueva incorporación al alcance amplio: las firmas concretas se acuerdan al iniciar el módulo, no es código para copiar.

## Qué aprender y para qué sirve
Filtro probabilístico de pertenencia; no almacena ni recupera valores.

## Contrato funcional inicial
add(key)/mightContain(key)/bitSize/hashCount; sin remove en versión base.

## Invariantes/diseño a comprender
bits solo se encienden; no hay falsos negativos para keys insertadas si el hash es estable; puede haber falsos positivos.

## Pruebas relevantes
vacío; repetidos; claves distintas; medir falsos positivos empíricos.

## Complejidad a justificar
k hashes sobre m bits; tradeoff memoria/tasa de falsos positivos.

## Diario del estudiante
- [ ] Estudiar teoría / implementación explicada si es nueva.
- [ ] Acordar contrato, casos de error, representación e invariantes.
- [ ] Implementar operaciones y tests por cuenta propia.
- [ ] Registrar decisiones, dificultades y commits verificables.
