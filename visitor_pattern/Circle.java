package org.design_pattern.visitor_pattern;

public class Circle implements Shape {
    private int id;
    private int x, y, radius;

    public Circle(int id, int x, int y, int radius) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        // draw the circle on screen
    }

    @Override
    public void accept(Visitor v) {
        v.visitCircle(this);
    }

    // Getters for visitor
    public int getId()     { return id; }
    public int getX()      { return x; }
    public int getY()      { return y; }
    public int getRadius() { return radius; }
}