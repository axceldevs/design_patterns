package com.axceldev.design_patterns.behavioral.observer;

public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyUpdate(TrafficLight trafficLight);
}
