package com.axceldev.design_patterns.creational.singleton;

public class Card {

    private static Card instance;
    private String cardNumber;

    private Card() {}

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public synchronized static Card getInstance() {
        if (instance == null) {
            instance = new Card();
        }
        return instance;
    }
}
