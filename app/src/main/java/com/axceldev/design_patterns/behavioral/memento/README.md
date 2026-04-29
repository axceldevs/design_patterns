# Memento pattern

## ¿Qué es el patrón?
Es un patrón de comportamiento que permite capturar y externalizar el estado interno de un objeto en un momento dado, para poder restaurarlo posteriormente, sin violar el principio de encapsulamiento.

## ¿Qué nos permite hacer?
Nos permite guardar instantáneas (snapshots) del estado de un objeto y restaurarlas cuando sea necesario, manteniendo la privacidad de los detalles internos del objeto.

## ¿Para qué es útil el patrón?
Es útil para implementar funcionalidades de deshacer/rehacer (undo/redo), puntos de guardado en videojuegos, historial de cambios en editores de texto, o cualquier escenario donde se necesite revertir el estado de un objeto a un punto anterior.

## Ventajas
- Permite guardar y restaurar el estado de un objeto sin violar su encapsulamiento.
- La lógica de guardado y restauración está separada del objeto principal (Originator).
- Facilita implementar undo/redo de forma limpia y sin exponer los detalles internos del objeto.
- El número de snapshots puede limitarse para controlar el uso de memoria.

## Desventajas
- Puede consumir mucha memoria si se guardan muchos estados o si los estados son voluminosos.
- El Caretaker debe gestionar el ciclo de vida de los mementos, lo que añade responsabilidad extra.
- En lenguajes sin acceso restringido (como Python), es difícil garantizar que el memento no sea modificado externamente.

## Casos de uso en vida real
- **Editores de texto**: Ctrl+Z en Word, Google Docs o VS Code guarda instantáneas del contenido para revertir cambios.
- **Videojuegos**: Los "puntos de guardado" (save points) almacenan el estado completo del juego para retomarlo más tarde.
- **Transacciones de base de datos**: Los sistemas de gestión de BD guardan el estado antes de una transacción para hacer rollback si falla.
- **Herramientas de diseño gráfico**: Photoshop o Figma mantienen un historial de estados del canvas para deshacer operaciones.
