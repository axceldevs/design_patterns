package com.axceldev.design_patterns.behavioral.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car implements Observer {

    public static Logger logger = LoggerFactory.getLogger(Car.class);

    @Override
    public void update(TrafficLight trafficLight) {
        if (trafficLight.getStatus().equals(TrafficLightStatus.RED_CAR)) {
            logger.info("The traffic light is {} for Car. ¡so Car can't start up!",
                    TrafficLightStatus.RED_CAR);
        } else {
            logger.info("The traffic light is {} for Car. ¡so Car can start up!",
                    TrafficLightStatus.GREEN_CAR);
        }
    }
}
