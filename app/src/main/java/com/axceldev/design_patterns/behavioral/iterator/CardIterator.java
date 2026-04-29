package com.axceldev.design_patterns.behavioral.iterator;

public class CardIterator implements Iterator {

    private Card[] card;
    private int index;

    public CardIterator(Card[] card) {
        this.card = card;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < card.length;
    }

    @Override
    public Object next() {
        return card[index++];
    }

    @Override
    public Object current() {
        return card[index];
    }
}
