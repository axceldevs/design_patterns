# Proxy pattern

## ¿Qué es el patrón?
Es un patrón estructural que proporciona un sustituto o representante de otro objeto para controlar el acceso a él, pudiendo añadir lógica adicional antes o después de acceder al objeto real.

## ¿Qué nos permite hacer?
Nos permite interponer un intermediario entre el cliente y el objeto real para controlar, retrasar o registrar el acceso, sin que el cliente tenga que cambiar su forma de interactuar con el objeto.

## ¿Para qué es útil el patrón?
Es útil para implementar carga perezosa (lazy loading), control de acceso y permisos, caché de resultados, logging de operaciones, o acceso remoto a objetos que residen en otro proceso o máquina.
