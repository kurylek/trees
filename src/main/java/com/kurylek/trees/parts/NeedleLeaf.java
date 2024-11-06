package com.kurylek.trees.parts;

public class NeedleLeaf extends Leaf {
    private final int numberOfNeedlesInBundle;

    public NeedleLeaf(int numberOfNeedlesInBundle) {
        this.numberOfNeedlesInBundle = numberOfNeedlesInBundle;
    }

    @Override
    public String toString() {
        return String.format("it has %d needles in bundle", numberOfNeedlesInBundle);
    }
}
