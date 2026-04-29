package com.axceldev.design_patterns.creational.abstract_factory.card;

import com.axceldev.design_patterns.creational.abstract_factory.AbstractFactory;

public class CardFactory implements AbstractFactory<Card, CardType> {

    @Override
    public Card create(CardType cardType) {
        return switch (cardType) {
            case VISA -> new VisaCard();
            case MASTERCARD ->  new MasterCard();
        };
    }
}
