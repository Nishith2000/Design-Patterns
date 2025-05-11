package org.design_pattern.template_pattern;

public class Client {

    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        Beverage tea = new Tea();

        // prepare coffee
        coffee.prepareRecipe();

        System.out.println("-----------------");

        // prepare tea
        tea.prepareRecipe();
    }
}
