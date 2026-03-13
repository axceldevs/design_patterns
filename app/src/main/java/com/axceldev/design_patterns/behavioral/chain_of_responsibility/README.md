# Chain of responsibility pattern

## ¿Qué es el patrón?
Es un patrón de comportamiento que permite pasar solicitudes a lo largo de una cadena de manejadores, donde cada uno decide si procesa la solicitud o la pasa al siguiente manejador de la cadena.

## ¿Qué nos permite hacer?
Nos permite desacoplar al emisor de una solicitud de sus receptores, dando a múltiples objetos la oportunidad de manejar la solicitud sin que el emisor sepa cuál de ellos lo hará finalmente.

## ¿Para qué es útil el patrón?
Es útil cuando más de un objeto puede manejar una solicitud y el manejador no se conoce a priori, cuando se quiere emitir una solicitud a varios objetos sin especificar explícitamente el receptor, o para implementar pipelines de procesamiento como middlewares, filtros o validaciones encadenadas.
