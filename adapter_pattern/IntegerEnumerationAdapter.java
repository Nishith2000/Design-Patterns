package org.design_pattern.adapter_pattern;

import java.util.Iterator;

public class IntegerEnumerationAdapter implements IntegerIterator {

    private final IntegerEnumeration integerEnumeration;

    public IntegerEnumerationAdapter(IntegerEnumeration integerEnumeration) {
        this.integerEnumeration = integerEnumeration;
    }

    @Override
    public Integer next() {
        return integerEnumeration.nextElement();
    }

    @Override
    public boolean hasNext() {
        return integerEnumeration.hasMoreElements();
    }
}
