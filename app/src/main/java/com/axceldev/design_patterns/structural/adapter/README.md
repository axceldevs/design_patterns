# Adapter pattern

## ¿Qué es el patrón?
Es un patrón estructural que actúa como puente entre dos interfaces incompatibles, permitiendo que objetos con interfaces distintas colaboren entre sí sin modificar su código fuente.

## ¿Qué nos permite hacer?
Nos permite reutilizar clases existentes cuya interfaz no coincide con la que necesitamos, envolviéndolas en un adaptador que traduce las llamadas de una interfaz a otra.

## ¿Para qué es útil el patrón?
Es útil cuando se quiere integrar clases o librerías de terceros con una interfaz diferente a la esperada por el sistema, o cuando se necesita hacer que clases antiguas funcionen con código nuevo sin modificarlas.

## Ventajas
- Permite reutilizar clases existentes cuya interfaz no es compatible con el sistema, sin modificarlas.
- Desacopla el código cliente de los detalles de la clase adaptada.
- Facilita la integración de librerías de terceros o sistemas legacy con el código moderno.
- Sigue el principio de responsabilidad única al separar la lógica de conversión de interfaz en el adaptador.

## Desventajas
- Añade una capa adicional de indirección que puede dificultar la lectura del código.
- Si hay muchas adaptaciones necesarias, el sistema puede llenarse de adaptadores que ocultan problemas de diseño más profundos.
- En ocasiones es más sencillo reescribir la clase incompatible que crear un adaptador.

## Casos de uso en vida real
- **Integración de pasarelas de pago**: Un sistema integra Stripe, PayPal y MercadoPago usando adaptadores que exponen una interfaz de pago unificada, sin depender de sus APIs específicas.
- **Lectura de distintos formatos de archivo**: Una aplicación que espera datos en JSON adapta respuestas XML o CSV mediante adaptadores que convierten el formato al esperado.
- **Wrappers de APIs legacy**: Sistemas bancarios antiguos exponen SOAP; un adaptador convierte las llamadas REST del frontend en solicitudes SOAP compatibles.
- **Adaptadores de logging**: SLF4J actúa como adaptador que traduce las llamadas de logging de la aplicación a la implementación concreta (Log4j, Logback, java.util.logging).
