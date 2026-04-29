package com.axceldev.design_patterns.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.axceldev.design_patterns.creational.prototype.PrototypeFactory.cardType.AMEX;
import static com.axceldev.design_patterns.creational.prototype.PrototypeFactory.cardType.VISA;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        prototypeTest();
    }

    public static void prototypeTest(){
        PrototypeFactory.loadCard();
        try {
            PrototypeCard visa = PrototypeFactory.getInstance(VISA);
            visa.getCard();
            PrototypeCard amex = PrototypeFactory.getInstance(AMEX);
            amex.getCard();
        }catch (CloneNotSupportedException e){
            logger.error("Error: {}", e.getMessage());
        }
    }
}
