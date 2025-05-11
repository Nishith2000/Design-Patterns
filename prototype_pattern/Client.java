package org.design_pattern.prototype_pattern;

public class Client {

    public static void main(String[] args) {
        Address addr     = new Address("123 Main St", "Springfield");
        Person  original = new Person("Alice", addr);

        // Clone the person (deep copy)
        Person cloned = original.clonePrototype();

        // Mutate the clone's address
        cloned.getAddress().setCity("Shelbyville");
        cloned.setName("Alice Clone");

        // Show that original is completely unaffected
        System.out.println("Original: " + original);
        System.out.println("Cloned:   " + cloned);
    }
}
