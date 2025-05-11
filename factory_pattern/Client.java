package org.design_pattern.factory_pattern;

public class Client {

    public static void main(String[] args) {
        PizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
        newYorkPizzaStore.preparePizza(PizzaType.CHEESE);
        System.out.println();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.preparePizza(PizzaType.CHEESE);
    }
}
