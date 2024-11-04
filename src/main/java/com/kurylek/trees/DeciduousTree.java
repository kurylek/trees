package com.kurylek.trees;

public class DeciduousTree extends Tree {

    private boolean hasEdibleFruits;

    public DeciduousTree(String trunk, String branches, String leaves, boolean hasEdibleFruits) {
        super(trunk, branches, leaves);
        this.hasEdibleFruits = hasEdibleFruits;
    }

    @Override
    public void grow() {
        System.out.println("Deciduous tree is growing!");
    }

    public boolean hasEdibleFruits() {
        return hasEdibleFruits;
    }
}
