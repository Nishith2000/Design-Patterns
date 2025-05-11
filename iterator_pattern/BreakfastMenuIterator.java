package org.design_pattern.iterator_pattern;

import java.util.Iterator;

public class BreakfastMenuIterator implements Iterator<MenuItem> {

    private int index = 0;
    private final MenuItem[] menuItems;

    public BreakfastMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return index < menuItems.length && menuItems[index] != null;
    }

    @Override
    public MenuItem next() {
        return menuItems[index++];
    }
}
