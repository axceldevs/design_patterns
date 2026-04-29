package com.axceldev.design_patterns.creational.abstract_factory.card;

public class VisaCard implements Card {

    @Override
    public String getCardType() {
        return "VISA";
    }

    @Override
    public String getCardNumber() {
        return "0000 0000 0000";
    }
}
