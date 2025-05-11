package org.design_pattern.adapter_pattern;

public class Client {

    public static void main(String[] args) {
        // enumeration
        IntegerEnumeration integerEnumeration = new IntegerEnumerationConcrete();

        // create adapter
        IntegerEnumerationAdapter enumerationAdapter = new IntegerEnumerationAdapter(integerEnumeration);

        // now use as iterator
        while (enumerationAdapter.hasNext()) {
            System.out.println(enumerationAdapter.next());
        }
    }
}
