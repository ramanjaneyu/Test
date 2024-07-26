package com.test.design.builder;

import lombok.ToString;

@ToString
public class PersonBuilder {
    private final String firstName;
    private final String lastName;
    private final int salary;
    private final int age;
    private final String address;
    private final String designation;

    public static class Builder{
        private String firstName;
        private String lastName;
        private int salary;
        private int age;
        private String address;
        private String designation;

        //builder methods for setting properties
        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public Builder salary(int salary){
            this.salary = salary;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder address(String address){
            this.address = address;
            return this;
        }
        public Builder designation(String designation){
            this.designation = designation;
            return this;
        }
        public PersonBuilder build(){
            return new PersonBuilder(this);
        }
    }
    private PersonBuilder(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.salary = builder.salary;
        this.age = builder.age;
        this.address = builder.address;
        this.designation = builder.designation;
    }
    public static void main(String[] args) {
        PersonBuilder person = new Builder()
                .firstName("Raman")
                .designation("Team Lead")
                .address("Kukatpally")
                .build();
        System.out.println("Print builder class : " + person);
    }
}
