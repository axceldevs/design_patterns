package com.axceldev.design_patterns.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Visa implements PrototypeCard {

    private static final Logger logger = LoggerFactory.getLogger(Visa.class);

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        logger.info("Cloning Visa Card");
        return (Visa) super.clone();
    }

    @Override
    public void getCard() {
        logger.info("This is the Visa Card");
    }
}
