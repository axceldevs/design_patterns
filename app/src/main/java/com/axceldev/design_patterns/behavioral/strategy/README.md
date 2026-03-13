# Strategy pattern

## ¿Qué es el patrón?
Es un patrón de comportamiento que define una familia de algoritmos, encapsula cada uno en una clase separada y los hace intercambiables, permitiendo que el algoritmo varíe independientemente de los clientes que lo usan.

## ¿Qué nos permite hacer?
Nos permite cambiar el algoritmo utilizado por un objeto en tiempo de ejecución, seleccionando entre distintas estrategias según el contexto, sin modificar el código del cliente.

## ¿Para qué es útil el patrón?
Es útil cuando se tienen múltiples variantes de un algoritmo y se quiere poder cambiar entre ellas dinámicamente, cuando se quiere eliminar condicionales que seleccionan el comportamiento, o cuando se quiere aislar la lógica del algoritmo del código que lo usa (ordenamientos, cálculos de precios, validaciones, etc.).
