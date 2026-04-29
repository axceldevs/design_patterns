# Decorator pattern

## ¿Qué es el patrón?
Es un patrón estructural que permite añadir nuevas funcionalidades a un objeto de forma dinámica envolviéndolo en objetos decoradores, como alternativa más flexible a la herencia.

## ¿Qué nos permite hacer?
Nos permite agregar o quitar comportamientos a objetos individuales en tiempo de ejecución, combinando múltiples decoradores de forma apilada sin modificar la clase original.

## ¿Para qué es útil el patrón?
Es útil cuando se necesita extender el comportamiento de objetos sin recurrir a la herencia, cuando se quieren aplicar responsabilidades adicionales de forma opcional y combinable, o cuando extender por herencia resultaría en una explosión de subclases.

## Ventajas
- Extiende el comportamiento de objetos individuales en tiempo de ejecución sin modificar su clase.
- Permite combinar múltiples decoradores de forma apilada para obtener comportamientos compuestos.
- Es más flexible que la herencia: los comportamientos pueden activarse o desactivarse dinámicamente.
- Sigue el principio de responsabilidad única al repartir funcionalidades entre decoradores pequeños y enfocados.

## Desventajas
- Puede resultar difícil de depurar cuando hay muchos decoradores apilados.
- El orden en que se aplican los decoradores importa y puede ser fuente de errores.
- Genera muchos objetos pequeños que pueden dificultar la comprensión del diseño global.

## Casos de uso en vida real
- **Java I/O Streams**: `BufferedInputStream(new GZIPInputStream(new FileInputStream(file)))` apila decoradores para añadir buffering y descompresión a la lectura de un archivo.
- **Middlewares HTTP**: En frameworks como Express.js o Spring, los middlewares de logging, autenticación y compresión se apilan como decoradores sobre el manejador de la petición.
- **Personalización de bebidas en cafeterías**: El sistema de pedidos de Starbucks modela el café base con decoradores de leche, azúcar o sirope, calculando el precio total al final.
- **Pipelines de transformación de datos**: Sistemas ETL aplican decoradores de validación, normalización y enriquecimiento sobre los registros de datos antes de persistirlos.
