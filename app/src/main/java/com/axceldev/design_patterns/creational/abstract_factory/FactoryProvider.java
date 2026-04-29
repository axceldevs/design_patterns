package com.axceldev.design_patterns.creational.abstract_factory;

import com.axceldev.design_patterns.creational.abstract_factory.card.CardFactory;
import com.axceldev.design_patterns.creational.abstract_factory.payment.PaymentMethodFactory;


public class FactoryProvider {

    @SuppressWarnings("unchecked")
    public static <T, D> AbstractFactory<T, D> getFactory(ProviderType providerType) {
        return (AbstractFactory<T, D>) switch (providerType) {
            case CARD -> new CardFactory();
            case PAYMENT_METHOD -> new PaymentMethodFactory();
        };
    }
}
