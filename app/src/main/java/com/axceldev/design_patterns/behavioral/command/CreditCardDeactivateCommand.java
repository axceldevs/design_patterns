package com.axceldev.design_patterns.behavioral.command;

public class CreditCardDeactivateCommand implements Command {

    private CreditCard creditCard;

    public CreditCardDeactivateCommand(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void execute() {
        creditCard.deactivateCreditCard();
        creditCard.sendSmsToCustomerDeactivated();
    }
}
