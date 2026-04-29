package com.axceldev.design_patterns.creational.builder;

public class Card {

    private final String cardType;
    private final String number;
    private final String name;
    private final int expires;
    private final boolean isCreditCard;

    private Card(Builder builder) {
        this.cardType = builder.cardType;
        this.number = builder.number;
        this.name = builder.name;
        this.expires = builder.expires;
        this.isCreditCard = builder.isCreditCard;
    }

    public String getCardType() {
        return cardType;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getExpires() {
        return expires;
    }

    public boolean isCreditCard() {
        return isCreditCard;
    }

    @Override
    public String toString() {
        return "Card {" + '\n' +
                "cardType=" + cardType + '\n' +
                "number=" + number + '\n' +
                "name=" + name + '\n' +
                "expires=" + expires + '\n' +
                "isCreditCard=" + isCreditCard + '\n' +
                '}';
    }

    public static class Builder {

        private String cardType;
        private String number;
        private String name;
        private int expires;
        private boolean isCreditCard;

        public Builder(String cardType, String number) {
            this.cardType = cardType;
            this.number = number;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder expires(int expires) {
            this.expires = expires;
            return this;
        }

        public Builder isCreditCard(boolean isCreditCard) {
            this.isCreditCard = isCreditCard;
            return this;
        }

        public Card build() {
            return new Card(this);
        }
    }
}
