package com.axceldev.design_patterns.creational.abstract_factory;

import com.axceldev.design_patterns.creational.abstract_factory.card.Card;
import com.axceldev.design_patterns.creational.abstract_factory.card.CardType;
import com.axceldev.design_patterns.creational.abstract_factory.payment.PaymentMethod;
import com.axceldev.design_patterns.creational.abstract_factory.payment.PaymentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        abstractFactoryTest();
    }

    public static void abstractFactoryTest() {
        AbstractFactory<Card, CardType> cardFactory =
                FactoryProvider.getFactory(ProviderType.CARD);
        AbstractFactory<PaymentMethod, PaymentType> paymentFactory =
                FactoryProvider.getFactory(ProviderType.PAYMENT_METHOD);

        Card card = cardFactory.create(CardType.MASTERCARD);
        PaymentMethod paymentMethod = paymentFactory.create(PaymentType.DEBIT);

        logger.info("Card Type: {}", card.getCardType());
        logger.info("Card number: {}", card.getCardNumber());
        logger.info("Payment Method: {}", paymentMethod.doPayment());
    }
}
