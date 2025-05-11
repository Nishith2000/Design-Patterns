package org.design_pattern.iterator_pattern;

import java.util.Iterator;

public class Client {

    public static void main(String[] args) {
        Menu breakfastMenu = new BreakfastMenu();
        for (Iterator<MenuItem> it = breakfastMenu.createIterator(); it.hasNext(); ) {
            MenuItem menuItem = it.next();
            System.out.println(menuItem);
        }
    }
}
