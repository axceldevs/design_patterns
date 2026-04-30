package com.axceldev.design_patterns.behavioral.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        testObserver();
    }

    private static void testObserver() {
        /*Instances initial*/
        Car car = new Car();
        Pedestrian pedestrian = new Pedestrian();
        MessagePublisher messagePublisher = new MessagePublisher();
        /* Register observers */
        messagePublisher.register(car);
        messagePublisher.register(pedestrian);
        /* Notify state */
        messagePublisher.notifyUpdate(new TrafficLight(TrafficLightStatus.RED_CAR));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            logger.error("Sleep interrupted");
        }
        /* Notify change state RED -> GREEN CAR */
        messagePublisher.notifyUpdate(new TrafficLight(TrafficLightStatus.GREEN_CAR));
    }
}
