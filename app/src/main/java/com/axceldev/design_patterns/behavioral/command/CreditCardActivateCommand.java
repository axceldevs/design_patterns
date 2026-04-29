package com.axceldev.design_patterns.behavioral.command;

public class CreditCardActivateCommand implements Command {

    private CreditCard creditCard;

    public CreditCardActivateCommand(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void execute() {
        creditCard.sendPinNumberToCustomer();
        creditCard.activateCreditCard();
        creditCard.sendSmsToCustomerActivated();
    }
}
