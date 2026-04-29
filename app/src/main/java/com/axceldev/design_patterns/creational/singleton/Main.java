package com.axceldev.design_patterns.creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        singletonTest();
    }

    public static void singletonTest() {
        Card card = Card.getInstance();
        card.setCardNumber("0000 1111 2222 3333");
        logger.info("Card Number: {}", card.getCardNumber());
    }
}
