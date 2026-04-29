# Composite pattern

## ¿Qué es el patrón?
Es un patrón estructural que permite componer objetos en estructuras de árbol para representar jerarquías parte-todo. Permite tratar a los objetos individuales y a las composiciones de manera uniforme.

## ¿Qué nos permite hacer?
Nos permite trabajar con objetos simples y compuestos usando la misma interfaz, sin necesidad de distinguir entre un elemento hoja y un contenedor que agrupa varios elementos.

## ¿Para qué es útil el patrón?
Es útil cuando se necesita representar jerarquías de objetos como árboles (por ejemplo, sistemas de archivos, menús anidados, o componentes de UI), y cuando se quiere que el cliente trate de forma uniforme tanto a los elementos individuales como a los grupos.

## Ventajas
- El cliente trabaja de forma uniforme con elementos simples y compuestos usando la misma interfaz.
- Facilita agregar nuevos tipos de componentes sin modificar el código existente (principio abierto/cerrado).
- Simplifica el código cliente al eliminar la necesidad de distinguir entre hojas y contenedores.
- Permite construir estructuras arbóreas de profundidad arbitraria de forma natural.

## Desventajas
- Puede dificultar la restricción de qué tipos de componentes pueden añadirse a un compuesto.
- La interfaz común puede volverse demasiado general, obligando a implementar operaciones sin sentido en las hojas.
- Puede ser difícil rastrear el comportamiento en estructuras muy profundas o complejas.

## Casos de uso en vida real
- **Sistema de archivos**: Archivos (hojas) y directorios (compuestos) comparten operaciones como abrir, copiar o eliminar; un directorio aplica la operación recursivamente a su contenido.
- **Árbol de componentes UI**: En React, cada componente puede contener otros componentes, y el motor renderiza el árbol de forma recursiva de manera uniforme.
- **Estructuras XML/HTML**: Un elemento HTML puede ser una hoja (texto, imagen) o un contenedor (div, section) con hijos, todos tratados con la misma API del DOM.
- **Menús anidados**: Las aplicaciones de escritorio modelan sus menús como árboles donde los ítems pueden ser opciones simples o submenús que contienen más opciones.
