# Factory method pattern

## ¿Qué es el patrón?
Es un patrón creacional que define una interfaz para crear un objeto, pero deja que las subclases decidan qué clase concreta instanciar. En lugar de llamar directamente al constructor, se delega la creación a un método fábrica que puede ser sobreescrito.

## ¿Qué nos permite hacer?
Nos permite crear objetos sin acoplar el código al tipo concreto del objeto creado. Las subclases pueden cambiar el tipo de objeto que se produce simplemente sobreescribiendo el método fábrica.

## ¿Para qué es útil el patrón?
Es útil cuando no se conoce de antemano el tipo exacto del objeto a crear, cuando se quiere que las subclases controlen la creación de objetos, o cuando se desea reutilizar objetos existentes en lugar de crearlos siempre desde cero.
