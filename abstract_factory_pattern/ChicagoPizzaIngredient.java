package org.design_pattern.abstract_factory_pattern;

public class ChicagoPizzaIngredient implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new ParmesanCheese();
    }

    @Override
    public Sauce createSauce() {
        return new RichTomatoSauce();
    }
}
