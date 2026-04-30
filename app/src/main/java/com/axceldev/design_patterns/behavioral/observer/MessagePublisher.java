package com.axceldev.design_patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

    public List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(TrafficLight trafficLight) {
        for (Observer o : observers) {
            o.update(trafficLight);
        }
    }
}
