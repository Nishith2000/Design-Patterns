package org.design_pattern.abstract_factory_pattern;

public abstract class Sauce {

    private final String name;

    public Sauce(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
