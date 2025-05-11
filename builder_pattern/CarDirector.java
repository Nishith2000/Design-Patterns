package org.design_pattern.builder_pattern;

public class CarDirector {
    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new SportsEngine());
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void constructSUV(Builder builder) {
        builder.reset();
        builder.setSeats(5);
        builder.setEngine(new SUVEngine());
        builder.setTripComputer(false);
        builder.setGPS(true);
    }
}