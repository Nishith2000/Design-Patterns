package org.design_pattern.builder_pattern;

public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        reset();
    }

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int number) {
        car.setSeats(number);
    }

    @Override
    public void setEngine(Engine engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        car.setTripComputer(hasTripComputer);
    }

    @Override
    public void setGPS(boolean hasGPS) {
        car.setGPS(hasGPS);
    }

    public Car build() {
        Car product = this.car;
        reset();
        return product;
    }
}
