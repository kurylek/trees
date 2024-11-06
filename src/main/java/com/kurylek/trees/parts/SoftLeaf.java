package com.kurylek.trees.parts;

public class SoftLeaf extends Leaf {
    private final String shape;

    public SoftLeaf(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return String.format("its leaf has %s shape", shape);
    }
}
