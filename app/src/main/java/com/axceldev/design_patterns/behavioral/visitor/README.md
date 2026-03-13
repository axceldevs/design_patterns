# Visitor pattern

## ¿Qué es el patrón?
Es un patrón de comportamiento que permite separar algoritmos de los objetos sobre los que operan, definiendo una nueva operación sin cambiar las clases de los elementos sobre los que actúa.

## ¿Qué nos permite hacer?
Nos permite agregar nuevas operaciones a una jerarquía de clases existente sin modificarlas, encapsulando la lógica de cada operación en un objeto visitante separado.

## ¿Para qué es útil el patrón?
Es útil cuando se necesita realizar muchas operaciones distintas sobre una estructura de objetos sin contaminar sus clases con esa lógica, como en compiladores (análisis semántico, generación de código), árboles de expresiones, o exportadores de documentos a múltiples formatos.
