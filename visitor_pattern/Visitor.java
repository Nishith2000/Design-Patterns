package org.design_pattern.visitor_pattern;

public interface Visitor {
    void visitDot(Dot d);
    void visitCircle(Circle c);
    void visitRectangle(Rectangle r);
}
