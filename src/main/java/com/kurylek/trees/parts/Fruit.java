package com.kurylek.trees.parts;

public class Fruit {
    private final String name;
    private final boolean isEdible;

    public Fruit(String name, boolean isEdible) {
        this.name = name;
        this.isEdible = isEdible;
    }

    @Override
    public String toString() {
        return String.format("%s, you %s it", name, (isEdible ? "can" : "can't"));
    }
}
