package com.axceldev.design_patterns.behavioral.iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        testIterator();
    }

    private static void testIterator() {
        Card[] cards = new Card[5];
        cards[0] = new Card("VISA");
        cards[1] = new Card("MASTERCARD");
        cards[2] = new Card("AMERICAN EXPRESS");
        cards[3] = new Card("APPLE CARD");
        cards[4] = new Card("GOOGLE CARD");

        List cardList = new CardList(cards);
        Iterator iterator = cardList.iterator();

        while (iterator.hasNext()) {
            Card card = (Card) iterator.next();
            logger.info(card.toString());
        }
    }
}
