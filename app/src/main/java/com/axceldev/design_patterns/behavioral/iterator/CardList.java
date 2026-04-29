package com.axceldev.design_patterns.behavioral.iterator;

public class CardList implements List {

    private final Card[] cards;

    public CardList(Card[] cards) {
        this.cards = cards;
    }

    @Override
    public Iterator iterator() {
        return new CardIterator(cards);
    }
}
