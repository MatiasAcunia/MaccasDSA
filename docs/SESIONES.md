# Protocolo de trabajo y autoría

Ritmo deseado: **2–4 sesiones por semana**, variable según clases, energía y dificultad; ~23 semanas es un horizonte orientativo, no un deadline. El estudiante implementa cada estructura y hace sus commits. El asistente define y revisa el alcance pedagógico/funcional, pero no desarrolla las soluciones por su cuenta.

## 1. Apertura del módulo — contrato compartido

El asistente presenta qué problema resuelve, cómo suele usarse y un **contrato base** de operaciones, sus resultados, precondiciones y fallos, además de una lista breve de casos borde y criterios para considerar el módulo terminado. El estudiante confirma o discute el alcance. Esto responde al QUÉ, sin imponer toda la representación ni dictar código. Si un TAD requiere una variante específica para no resultar trivial, se acuerda al inicio, no después de que el estudiante programe todo.

## 2. Teoría calibrada

El estudiante dice qué conoce del tema. Si es conocido (p. ej. lista simple), repaso breve y código enseguida. Si es nuevo (hash table, grafos, balanceo, B+ tree), dedicar una sesión o parte de ella a conceptos, diagrama de memoria, invariantes y operaciones; se puede mirar un video o una implementación explicada para entender, pero sin programar copiando el tutorial. La preparación puede tomar varias sesiones si hace falta: no hay obligación de teoría + implementación completa el mismo día.

## 3. Diseño propio

El estudiante propone representación interna y cómo se mantenerán las invariantes; dibuja un caso o explica pseudocódigo si ayuda. El asistente pregunta solo por restricciones materiales que faltan y señala tradeoffs, sin convertirlo en un examen interminable ni dictar la solución. Para estructuras nuevas, primero ofrecer pistas conceptuales suficientes.

## 4. Implementación y commits

El estudiante programa operaciones por bloques pequeños, ejecuta y depura. El asistente revisa fragmentos o commits, explica errores y da pistas escalonadas (pista conceptual → pseudocódigo parcial → solución explícita solo a pedido). No se exige recordar sintaxis de memoria; consultar documentación de Java o buscar un ejemplo aislado de sintaxis es válido. Cerrar el material explicativo antes de implementar la estructura completa evita copiar sin aprender.

Commits propios y frecuentes, por avance verificable; no exigir una cadencia artificial ni usar el número de commits como medida de aprendizaje.

## 5. Prueba, reflexión y cierre

Tests de contrato y de invariantes: vacío, un elemento, extremos, repetidos, ausencia, crecimiento, secuencias, interacción entre operaciones; los casos específicos se indican en cada ficha. Corregir fallos, documentar costos y tradeoffs, contrastar si la representación elegida resultó adecuada y registrar qué aprendió el estudiante. El asistente verifica, no declara completado por una sola ejecución. Actualizar [ESTADO](ESTADO.md) con fecha, resultado y commits del estudiante.

## Frontera fase 1 → fase 2

Durante la fase 1, código ordenado por módulo, tests y contratos claros; NO exigir todavía diseño perfecto para consumidores externos. Tras concluir el conjunto acordado, refactorizar como biblioteca coherente: API, genéricos, paquetes, interfaces, iteradores, documentación, tests y distribución. Conservar historia/commits de implementaciones originales.

## Cuando no hay energía para problemas difíciles

Una sesión puede ser solo teoría, diagramas, tests, leer y explicar un commit, o avanzar una función pequeña. No fabricar mini-retos ni hacer que cada día «cuente» como un módulo terminado.
