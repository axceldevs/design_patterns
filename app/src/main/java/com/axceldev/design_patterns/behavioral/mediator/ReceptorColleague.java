package com.axceldev.design_patterns.behavioral.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReceptorColleague extends Colleague {

    public static Logger logger = LoggerFactory.getLogger(ReceptorColleague.class);

    public ReceptorColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        logger.info("Receptor received: {}", message);
    }
}
