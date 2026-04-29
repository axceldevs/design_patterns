package com.axceldev.design_patterns.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Amex implements PrototypeCard {

    private static final Logger logger = LoggerFactory.getLogger(Amex.class);

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        logger.debug("Cloning Amex Card");
        return (Amex) super.clone();
    }

    @Override
    public void getCard() {
        logger.debug("This is an Amex card");
    }
}
