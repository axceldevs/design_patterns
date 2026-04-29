# Strategy pattern

## ¿Qué es el patrón?
Es un patrón de comportamiento que define una familia de algoritmos, encapsula cada uno en una clase separada y los hace intercambiables, permitiendo que el algoritmo varíe independientemente de los clientes que lo usan.

## ¿Qué nos permite hacer?
Nos permite cambiar el algoritmo utilizado por un objeto en tiempo de ejecución, seleccionando entre distintas estrategias según el contexto, sin modificar el código del cliente.

## ¿Para qué es útil el patrón?
Es útil cuando se tienen múltiples variantes de un algoritmo y se quiere poder cambiar entre ellas dinámicamente, cuando se quiere eliminar condicionales que seleccionan el comportamiento, o cuando se quiere aislar la lógica del algoritmo del código que lo usa (ordenamientos, cálculos de precios, validaciones, etc.).

## Ventajas
- Permite intercambiar algoritmos en tiempo de ejecución sin modificar el contexto que los usa.
- Elimina condicionales que seleccionan el comportamiento, haciendo el código más limpio.
- Cada estrategia puede probarse de forma aislada e independiente.
- Facilita agregar nuevas variantes del algoritmo sin modificar el código existente (principio abierto/cerrado).

## Desventajas
- El cliente debe conocer las estrategias disponibles para seleccionar la correcta.
- Puede ser excesivo si solo hay dos o tres variantes simples del algoritmo.
- Aumenta el número de clases o interfaces en el sistema.

## Casos de uso en vida real
- **Métodos de pago en e-commerce**: El sistema elige entre estrategias de pago con tarjeta, PayPal, criptomonedas o transferencia bancaria según la elección del usuario.
- **Algoritmos de ordenamiento**: Librerías como `Collections.sort()` de Java permiten inyectar un `Comparator` como estrategia de ordenamiento.
- **Compresión de archivos**: Aplicaciones como 7-Zip permiten elegir entre algoritmos ZIP, GZIP o BZIP2 como estrategia de compresión.
- **Cálculo de tarifas de envío**: Un sistema selecciona dinámicamente entre estrategias de envío express, estándar o económico según el pedido.
