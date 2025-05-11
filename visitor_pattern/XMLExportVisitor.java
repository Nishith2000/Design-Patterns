package org.design_pattern.visitor_pattern;

public class XMLExportVisitor implements Visitor {

    @Override
    public void visitDot(Dot d) {
        System.out.printf(
                "<dot id=\"%d\" x=\"%d\" y=\"%d\" />%n",
                d.getId(), d.getX(), d.getY()
        );
    }

    @Override
    public void visitCircle(Circle c) {
        System.out.printf(
                "<circle id=\"%d\" x=\"%d\" y=\"%d\" radius=\"%d\" />%n",
                c.getId(), c.getX(), c.getY(), c.getRadius()
        );
    }

    @Override
    public void visitRectangle(Rectangle r) {
        System.out.printf(
                "<rectangle id=\"%d\" x=\"%d\" y=\"%d\" width=\"%d\" height=\"%d\" />%n",
                r.getId(), r.getX(), r.getY(), r.getWidth(), r.getHeight()
        );
    }
}
