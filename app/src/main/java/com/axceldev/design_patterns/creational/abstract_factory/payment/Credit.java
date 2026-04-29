package com.axceldev.design_patterns.creational.abstract_factory.payment;

public class Credit implements PaymentMethod {
    @Override
    public String doPayment() {
        return "Credit Payment";
    }
}
