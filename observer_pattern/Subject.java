package org.design_pattern.observer_pattern;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(int temperature, int humidity, int pressure);
}
