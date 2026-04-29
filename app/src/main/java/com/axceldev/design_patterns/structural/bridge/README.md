# Bridge pattern

## ¿Qué es el patrón?
Es un patrón estructural que separa una abstracción de su implementación en jerarquías de clases independientes, permitiendo que ambas varíen de forma independiente.

## ¿Qué nos permite hacer?
Nos permite cambiar la abstracción y la implementación de forma independiente, evitando una explosión de subclases cuando se combina una dimensión de abstracción con otra de implementación.

## ¿Para qué es útil el patrón?
Es útil cuando se quiere evitar una vinculación permanente entre abstracción e implementación, cuando ambas deben ser extensibles mediante herencia, o cuando los cambios en la implementación no deben afectar al código cliente.

## Ventajas
- Desacopla la abstracción de su implementación, permitiendo que ambas evolucionen de forma independiente.
- Evita la explosión combinatoria de subclases cuando se tienen dos dimensiones de variación.
- Favorece la composición sobre la herencia, lo que produce diseños más flexibles.
- El código cliente trabaja con la abstracción sin conocer los detalles de la implementación concreta.

## Desventajas
- Aumenta la complejidad del diseño al introducir una capa adicional de indirección.
- Puede resultar sobrediseño cuando solo existe una implementación posible de la abstracción.
- La relación entre abstracción e implementación puede ser difícil de entender para desarrolladores que no conocen el patrón.

## Casos de uso en vida real
- **Drivers de dispositivos**: El sistema operativo define la abstracción del dispositivo (impresora, tarjeta gráfica) y delega en implementaciones concretas según el hardware instalado.
- **Renderizado multiplataforma**: Un motor gráfico separa la abstracción de "forma" (círculo, rectángulo) de la implementación de renderizado (OpenGL, DirectX, Vulkan).
- **Notificaciones multicanal**: Una clase `Notificacion` es independiente del canal concreto (Email, SMS, Push) que se inyecta como implementación en tiempo de ejecución.
- **Persistencia de datos**: La lógica de repositorio (abstracción) se separa del motor de almacenamiento concreto (MySQL, MongoDB, Redis) que puede cambiarse sin afectar la lógica de negocio.
