package org.design_pattern.strategy_pattern;

public class Client {

    public static void main(String[] args) {
        // Instantiate mallard duck
        System.out.println("--------------------");
        FlyingBehaviour flyWithWings = new FlyWithWings();
        Duck mallardDuck = new MallardDuck(flyWithWings);
        mallardDuck.display();
        mallardDuck.performFlying();

        // Instantiate rubber duck
        System.out.println("--------------------");
        FlyingBehaviour noFlying = new NoFly();
        Duck rubberDucky = new RubberDuck(noFlying);
        rubberDucky.display();
        rubberDucky.performFlying();

        // Change flying behaviour dynamically
        // Mallard duck temporarily injured - cannot fly
        System.out.println("--------------------");
        System.out.println("Mallard Duck Injured !!!");
        mallardDuck.setFlyingBehaviour(noFlying);
        mallardDuck.performFlying();
    }
}
