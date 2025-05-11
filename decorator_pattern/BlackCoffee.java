package org.design_pattern.decorator_pattern;

public class BlackCoffee implements Coffee {

    private static final int COST = 25;

    @Override
    public int cost() {
        return 50;
    }

    @Override
    public String toString() {
        return String.format("Black coffee - Rs %s", COST);
    }
}
