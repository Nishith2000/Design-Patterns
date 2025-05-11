package org.design_pattern.prototype_pattern;

// A nested object that needs deep-copy logic
public class Address implements ProtoType<Address> {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    // Copy-constructor approach
    private Address(Address other) {
        this.street = other.street;
        this.city   = other.city;
    }

    @Override
    public Address clonePrototype() {
        // Manually deep-copy each field (Strings are immutable, so direct copy is fine)
        return new Address(this);
    }

    // getters & setters
    public String getStreet() { return street; }
    public void   setStreet(String s) { street = s; }
    public String getCity()   { return city; }
    public void   setCity(String c) { city = c; }

    @Override
    public String toString() {
        return street + ", " + city;
    }
}
