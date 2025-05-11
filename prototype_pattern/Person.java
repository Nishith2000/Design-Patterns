package org.design_pattern.prototype_pattern;

// The top-level object containing the nested Address
public class Person implements ProtoType<Person> {
    private String  name;
    private Address address;

    public Person(String name, Address address) {
        this.name    = name;
        this.address = address;
    }

    // Copy-constructor that performs deep copy
    private Person(Person other) {
        this.name    = other.name;
        this.address = other.address.clonePrototype();
    }

    @Override
    public Person clonePrototype() {
        // Use our copy-constructor to get a fully independent object graph
        return new Person(this);
    }

    // getters & setters
    public String  getName()    { return name; }
    public void    setName(String n)     { name = n; }
    public Address getAddress() { return address; }
    public void    setAddress(Address a) { address = a; }

    @Override
    public String toString() {
        return name + " lives at " + address;
    }
}

