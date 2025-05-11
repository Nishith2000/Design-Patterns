package org.design_pattern.strategy_pattern;

public class MallardDuck extends Duck {

    public MallardDuck(FlyingBehaviour flyingBehaviour) {
        super(flyingBehaviour);
    }

    @Override
    public void display() {
        System.out.println("This is Mallard duck.");
    }

    @Override
    public void performFlying() {
        super.performFlying();
    }
}
