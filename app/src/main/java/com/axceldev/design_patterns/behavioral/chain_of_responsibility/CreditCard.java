package com.axceldev.design_patterns.behavioral.chain_of_responsibility;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreditCard  implements ApproveCreditCardChain{

    public static Logger logger = LoggerFactory.getLogger(CreditCard.class);
    private  ApproveCreditCardChain next;

    @Override
    public void setNext(ApproveCreditCardChain creditCardChain) {
        this.next = creditCardChain;
    }

    @Override
    public ApproveCreditCardChain getNext() {
        return next;
    }

    @Override
    public void creditCardRequest(int totalSalaryIncome) {
        GoldCreditCard goldCreditCard = new GoldCreditCard();
        this.setNext(goldCreditCard);

        PlatinumCreditCard platinumCreditCard = new PlatinumCreditCard();
        goldCreditCard.setNext(platinumCreditCard);

        BlackCreditCard blackCreditCard = new BlackCreditCard();
        platinumCreditCard.setNext(blackCreditCard);

        next.creditCardRequest(totalSalaryIncome);
    }
}
