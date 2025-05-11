package org.design_pattern.observer_pattern;

public class Client {

    public static void main(String[] args) {
        // Instantiate Subject
        WeatherData weatherData = new WeatherData();

        // Instantiate Observers
        MinMaxDisplay minMaxDisplay = new MinMaxDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        // Simulate changing weather conditions
        weatherData.measurementsChanged(10,10, 1);
        weatherData.measurementsChanged(36,15, 3);
        weatherData.measurementsChanged(25,12, 2);
        weatherData.measurementsChanged(15,11, 1);

        //display
        minMaxDisplay.display();
        currentConditionsDisplay.display();
    }
}
