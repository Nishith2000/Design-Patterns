package org.design_pattern.simple_builder_pattern;

public class Client {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza.Builder().setShouldAddChicken().setShouldAddCapsicums().build();
        System.out.println(pizza1.toString());

        Pizza pizza2 = new Pizza.Builder().setShouldAddTomatoes().setShouldAddPeperoni().build();
        System.out.println(pizza2.toString());
    }
}
