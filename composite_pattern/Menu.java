package org.design_pattern.composite_pattern;

public class Menu implements MenuComponent {

    private final MenuComponent[] menuItems;

    public Menu(MenuComponent[] menuItems) {
        this.menuItems = menuItems;
    }

    public MenuComponent[] getMenuItems() {
        return menuItems;
    }

    @Override
    public void printMenu() {
        for (MenuComponent menuItem : menuItems) {
            menuItem.printMenu();
        }
    }
}
