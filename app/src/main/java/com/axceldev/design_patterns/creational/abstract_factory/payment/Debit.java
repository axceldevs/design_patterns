package com.axceldev.design_patterns.creational.abstract_factory.payment;

public class Debit implements PaymentMethod {
    @Override
    public String doPayment() {
        return "Debit Payment";
    }
}
