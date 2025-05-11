package org.design_pattern.observer_pattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private int temperature;
    private int humidity;
    private int pressure;


    public CurrentConditionsDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.printf("Temperature: %s, Humidity: %s, Pressure: %s%n", temperature, humidity, pressure);
    }

    @Override
    public String getName() {
        return "Current Conditions display";
    }

    @Override
    public boolean equals(Observer observer) {
        return this.getName().equals(observer.getName());
    }
}
