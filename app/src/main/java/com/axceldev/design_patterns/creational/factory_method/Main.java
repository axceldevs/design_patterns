package com.axceldev.design_patterns.creational.factory_method;

public class Main {

    public static void main(String[] args) {
        doPayment();
    }

    public static void doPayment() {
        Payment payment = PaymentFactory.buildPayment(PaymentMethod.GOOGLEPAY);
        payment.doPayment();
    }
}
