package com.company.animals;

public class Pet extends Animal{
    String owner;

    public Pet(String name, double weight, String colour, String owner) {
        super(name, weight, colour);
        this.owner = owner;
    }
}
