package org.design_pattern.abstract_factory_pattern;

public abstract class Pizza {

    private final String name;
    private final Dough dough;
    private final Cheese cheese;
    private final Sauce sauce;

    public Pizza(String name, PizzaIngredientFactory ingredientFactory) {
        this.name = name;
        this.dough = ingredientFactory.createDough();
        this.cheese = ingredientFactory.createCheese();
        this.sauce = ingredientFactory.createSauce();
    }

    @Override
    public String toString() {
        return name + ", " + dough.getName() + ", " + cheese.getName() + ", " + sauce.getName();
    }
}
