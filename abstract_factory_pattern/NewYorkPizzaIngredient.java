package org.design_pattern.abstract_factory_pattern;

public class NewYorkPizzaIngredient implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
