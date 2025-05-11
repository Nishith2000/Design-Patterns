package org.design_pattern.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(int temperature, int humidity, int pressure) {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    // called when measurements change
    public void measurementsChanged(int temperature, int humidity, int pressure) {
        notifyObservers(temperature, humidity, pressure);
    }
}
