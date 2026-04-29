package com.axceldev.design_patterns.behavioral.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IssuerColleague extends Colleague {

    public Logger logger = LoggerFactory.getLogger(IssuerColleague.class);

    public IssuerColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        logger.info("Issuer received: {}", message);
    }
}
