package org.design_pattern.decorator_pattern;

public class WhippedCreamDecorator implements CoffeeDecorator {

    private static final int COST = 25;
    private final Coffee coffee;

    public WhippedCreamDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return coffee.cost() + 10;
    }

    @Override
    public String toString() {
        return String.format("%s, with whipped cream - Rs %s", coffee.toString(), COST);
    }
}
