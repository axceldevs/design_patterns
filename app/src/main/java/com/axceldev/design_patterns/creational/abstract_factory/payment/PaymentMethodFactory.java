package com.axceldev.design_patterns.creational.abstract_factory.payment;

import com.axceldev.design_patterns.creational.abstract_factory.AbstractFactory;

public class PaymentMethodFactory implements AbstractFactory<PaymentMethod, PaymentType> {

    @Override
    public PaymentMethod create(PaymentType paymentType) {
        return switch (paymentType){
            case DEBIT -> new Debit();
            case CREDIT -> new Credit();
        };
    }
}
