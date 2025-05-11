package org.design_pattern.composite_pattern;

public class Client {

    public static void main(String[] args) {
        MenuComponent menuItem1 = new MenuItem("Chicken Fried Rice", "Well Cooked Chicken Fried Rice");
        MenuComponent menuItem2 = new MenuItem("General Tso Chicken", "Well Cooked General Tso Chicken");
        MenuComponent menuItem3 = new MenuItem("Smoked Chilli Sauce", "Well Seasoned Smoked Chilli Sauce");
        MenuComponent menuItem4 = new MenuItem("Ice cream", "Fresh and cold Ice cream");

        MenuComponent dessertMenu = new Menu(new MenuComponent[] { menuItem4 });

        MenuComponent menu = new Menu(new MenuComponent[]{ menuItem1, menuItem2, menuItem3, dessertMenu});

        menu.printMenu();
    }
}
