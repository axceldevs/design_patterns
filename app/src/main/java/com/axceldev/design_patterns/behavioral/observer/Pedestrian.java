package com.axceldev.design_patterns.behavioral.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pedestrian implements Observer {

    public static Logger logger = LoggerFactory.getLogger(Pedestrian.class);

    @Override
    public void update(TrafficLight trafficLight) {
        if (trafficLight.getStatus().equals(TrafficLightStatus.RED_CAR)) {
            logger.info("The traffic light is {} for Pedestrian. ¡so they can cross the street!",
                    TrafficLightStatus.GREEN_PEDESTRIAN);
        }else{
            logger.info("The traffic light is {} for Pedestrian. ¡so they can't cross the street!",
                    TrafficLightStatus.RED_PEDESTRIAN);
        }
    }
}
