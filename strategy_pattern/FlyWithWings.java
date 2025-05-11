package org.design_pattern.strategy_pattern;

public class FlyWithWings implements FlyingBehaviour {

    @Override
    public void fly() {
        System.out.println("Flying high above with wings!!!");
    }
}
