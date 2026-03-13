# Design Patterns

Los **patrones de diseño** son soluciones reutilizables a problemas comunes que surgen durante el diseño de software. No son fragmentos de código listos para copiar, sino plantillas o guías que describen cómo resolver un problema en distintos contextos.

Fueron popularizados por el libro *"Design Patterns: Elements of Reusable Object-Oriented Software"* (1994) escrito por la llamada **"Gang of Four" (GoF)**: Erich Gamma, Richard Helm, Ralph Johnson y John Vlissides.

---

## Categorías

Los patrones se dividen en tres grandes grupos:

### Creacionales
Se enfocan en los mecanismos de creación de objetos, buscando crearlos de manera adecuada según la situación.

| Patrón | Descripción | Estado |
|--------|-------------|--------|
| Abstract Factory | Crea familias de objetos relacionados sin especificar sus clases concretas | Pendiente |
| Builder | Construye objetos complejos paso a paso, separando la construcción de la representación | En progreso |
| Factory Method | Define una interfaz para crear un objeto, pero deja que las subclases decidan qué clase instanciar | Pendiente |
| Prototype | Crea nuevos objetos copiando (clonando) un objeto existente | Pendiente |
| Singleton | Garantiza que una clase tenga una única instancia y proporciona un punto de acceso global | Pendiente |

### Estructurales
Se ocupan de cómo se componen clases y objetos para formar estructuras más grandes y flexibles.

| Patrón | Descripción | Estado |
|--------|-------------|--------|
| Adapter | Permite que interfaces incompatibles trabajen juntas | Pendiente |
| Bridge | Desacopla una abstracción de su implementación para que ambas puedan variar independientemente | Pendiente |
| Composite | Compone objetos en estructuras de árbol para representar jerarquías parte-todo | Pendiente |
| Decorator | Añade responsabilidades a un objeto de forma dinámica, como alternativa a la herencia | Pendiente |
| Facade | Proporciona una interfaz simplificada a un subsistema complejo | Pendiente |
| Flyweight | Usa el compartimiento para soportar eficientemente grandes cantidades de objetos de granularidad fina | Pendiente |
| Proxy | Proporciona un sustituto o representante de otro objeto para controlar el acceso a él | Pendiente |

### De Comportamiento
Se centran en la comunicación y responsabilidades entre objetos.

| Patrón | Descripción | Estado |
|--------|-------------|--------|
| Chain of Responsibility | Pasa solicitudes a lo largo de una cadena de manejadores | Pendiente |
| Command | Encapsula una solicitud como un objeto, permitiendo parametrizar clientes con diferentes solicitudes | Pendiente |
| Iterator | Proporciona una forma de acceder secuencialmente a los elementos de una colección sin exponer su representación interna | Pendiente |
| Mediator | Define un objeto que encapsula cómo interactúan un conjunto de objetos | Pendiente |
| Memento | Captura y externaliza el estado interno de un objeto para poder restaurarlo más tarde | Pendiente |
| Observer | Define una dependencia uno-a-muchos para que cuando un objeto cambie, sus dependientes sean notificados | Pendiente |
| State | Permite que un objeto altere su comportamiento cuando su estado interno cambia | Pendiente |
| Strategy | Define una familia de algoritmos, los encapsula y los hace intercambiables | Pendiente |
| Template Method | Define el esqueleto de un algoritmo en una operación, difiriendo algunos pasos a las subclases | Pendiente |
| Visitor | Representa una operación a realizar sobre los elementos de una estructura de objetos | Pendiente |

---

## Tecnologías

- **Lenguaje:** Java
- **Build tool:** Gradle

## Referencia

- [Refactoring Guru — Design Patterns](https://refactoring.guru/es/design-patterns)
- *Design Patterns: Elements of Reusable Object-Oriented Software* — GoF (1994)