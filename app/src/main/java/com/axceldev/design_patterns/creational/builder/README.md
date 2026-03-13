# Builder pattern

## ¿Qué es el patrón?
Es un patrón creacional que separa la construcción de un objeto complejo de su representación, permitiendo que el mismo proceso de construcción pueda crear diferentes representaciones del objeto.

## ¿Qué nos permite hacer?
Nos permite construir objetos complejos paso a paso. Podemos producir distintos tipos y representaciones de un objeto usando el mismo código de construcción, evitando constructores con muchos parámetros.

## ¿Para qué es útil el patrón?
Es útil cuando la creación de un objeto requiere muchos pasos o configuraciones opcionales, y cuando se quiere evitar el "telescoping constructor" (constructores con múltiples parámetros). También es útil cuando se necesita construir distintas variantes del mismo tipo de objeto.
