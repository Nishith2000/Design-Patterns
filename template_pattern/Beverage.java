package org.design_pattern.template_pattern;

import java.util.Iterator;

public abstract class Beverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments(); // hook method
    }

    private void boilWater() {
        Iterator iterator;
        System.out.println("Boil Water");
    }

    private void pourInCup() {
        System.out.println("Pour in cup");
    }

    public abstract void brew();

    public void addCondiments() {}
}
