package com.axceldev.design_patterns.creational.factory_method;

public class PaymentFactory {

    public static Payment buildPayment(PaymentMethod paymentMethod) {
        return switch (paymentMethod) {
            case GOOGLEPAY -> new GooglePayment();
            case CARD ->  new CardPayment();
        };
    }
}
