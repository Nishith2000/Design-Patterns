package org.design_pattern.abstract_factory_pattern;

public class Client {

    public static void main(String[] args) {
        PizzaIngredientFactory newYorkPizzaIngredient = new NewYorkPizzaIngredient();
        Pizza newYorkCheesePizza = new CheesePizza(newYorkPizzaIngredient);
        System.out.println(newYorkCheesePizza);

        System.out.println("---------------");

        PizzaIngredientFactory chicagoPizzaIngredient = new ChicagoPizzaIngredient();
        Pizza chicagoCheesePizza = new CheesePizza(chicagoPizzaIngredient);
        System.out.println(chicagoCheesePizza);
    }
}
