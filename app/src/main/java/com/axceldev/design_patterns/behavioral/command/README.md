# Command pattern

## ¿Qué es el patrón?
Es un patrón de comportamiento que convierte una solicitud en un objeto independiente que contiene toda la información sobre dicha solicitud, permitiendo parametrizar métodos con diferentes solicitudes y aplazar su ejecución.

## ¿Qué nos permite hacer?
Nos permite encapsular operaciones como objetos, lo que posibilita almacenarlas, ponerlas en cola, registrarlas y deshacer o rehacer su ejecución de forma sencilla.

## ¿Para qué es útil el patrón?
Es útil para implementar operaciones deshacer/rehacer (undo/redo), colas de tareas, registro de operaciones (logging), transacciones, o cuando se necesita parametrizar objetos con acciones que se ejecutarán más tarde.
