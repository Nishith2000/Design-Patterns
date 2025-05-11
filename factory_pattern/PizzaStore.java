package org.design_pattern.factory_pattern;

public abstract class PizzaStore {

    public final void preparePizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        System.out.println("Prepared Pizza with: ");
        System.out.println(pizza.getDough());
        System.out.println(pizza.getSauce());
        System.out.println(pizza.getToppings());
    }

    public abstract Pizza createPizza(PizzaType type);
}
