package org.softwaretechnologies.animals;

public abstract class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "woof";
    }
}
