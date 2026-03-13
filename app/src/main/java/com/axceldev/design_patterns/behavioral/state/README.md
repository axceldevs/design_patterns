# State pattern

## ¿Qué es el patrón?
Es un patrón de comportamiento que permite a un objeto alterar su comportamiento cuando su estado interno cambia, haciendo que el objeto parezca cambiar de clase en tiempo de ejecución.

## ¿Qué nos permite hacer?
Nos permite encapsular cada estado posible de un objeto en una clase separada y delegar el comportamiento al objeto de estado actual, eliminando largas cadenas de condicionales (if/switch) que comprueban el estado.

## ¿Para qué es útil el patrón?
Es útil cuando un objeto debe cambiar su comportamiento en función de su estado interno y ese estado puede cambiar en tiempo de ejecución, como en máquinas de estado, flujos de trabajo, controladores de juegos, o gestores de pedidos con múltiples fases.
