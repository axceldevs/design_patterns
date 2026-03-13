# Template Method pattern

## ¿Qué es el patrón?
Es un patrón de comportamiento que define el esqueleto de un algoritmo en una clase base, dejando que las subclases implementen o sobreescriban pasos específicos del algoritmo sin cambiar su estructura general.

## ¿Qué nos permite hacer?
Nos permite reutilizar la estructura común de un algoritmo en la clase base, mientras que las subclases pueden personalizar ciertas partes del proceso sin duplicar el código común.

## ¿Para qué es útil el patrón?
Es útil cuando varios algoritmos comparten la misma estructura general pero difieren en algunos pasos concretos, como en procesos de importación/exportación de datos, generación de reportes, o pipelines de procesamiento donde los pasos varían según el tipo de datos.
