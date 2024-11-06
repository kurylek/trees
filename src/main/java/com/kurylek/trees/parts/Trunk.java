package com.kurylek.trees.parts;

public class Trunk {
    private int diameter;

    public Trunk(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void grow() {
        diameter+=10;
    }
}
