package org.design_pattern.decorator_pattern;

public class MilkDecorator implements CoffeeDecorator {

    private static final int COST = 25;
    private final Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return coffee.cost() + COST;
    }

    @Override
    public String toString() {
        return String.format("%s, with milk - Rs %s", coffee.toString(), COST);
    }
}
