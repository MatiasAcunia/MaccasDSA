# Fase 2 — de implementaciones de estudio a biblioteca Java

**Inicio:** después de cerrar el alcance base de [ROADMAP](ROADMAP.md) (actualmente 24 módulos), o tras una decisión explícita de ajustar ese alcance. No asumir que el número inicial es una restricción irrevocable.

Objetivo: transformar las implementaciones ya hechas en una librería que otra persona pueda utilizar sin conocer su representación interna. Preservar código funcional, tests e historia de commits; no reescribir todo por reflejo.

Trabajo de integración: APIs e interfaces consistentes donde tenga sentido; `<E>`, `<K,V>` y comparadores; contratos de null/duplicados/keys mutables; excepciones y límites; encapsulación, iteración, documentación de complejidad; tests de conformidad; Maven/JAR y ejemplos. Distinguir contrato TAD de representación. No esconder artificialmente diferencias reales entre estructuras.

**Evidencia de cierre de la biblioteca:** build reproducible, tests de cada módulo y de integración, ejemplos de uso desde otro paquete, README para un usuario externo y una versión identificable. Publicar un paquete/artefacto es opcional.
