# State pattern

## ¿Qué es el patrón?
Es un patrón de comportamiento que permite a un objeto alterar su comportamiento cuando su estado interno cambia, haciendo que el objeto parezca cambiar de clase en tiempo de ejecución.

## ¿Qué nos permite hacer?
Nos permite encapsular cada estado posible de un objeto en una clase separada y delegar el comportamiento al objeto de estado actual, eliminando largas cadenas de condicionales (if/switch) que comprueban el estado.

## ¿Para qué es útil el patrón?
Es útil cuando un objeto debe cambiar su comportamiento en función de su estado interno y ese estado puede cambiar en tiempo de ejecución, como en máquinas de estado, flujos de trabajo, controladores de juegos, o gestores de pedidos con múltiples fases.

## Ventajas
- Elimina largas cadenas de condicionales (if/switch) que verifican el estado, haciendo el código más limpio.
- Cada estado tiene su propia clase con responsabilidad única, facilitando el mantenimiento.
- Agregar nuevos estados es sencillo sin modificar los estados existentes (principio abierto/cerrado).
- El comportamiento del objeto cambia automáticamente al cambiar su estado interno.

## Desventajas
- Puede generar un gran número de clases pequeñas si el objeto tiene muchos estados posibles.
- La lógica de transición entre estados puede volverse compleja si hay muchas combinaciones.
- Puede ser excesivo para objetos que solo tienen dos o tres estados simples.

## Casos de uso en vida real
- **Máquinas expendedoras**: Cambian su comportamiento (aceptar monedas, dispensar producto, devolver cambio) según el estado en que se encuentran.
- **Gestión de pedidos e-commerce**: Un pedido pasa por estados como Pendiente, Pagado, Enviado, Entregado y Cancelado, con comportamientos distintos en cada fase.
- **Personajes en videojuegos**: Un personaje puede estar en estado Caminando, Corriendo, Saltando o Muerto, con acciones y animaciones diferentes en cada estado.
- **Semáforos de tráfico**: Ciclan entre estados Rojo, Amarillo y Verde con comportamientos y tiempos distintos en cada uno.
