# Chain of responsibility pattern

![image_chain_responsibility_pattern.png](../../../../../../resources/images/image_chain_responsibility_pattern.png)

## ¿Qué es el patrón?
Es un patrón de comportamiento que permite pasar solicitudes a lo largo de una cadena de manejadores, donde cada uno decide si procesa la solicitud o la pasa al siguiente manejador de la cadena.

## ¿Qué nos permite hacer?
Nos permite desacoplar al emisor de una solicitud de sus receptores, dando a múltiples objetos la oportunidad de manejar la solicitud sin que el emisor sepa cuál de ellos lo hará finalmente.

## ¿Para qué es útil el patrón?
Es útil cuando más de un objeto puede manejar una solicitud y el manejador no se conoce a priori, cuando se quiere emitir una solicitud a varios objetos sin especificar explícitamente el receptor, o para implementar pipelines de procesamiento como middlewares, filtros o validaciones encadenadas.

## Ventajas
- Desacopla al emisor de la solicitud de sus receptores, reduciendo dependencias directas.
- Permite agregar, quitar o reordenar manejadores sin modificar el código cliente ni los demás manejadores.
- Cada manejador tiene una única responsabilidad, siguiendo el principio SRP.
- Facilita la composición dinámica de pipelines de procesamiento en tiempo de ejecución.

## Desventajas
- No hay garantía de que la solicitud sea procesada si ningún manejador la acepta.
- Puede ser difícil depurar y rastrear el flujo cuando la cadena es larga.
- Si la cadena es muy extensa, puede afectar el rendimiento por el recorrido secuencial.
- El orden de los manejadores importa y puede ser fuente de errores sutiles.

## Casos de uso en vida real
- **Middleware en frameworks web**: Express.js y Spring encadenan middlewares para autenticación, logging y validación de requests.
- **Soporte técnico por niveles**: Las solicitudes escalan de nivel 1 a nivel 2 y nivel 3 si el nivel anterior no puede resolverlas.
- **Filtros de seguridad**: Java Servlet Filters encadenan validaciones de autenticación, autorización y rate limiting.
- **Aprobación de gastos corporativos**: Un gasto es aprobado por el supervisor, gerente o director según su monto.
