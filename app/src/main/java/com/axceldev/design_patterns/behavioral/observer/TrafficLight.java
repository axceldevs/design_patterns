package com.axceldev.design_patterns.behavioral.observer;

public class TrafficLight {

    private TrafficLightStatus status;

    public TrafficLight(TrafficLightStatus status) {
        this.status = status;
    }

    public TrafficLightStatus getStatus() {
        return status;
    }
}
