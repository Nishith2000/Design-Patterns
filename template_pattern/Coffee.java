package org.design_pattern.template_pattern;

public class Coffee extends Beverage {

    @Override
    public void brew() {
        System.out.println("Add coffee powder");
    }

    @Override
    public void addCondiments() {
        System.out.println("Top with whip cream");
    }
}
