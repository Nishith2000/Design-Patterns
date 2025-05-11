package org.design_pattern.factory_pattern;

public class NewYorkPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaType type) {
        return switch (type) {
            case CHEESE -> new NewYorkCheesePizza();
            case VEGGIE -> new NewYorkVeggiePizza();
        };
    }
}
