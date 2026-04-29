# Proxy pattern

## ¿Qué es el patrón?
Es un patrón estructural que proporciona un sustituto o representante de otro objeto para controlar el acceso a él, pudiendo añadir lógica adicional antes o después de acceder al objeto real.

## ¿Qué nos permite hacer?
Nos permite interponer un intermediario entre el cliente y el objeto real para controlar, retrasar o registrar el acceso, sin que el cliente tenga que cambiar su forma de interactuar con el objeto.

## ¿Para qué es útil el patrón?
Es útil para implementar carga perezosa (lazy loading), control de acceso y permisos, caché de resultados, logging de operaciones, o acceso remoto a objetos que residen en otro proceso o máquina.

## Ventajas
- Permite controlar el acceso al objeto real sin que el cliente tenga que modificar su código.
- Facilita implementar lógica transversal (logging, caché, seguridad) sin modificar el objeto real.
- El proxy virtual retrasa la creación del objeto costoso hasta que es realmente necesario (lazy loading).
- El proxy remoto oculta la complejidad de la comunicación de red al código cliente.

## Desventajas
- Añade una capa adicional de indirección que puede introducir latencia, especialmente en proxies remotos.
- Puede complicar el diseño y hacer el código más difícil de seguir cuando hay múltiples tipos de proxy.
- Si el proxy gestiona estado (como una caché), puede quedar desincronizado con el objeto real.

## Casos de uso en vida real
- **Lazy loading de imágenes**: Aplicaciones web y móviles muestran un placeholder hasta que la imagen real se carga, usando un proxy que retrasa la petición de red.
- **Control de acceso y autorización**: Spring Security usa proxies AOP para interceptar llamadas a métodos y verificar permisos antes de ejecutar la lógica real.
- **Caché de resultados**: Un proxy que envuelve un repositorio puede cachear los resultados de consultas costosas y devolverlos directamente sin consultar la base de datos.
- **Objetos remotos (RMI/RPC)**: Java RMI crea proxies locales que representan objetos que viven en un servidor remoto, ocultando toda la comunicación de red al cliente.
