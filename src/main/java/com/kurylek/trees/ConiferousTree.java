package com.kurylek.trees;

public class ConiferousTree extends Tree {
    private int numberOfNeedlesInBundle;

    public ConiferousTree(String trunk, String branches, String leaves, int numberOfNeedlesInBundle) {
        super(trunk, branches, leaves);
        this.numberOfNeedlesInBundle = numberOfNeedlesInBundle;
    }

    @Override
    public void grow() {
        System.out.println("Coniferous tree is growing!");
    }

    public int getNumberOfNeedlesInBundle() {
        return numberOfNeedlesInBundle;
    }
}
