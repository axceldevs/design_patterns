package com.axceldev.design_patterns.behavioral.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        testCommand();
    }

    public static void testCommand() {
        CreditCard creditCardActivated = new CreditCard();
        CreditCard creditCardDeactivated = new CreditCard();

        CreditCardInvoker invoker = new CreditCardInvoker();
        logger.info("--------------------ACTIVATING------------------------");
        invoker.setCommand(new CreditCardActivateCommand(creditCardActivated));
        invoker.run();
        logger.info("--------------------DEACTIVATING------------------------");
        invoker.setCommand(new CreditCardDeactivateCommand(creditCardDeactivated));
        invoker.run();
    }
}
