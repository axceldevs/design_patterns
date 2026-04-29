package com.axceldev.design_patterns.behavioral.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        testChainOfResponsibility();
    }

    private static void testChainOfResponsibility(){
        CreditCard creditCard = new CreditCard();
        creditCard.creditCardRequest(50001);
    }
}
