package org.design_pattern.observer_pattern;

public class MinMaxDisplay implements Observer, DisplayElement {

    private int maxTemperature;
    private int maxHumidity;
    private int maxPressure;

    private int minTemperature;
    private int minHumidity;
    private int minPressure;

    public MinMaxDisplay(Subject weatherData) {
        this.maxTemperature = -1;
        this.maxHumidity = -1;
        this.maxPressure = -1;

        this.minTemperature = Integer.MAX_VALUE;
        this.minHumidity = Integer.MAX_VALUE;
        this.minPressure = Integer.MAX_VALUE;

        weatherData.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        this.maxTemperature = Math.max(this.maxTemperature, temperature);
        this.maxHumidity = Math.max(this.maxHumidity, humidity);
        this.maxPressure = Math.max(this.maxPressure, pressure);

        this.minTemperature = Math.min(this.minTemperature, temperature);
        this.minHumidity = Math.min(this.minHumidity, humidity);
        this.minPressure = Math.min(this.minPressure, pressure);

        display();
    }

    public void display() {
        // Display Temperature
        System.out.printf(
                "Min/Max Temperature: %s/%s, ",
                getValidReading(this.minTemperature),
                getValidReading(this.maxTemperature));

        // Display Humidity
        System.out.printf("Min/Max Humidity: %s/%s, ",
                getValidReading(this.minHumidity),
                getValidReading(this.maxHumidity));

        // Display Pressure
        System.out.printf("Min/Max Pressure: %s/%s\n",
                getValidReading(this.minPressure),
                getValidReading(this.maxPressure));
    }

    @Override
    public String getName() {
        return "Min-Max display";
    }

    @Override
    public boolean equals(Observer observer) {
        return this.getName().equals(observer.getName());
    }

    private static String getValidReading(int reading) {
        if (reading == -1) return "NA";
        if (reading == Integer.MAX_VALUE) return "NA";
        return String.valueOf(reading);
    }
}
