package org.design_pattern.composite_pattern;

public class MenuItem implements MenuComponent {

    private final String name;
    private final String description;

    public MenuItem(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void printMenu() {
        System.out.println(name + ": " + description);
    }
}
