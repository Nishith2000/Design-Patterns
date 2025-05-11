package org.design_pattern.builder_pattern;

// Product 1
public class Car {
    private int seats;
    private Engine engine;
    private boolean hasTripComputer;
    private boolean hasGPS;

    public void setSeats(int seats) {
        this.seats = seats;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void setTripComputer(boolean hasTripComputer) {
        this.hasTripComputer = hasTripComputer;
    }
    public void setGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    @Override
    public String toString() {
        return "Car [seats=" + seats
                + ", engine=" + engine.getType()
                + ", tripComputer=" + hasTripComputer
                + ", GPS=" + hasGPS + "]";
    }
}
