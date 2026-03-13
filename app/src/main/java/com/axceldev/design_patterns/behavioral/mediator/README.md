# Mediator pattern

## ¿Qué es el patrón?
Es un patrón de comportamiento que define un objeto mediador que encapsula la forma en que interactúan un conjunto de objetos, promoviendo el bajo acoplamiento al evitar que los objetos se refieran entre sí directamente.

## ¿Qué nos permite hacer?
Nos permite centralizar la lógica de comunicación compleja entre múltiples objetos en un único mediador, de modo que cada objeto solo conoce al mediador y no a los demás participantes.

## ¿Para qué es útil el patrón?
Es útil cuando la lógica de comunicación entre muchos objetos se vuelve tan compleja que resulta difícil de mantener, como en componentes de UI que se actualizan mutuamente, sistemas de chat, o controladores de tráfico aéreo donde múltiples entidades deben coordinarse.
