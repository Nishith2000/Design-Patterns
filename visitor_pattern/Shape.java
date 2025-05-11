package org.design_pattern.visitor_pattern;

public interface Shape {
    void move(int x, int y);
    void draw();
    void accept(Visitor v);
}