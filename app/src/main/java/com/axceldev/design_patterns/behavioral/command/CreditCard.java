package com.axceldev.design_patterns.behavioral.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreditCard {
    public static Logger logger = LoggerFactory.getLogger(CreditCard.class);

    public void sendPinNumberToCustomer() {
        logger.info("Sending PIN number to customer ");
    }

    public void sendSmsToCustomerActivated() {
        logger.info("Sending SMS to customer, His credit card has created");
    }

    public void activateCreditCard() {
        logger.info("Activating Credit Card");
    }

    public void deactivateCreditCard() {
        logger.info("Deactivating Credit Card");
    }

    public void sendSmsToCustomerDeactivated() {
        logger.info("Sending SMS to customer deactivated credit card");
    }
}
