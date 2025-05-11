package org.design_pattern.abstract_factory_pattern;

public abstract class Cheese {

    private final String name;

    public Cheese(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
