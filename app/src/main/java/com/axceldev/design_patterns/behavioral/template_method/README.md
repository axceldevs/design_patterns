# Template Method pattern

## ¿Qué es el patrón?
Es un patrón de comportamiento que define el esqueleto de un algoritmo en una clase base, dejando que las subclases implementen o sobreescriban pasos específicos del algoritmo sin cambiar su estructura general.

## ¿Qué nos permite hacer?
Nos permite reutilizar la estructura común de un algoritmo en la clase base, mientras que las subclases pueden personalizar ciertas partes del proceso sin duplicar el código común.

## ¿Para qué es útil el patrón?
Es útil cuando varios algoritmos comparten la misma estructura general pero difieren en algunos pasos concretos, como en procesos de importación/exportación de datos, generación de reportes, o pipelines de procesamiento donde los pasos varían según el tipo de datos.

## Ventajas
- Evita la duplicación de código al centralizar la estructura del algoritmo en la clase base.
- Las subclases solo necesitan implementar los pasos que varían, simplificando su desarrollo.
- El esqueleto del algoritmo está protegido frente a modificaciones accidentales en las subclases.
- Facilita la extensión del comportamiento mediante hooks opcionales que las subclases pueden sobreescribir.

## Desventajas
- Las subclases quedan atadas a la estructura definida en la clase base, limitando su flexibilidad.
- La inversión del control ("Hollywood Principle: don't call us, we'll call you") puede resultar confusa.
- Si el algoritmo tiene muchos pasos variables, la clase base puede volverse difícil de entender.

## Casos de uso en vida real
- **Frameworks de pruebas**: JUnit usa Template Method con `setUp()`, el método de test y `tearDown()` como pasos fijos del ciclo de vida.
- **Parsers de archivos**: Un parser define los pasos abrir, leer, procesar y cerrar; cada subclase implementa el procesamiento según el formato (CSV, JSON, XML).
- **Procesos ETL**: La estructura extraer-transformar-cargar es fija, pero cada fuente de datos implementa sus propias variantes de cada paso.
- **Generación de reportes**: El proceso de generar un reporte (obtener datos, formatear, exportar) es el mismo, pero varía según el formato de salida (PDF, Excel, HTML).
