package org.design_pattern.strategy_pattern;

public abstract class Duck {

    private FlyingBehaviour flyingBehaviour;

    public Duck(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    public abstract void display();

    public void performFlying() {
        flyingBehaviour.fly();
    }

    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }
}
