# Facade pattern

## ¿Qué es el patrón?
Es un patrón estructural que proporciona una interfaz simplificada a un subsistema complejo, ocultando su complejidad interna detrás de una clase de fachada.

## ¿Qué nos permite hacer?
Nos permite interactuar con un conjunto complejo de clases a través de una única interfaz sencilla, reduciendo las dependencias del código cliente con los detalles internos del subsistema.

## ¿Para qué es útil el patrón?
Es útil cuando se quiere ofrecer una interfaz simple a un subsistema complejo, cuando se desea reducir el acoplamiento entre el cliente y las clases internas, o cuando se necesita organizar un subsistema en capas bien definidas.

## Ventajas
- Simplifica el uso del subsistema al ofrecer una única interfaz de alto nivel.
- Reduce el acoplamiento entre el código cliente y los componentes internos del subsistema.
- Facilita el refactoring interno del subsistema sin afectar al código cliente que usa la fachada.
- Permite organizar el código en capas, donde cada capa expone una fachada al siguiente nivel.

## Desventajas
- Puede convertirse en un "God Object" si acumula demasiada lógica o responsabilidades.
- Oculta la funcionalidad avanzada del subsistema: los clientes que la necesiten deben saltarse la fachada.
- Si la fachada se vuelve el único punto de acceso, puede crear un cuello de botella en el mantenimiento.

## Casos de uso en vida real
- **SDKs de pago**: Stripe o PayPal exponen una fachada simple (`charge(amount, token)`) que internamente gestiona autenticación, validación, llamadas a la API y manejo de errores.
- **Capa de servicio en arquitecturas MVC**: Un `OrderService` actúa como fachada que coordina internamente el repositorio, el sistema de pagos, el inventario y las notificaciones.
- **APIs de librerías complejas**: JDBC expone una interfaz sencilla para ejecutar queries, ocultando la complejidad de la gestión de conexiones, drivers y protocolos de red.
- **Sistemas domóticos**: Un botón "buenas noches" actúa como fachada que coordina internamente el apagado de luces, el cierre de persianas y el ajuste del termostato.
