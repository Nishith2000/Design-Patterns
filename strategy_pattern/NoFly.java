package org.design_pattern.strategy_pattern;

public class NoFly implements FlyingBehaviour {

    @Override
    public void fly() {
        System.out.println("Cannot fly!!!");
    }
}
