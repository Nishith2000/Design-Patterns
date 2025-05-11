package org.design_pattern.visitor_pattern;

public class Dot implements Shape {
    private int id;
    private int x, y;

    public Dot(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        // draw the dot on screen
    }

    @Override
    public void accept(Visitor v) {
        v.visitDot(this);
    }

    // Getters for visitor
    public int getId() { return id; }
    public int getX()  { return x; }
    public int getY()  { return y; }
}

