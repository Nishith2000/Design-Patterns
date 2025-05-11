package org.design_pattern.observer_pattern;

public interface Observer {

    void update(int temperature, int humidity, int pressure);

    String getName();

    boolean equals(Observer observer);
}
