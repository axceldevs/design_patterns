# Prototype pattern

## ¿Qué es el patrón?
Es un patrón creacional que permite copiar objetos existentes sin que el código dependa de sus clases concretas. El propio objeto es responsable de clonarse a sí mismo.

## ¿Qué nos permite hacer?
Nos permite duplicar objetos complejos sin conocer sus detalles internos ni depender de su clase concreta. Basta con llamar al método de clonación del objeto original para obtener una copia exacta.

## ¿Para qué es útil el patrón?
Es útil cuando la creación de un objeto desde cero es costosa o compleja, y resulta más eficiente clonar una instancia ya configurada. También es útil para reducir el número de subclases cuando la única diferencia entre ellas es el estado inicial del objeto.
