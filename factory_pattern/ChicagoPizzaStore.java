package org.design_pattern.factory_pattern;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaType type) {
        return switch (type) {
            case CHEESE -> new ChicagoCheesePizza();
            case VEGGIE -> new ChicagoVeggiePizza();
        };
    }
}
