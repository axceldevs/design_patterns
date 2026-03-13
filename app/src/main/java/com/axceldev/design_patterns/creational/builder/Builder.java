package com.axceldev.design_patterns.creational.builder;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ! Patrón Builder:
 * Es un patrón de diseño creacional que nos permite construir objetos complejos
 * paso a paso.
 *
 * El patrón nos permite producir distintos tipos y representaciones
 * de un objeto empleando el mismo código de construcción.
 *
 * * Es útil cuando necesitamos construir un objeto complejo con muchas partes
 * * y queremos que el proceso de construcción sea independiente de las partes
 * * que lo componen.
 *
 * https://refactoring.guru/es/design-patterns/builder
 */

public class Builder {

    private static final Logger logger = LoggerFactory.getLogger(Builder.class);

    public static void main(String[] args) {
        logger.info("Hello init builder pattern!!");
    }
    
}
