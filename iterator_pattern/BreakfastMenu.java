package org.design_pattern.iterator_pattern;

import java.util.Iterator;

public class BreakfastMenu implements Menu {

    private static final int MAX_ITEMS = 10;
    MenuItem[] menuItems;

    public BreakfastMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];
        menuItems[0] = new MenuItem("potato salad", "tasty", 20.00, true);
        menuItems[1] = new MenuItem("Pancakes", "tasty", 25.00, true);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new BreakfastMenuIterator(menuItems);
    }
}
