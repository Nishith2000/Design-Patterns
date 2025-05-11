package org.design_pattern.strategy_pattern;

public class RubberDuck extends Duck {

    public RubberDuck(FlyingBehaviour flyingBehaviour) {
        super(flyingBehaviour);
    }

    @Override
    public void display() {
        System.out.println("This is a rubber duck.");
    }
}
