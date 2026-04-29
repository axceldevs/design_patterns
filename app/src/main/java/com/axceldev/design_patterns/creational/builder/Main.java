package com.axceldev.design_patterns.creational.builder;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Card card = createCard();
        logger.info("Card info: {}", card);
    }

    public static Card createCard() {
        return new Card.Builder("VISA",
                "0000 0000 0000")
                .name("CRISTIAN BAMBAGUE")
                .expires(1)
                .isCreditCard(Boolean.TRUE)
                .build();
    }
}
