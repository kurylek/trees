package com.kurylek.trees.parts;

import java.util.Random;

public class Branch {
    private double length;

    public Branch() {
        this.length = 1.0 + (2.5 - 1.0) * new Random().nextDouble();
    }

    public double getLength() {
        return length;
    }

    public void grow() {
        length += 5f;
    }
}
