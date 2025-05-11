package org.design_pattern.builder_pattern;

public class Client {

    public static void main(String[] args) {
        CarDirector carDirector = new CarDirector();

        // Build a Car
        CarBuilder carBuilder = new CarBuilder();
        carDirector.constructSportsCar(carBuilder);
        Car sportsCar = carBuilder.build();
        System.out.println(sportsCar);

        // Build its Manual
        CarManualBuilder manualBuilder = new CarManualBuilder();
        carDirector.constructSportsCar(manualBuilder);
        Manual sportsCarManual = manualBuilder.build();
        System.out.println("--- Manual ---");
        System.out.println(sportsCarManual);

        // You can also build an SUV:
        System.out.println("\nBuilding an SUV:");
        carDirector.constructSUV(carBuilder);
        Car suv = carBuilder.build();
        System.out.println(suv);
    }
}
