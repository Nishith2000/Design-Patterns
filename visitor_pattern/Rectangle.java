package org.design_pattern.visitor_pattern;

public class Rectangle implements Shape {
    private int id;
    private int x, y, width, height;

    public Rectangle(int id, int x, int y, int width, int height) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.width  = width;
        this.height = height;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        // draw the rectangle on screen
    }

    @Override
    public void accept(Visitor v) {
        v.visitRectangle(this);
    }

    // Getters for visitor
    public int getId()     { return id; }
    public int getX()      { return x; }
    public int getY()      { return y; }
    public int getWidth()  { return width; }
    public int getHeight() { return height; }
}
