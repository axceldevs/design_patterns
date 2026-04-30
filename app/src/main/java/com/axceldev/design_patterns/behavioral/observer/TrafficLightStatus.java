package com.axceldev.design_patterns.behavioral.observer;

public enum TrafficLightStatus {
    RED_CAR("Red"),
    GREEN_CAR("Green"),
    GREEN_PEDESTRIAN("Green"),
    RED_PEDESTRIAN("Red"),;

    private final String status;

    TrafficLightStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
}
