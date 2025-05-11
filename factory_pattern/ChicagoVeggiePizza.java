package org.design_pattern.factory_pattern;

public class ChicagoVeggiePizza implements Pizza {

    @Override
    public String getDough() {
        return "Chicago made dough for deep dish pizza";
    }

    @Override
    public String getSauce() {
        return "Chicago made rich tomato sauce";
    }

    @Override
    public String getToppings() {
        return "Mozzarella Cheese and fresh sauted vegetables like tomatoes, onions and capsicums";
    }
}
