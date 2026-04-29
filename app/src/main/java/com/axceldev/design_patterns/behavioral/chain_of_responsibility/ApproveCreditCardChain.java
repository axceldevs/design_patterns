package com.axceldev.design_patterns.behavioral.chain_of_responsibility;

public interface ApproveCreditCardChain {
    void setNext(ApproveCreditCardChain creditCardChain);
    ApproveCreditCardChain getNext();
    void creditCardRequest(int totalSalaryIncome);
}
