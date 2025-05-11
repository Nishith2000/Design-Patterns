package org.design_pattern.builder_pattern;

// Concrete Builder for Manual
public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        reset();
    }

    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setSeats(int number) {
        manual.addSection("Seats: This car has " + number + " seats.");
    }

    @Override
    public void setEngine(Engine engine) {
        manual.addSection("Engine: " + engine.getType() + " installed.");
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        manual.addSection("Trip Computer: " +
                (hasTripComputer ? "Included." : "Not included."));
    }

    @Override
    public void setGPS(boolean hasGPS) {
        manual.addSection("GPS: " +
                (hasGPS ? "Included." : "Not included."));
    }

    // Not part of the Builder interface:
    public Manual build() {
        Manual product = this.manual;
        reset();
        return product;
    }
}