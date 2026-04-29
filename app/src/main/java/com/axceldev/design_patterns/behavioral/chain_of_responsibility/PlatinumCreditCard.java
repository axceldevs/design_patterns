package com.axceldev.design_patterns.behavioral.chain_of_responsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlatinumCreditCard implements ApproveCreditCardChain {

    private static final Logger logger = LoggerFactory.getLogger(PlatinumCreditCard.class);

    private ApproveCreditCardChain next;

    @Override
    public void setNext(ApproveCreditCardChain creditCardChain) {
        next = creditCardChain;
    }

    @Override
    public ApproveCreditCardChain getNext() {
        return next;
    }

    @Override
    public void creditCardRequest(int totalSalaryIncome) {
        if (totalSalaryIncome > 10000 && totalSalaryIncome <= 50000) {
            logger.info("Platinum Credit Card Approval");
        }else  {
            next.creditCardRequest(totalSalaryIncome);
        }
    }
}
