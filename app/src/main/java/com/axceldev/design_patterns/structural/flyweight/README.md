# Flyweight pattern

## ¿Qué es el patrón?
Es un patrón estructural que optimiza el uso de memoria compartiendo el estado común (intrínseco) entre múltiples objetos similares, en lugar de almacenarlo en cada instancia por separado.

## ¿Qué nos permite hacer?
Nos permite soportar grandes cantidades de objetos similares de forma eficiente en memoria, separando el estado compartido (intrínseco) del estado particular de cada instancia (extrínseco).

## ¿Para qué es útil el patrón?
Es útil cuando una aplicación necesita manejar un número muy grande de objetos similares que consumen demasiada memoria, como caracteres en un editor de texto, partículas en un videojuego o nodos en un árbol de renderizado.

## Ventajas
- Reduce drásticamente el uso de memoria al compartir el estado intrínseco entre miles de objetos similares.
- Permite manejar grandes cantidades de objetos que de otro modo harían inviable la aplicación por consumo de RAM.
- El estado compartido (intrínseco) es inmutable, lo que elimina problemas de concurrencia sobre él.

## Desventajas
- Aumenta la complejidad del código al obligar a separar el estado intrínseco del extrínseco.
- El estado extrínseco debe calcularse o pasarse como parámetro en cada operación, lo que puede reducir la legibilidad.
- La fábrica de flyweights (caché de instancias compartidas) añade una capa adicional que puede ser difícil de gestionar.

## Casos de uso en vida real
- **Editores de texto**: Procesadores como Word o Google Docs almacenan un único objeto por tipo de carácter (fuente, tamaño, estilo) compartido por todas las ocurrencias de ese carácter en el documento.
- **Motores de videojuegos**: Un juego con miles de partículas (explosiones, chispas, lluvia) comparte la textura y los atributos comunes entre todas las partículas, solo variando su posición y velocidad.
- **Pools de conexiones**: Los objetos de conexión a base de datos comparten la configuración del driver y el host; solo varía el estado de la sesión de cada conexión activa.
- **Renderizado de mapas**: Google Maps o Leaflet comparten los tiles (imágenes de mapa) ya descargados entre múltiples vistas del mapa para evitar repetir peticiones y reducir el uso de memoria.
