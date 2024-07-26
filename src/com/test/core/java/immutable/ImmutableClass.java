package com.test.core.java.immutable;

public final class ImmutableClass {

    private final String name;
    private final int age;
    private final Address address;
    public ImmutableClass(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = new Address(address.getAddress(), address.getCity(), address.getState());
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Address getAddress() {
        //return new Address(address.getAddress(), address.getCity(), address.getState());
        return address;
    }

    public static void main(String[] args) {
        Address address1 = new Address("address1", "hyd", "TN");
        ImmutableClass immutableClass = new ImmutableClass("ram", 30, address1);
        System.out.println("Print address before change : " + immutableClass.getAddress());

        address1.setAddress("address2");
        address1.setCity("hyd2");
        address1.setState("TN2");

        System.out.println("Print address after change : " + immutableClass.getAddress());
    }
}
