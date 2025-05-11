package org.design_pattern.factory_pattern;

public class NewYorkVeggiePizza implements Pizza {

    @Override
    public String getDough() {
        return "New York made dough";
    }

    @Override
    public String getSauce() {
        return "New York made rich tomato sauce";
    }

    @Override
    public String getToppings() {
        return "Mozzarella and Parmesan Cheese topped with sauted tomatoes and onions";
    }
}
