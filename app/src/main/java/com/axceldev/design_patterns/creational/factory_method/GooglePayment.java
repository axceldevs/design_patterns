package com.axceldev.design_patterns.creational.factory_method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GooglePayment implements Payment {

    private static final Logger logger = LoggerFactory.getLogger(GooglePayment.class);

    @Override
    public void doPayment() {
        logger.info("Building Google Payment ...");
    }
}
