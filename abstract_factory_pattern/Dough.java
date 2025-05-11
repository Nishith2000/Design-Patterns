package org.design_pattern.abstract_factory_pattern;

public abstract class Dough {

    private final String name;

    public Dough(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
