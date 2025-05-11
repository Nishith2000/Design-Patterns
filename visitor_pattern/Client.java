package org.design_pattern.visitor_pattern;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        Dot dot = new Dot(1, 10, 20);
        Circle circle = new Circle(2, 15, 25, 5);
        Rectangle rect = new Rectangle(3, 5, 5, 20, 10);

        shapes.add(dot);
        shapes.add(circle);
        shapes.add(rect);

        Visitor exportVisitor = new XMLExportVisitor();
        for (Shape shape : shapes) {
            shape.accept(exportVisitor);
        }
    }
}
