# Visitor pattern

## ¿Qué es el patrón?
Es un patrón de comportamiento que permite separar algoritmos de los objetos sobre los que operan, definiendo una nueva operación sin cambiar las clases de los elementos sobre los que actúa.

## ¿Qué nos permite hacer?
Nos permite agregar nuevas operaciones a una jerarquía de clases existente sin modificarlas, encapsulando la lógica de cada operación en un objeto visitante separado.

## ¿Para qué es útil el patrón?
Es útil cuando se necesita realizar muchas operaciones distintas sobre una estructura de objetos sin contaminar sus clases con esa lógica, como en compiladores (análisis semántico, generación de código), árboles de expresiones, o exportadores de documentos a múltiples formatos.

## Ventajas
- Permite agregar nuevas operaciones a una jerarquía de clases sin modificarla (principio abierto/cerrado).
- Agrupa operaciones relacionadas en un único visitante en lugar de dispersarlas en múltiples clases.
- Facilita acumular estado durante el recorrido de la estructura de objetos.
- Implementa double dispatch de forma explícita, permitiendo que el comportamiento dependa tanto del visitante como del elemento visitado.

## Desventajas
- Agregar nuevos tipos de elementos a la jerarquía requiere modificar todos los visitantes existentes.
- Puede violar el encapsulamiento si los elementos deben exponer su estado interno para que el visitante los procese.
- Puede resultar difícil de entender debido al mecanismo de double dispatch.

## Casos de uso en vida real
- **Compiladores e intérpretes**: El árbol de sintaxis abstracta (AST) es recorrido por visitantes para análisis semántico, optimización y generación de código.
- **Exportación de documentos**: Un documento con distintos tipos de elementos (párrafos, imágenes, tablas) puede exportarse a PDF, HTML o Markdown mediante visitantes específicos.
- **Análisis de código estático**: Herramientas como SonarQube recorren el AST del código fuente con visitantes que detectan diferentes tipos de problemas.
- **Cálculo de impuestos**: Una jerarquía de productos (electrónicos, alimentos, ropa) aplica distintas reglas de impuestos mediante un visitante fiscal.
