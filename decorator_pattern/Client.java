package org.design_pattern.decorator_pattern;

public class Client {

    public static void main(String[] args) {
        Coffee coffee = new BlackCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new WhippedCreamDecorator(coffee);
        System.out.println(coffee);
    }
}
