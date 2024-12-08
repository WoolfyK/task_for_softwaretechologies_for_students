package org.softwaretechnologies.animals;

public abstract class Cow extends Animal{
    public Cow(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "moo";
    }
}
