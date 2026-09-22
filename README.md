# MaccasDSA

Proyecto personal de larga duración en **Java** para aprender estructuras de datos y algoritmos desde su representación interna hasta su uso y, finalmente, convertir las implementaciones en una librería reutilizable. El estudiante escribe el código, toma decisiones y realiza commits incrementales.

No es una carrera de ejercicios ni una colección de implementaciones copiadas. Tampoco debe quedar reducido a ejemplos triviales: incluye estructuras de uso general, variantes con tradeoffs distintos y algunas aplicaciones de ingeniería reales.

## Dos fases separadas

**Fase 1 — aprender y construir.** Desarrollar cada módulo de [ROADMAP](docs/ROADMAP.md) con una especificación funcional, teoría ajustada al nivel previo, diseño, implementación propia, tests, análisis y registro de decisiones. Son implementaciones de estudio con código organizado y testeable; no se exige desde ya el contrato definitivo de una API pública.

**Fase 2 — convertir el conjunto en una librería.** Después de completar el alcance base acordado, revisar integración, API, genéricos, errores, iteración, documentación, tests compartidos y empaquetado. Reutilizar y refactorizar lo ya construido, no empezar de cero. Ver [FASE_2_LIBRERIA](docs/FASE_2_LIBRERIA.md).

TAD es el contrato abstracto de operaciones/comportamiento (p. ej., Stack); estructura es una representación concreta (p. ej., linked list). El roadmap incluye tanto TADs como implementaciones y un módulo de algoritmos sobre grafos.

## Propiedad del trabajo

El asistente prepara una propuesta acotada por módulo de **qué** debe ofrecer, qué casos cubrir y qué propiedades demostrar. El estudiante la puede ajustar/aceptar y decide **cómo** representar y programar; el asistente revisa, explica, da pistas graduales y corrige sin sustituir la implementación. Soluciones enteras solo si el estudiante las pide explícitamente.

El progreso real queda en los commits y en [ESTADO](docs/ESTADO.md). Trabajo en ~2–4 sesiones por semana, flexible. Una estructura compleja puede ocupar varias semanas. Un horizonte de ~23 semanas es una referencia inicial, **no** una fecha límite ni una obligación de terminar un módulo por semana.

[Protocolo de sesiones](docs/SESIONES.md) · [Alcance y dependencias](docs/ROADMAP.md) · [Ficha ejemplo: DynamicArray](docs/tads/01_dynamicarray.md).

Stack: Java 21 + Maven + JUnit 5. No se han implementado módulos por el asistente; compilar un proyecto vacío no constituye evidencia de avance.
