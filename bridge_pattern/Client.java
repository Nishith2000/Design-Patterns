package org.design_pattern.bridge_pattern;

public class Client {

    public static void main(String[] args) {
        Shape blueCircle = new Circle(new Blue());
        System.out.println(blueCircle.getShape());
    }
}
