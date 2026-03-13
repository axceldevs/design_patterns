# Observer pattern

## ¿Qué es el patrón?
Es un patrón de comportamiento que define una dependencia de uno a muchos entre objetos, de modo que cuando un objeto (sujeto) cambia de estado, todos sus dependientes (observadores) son notificados y actualizados automáticamente.

## ¿Qué nos permite hacer?
Nos permite implementar un mecanismo de suscripción/notificación donde los objetos pueden suscribirse para recibir eventos de otro objeto sin que haya un acoplamiento fuerte entre ellos.

## ¿Para qué es útil el patrón?
Es útil en sistemas basados en eventos, interfaces de usuario reactivas, arquitecturas publisher/subscriber, propagación de cambios de modelo a vistas (como en MVC), o cualquier situación donde múltiples objetos deban reaccionar al cambio de estado de otro.
