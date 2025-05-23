package org.design_pattern.iterator_pattern;

import java.util.Iterator;

public interface Menu {

    Iterator<MenuItem> createIterator();
}
