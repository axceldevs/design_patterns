# Memento pattern

## ¿Qué es el patrón?
Es un patrón de comportamiento que permite capturar y externalizar el estado interno de un objeto en un momento dado, para poder restaurarlo posteriormente, sin violar el principio de encapsulamiento.

## ¿Qué nos permite hacer?
Nos permite guardar instantáneas (snapshots) del estado de un objeto y restaurarlas cuando sea necesario, manteniendo la privacidad de los detalles internos del objeto.

## ¿Para qué es útil el patrón?
Es útil para implementar funcionalidades de deshacer/rehacer (undo/redo), puntos de guardado en videojuegos, historial de cambios en editores de texto, o cualquier escenario donde se necesite revertir el estado de un objeto a un punto anterior.
