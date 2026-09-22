# 24 — GraphAlgorithms

Estado: **pendiente**. Nueva incorporación al alcance amplio: las firmas concretas se acuerdan al iniciar el módulo, no es código para copiar.

## Qué aprender y para qué sirve
Sobre Graph del módulo 14: caminos y orden en grafos dirigidos/ponderados.

## Contrato funcional inicial
topologicalSort; dijkstra; connectedComponents; elegir MST (Kruskal o Prim) al abrir.

## Invariantes/diseño a comprender
precondiciones explícitas: Dijkstra pesos no negativos; topológico solo DAG; uso correcto de visited/dist.

## Pruebas relevantes
inalcanzables; ciclos; pesos cero; múltiples rutas; grafo vacío; compare resultados básicos.

## Complejidad a justificar
BFS O(V+E); Dijkstra con heap O((V+E) log V); topológico O(V+E).

## Diario del estudiante
- [ ] Estudiar teoría / implementación explicada si es nueva.
- [ ] Acordar contrato, casos de error, representación e invariantes.
- [ ] Implementar operaciones y tests por cuenta propia.
- [ ] Registrar decisiones, dificultades y commits verificables.
