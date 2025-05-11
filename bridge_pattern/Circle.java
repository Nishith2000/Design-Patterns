package org.design_pattern.bridge_pattern;

public class Circle implements Shape {

    private Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public String getShape() {
        return color.getColor() + " circle";
    }
}
