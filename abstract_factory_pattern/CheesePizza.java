package org.design_pattern.abstract_factory_pattern;

public class CheesePizza extends Pizza {

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        super("Cheese Pizza", ingredientFactory);
    }
}
