package com.axceldev.design_patterns.creational.factory_method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CardPayment implements Payment {
    private static final Logger logger = LoggerFactory.getLogger(CardPayment.class);
    @Override
    public void doPayment() {
        logger.info("Card Payment Started");
    }
}
