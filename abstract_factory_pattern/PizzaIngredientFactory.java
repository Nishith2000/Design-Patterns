package org.design_pattern.abstract_factory_pattern;

public interface PizzaIngredientFactory {

    Dough createDough();
    Cheese createCheese();
    Sauce createSauce();
}
