package com.kurylek.trees;

public abstract class Tree {
    private String trunk;
    private String branches;
    private String leaves;

    public Tree(String trunk, String branches, String leaves) {
        this.trunk = trunk;
        this.branches = branches;
        this.leaves = leaves;
    }

    public abstract void grow();

    public String getTrunk() {
        return trunk;
    }

    public String getBranches() {
        return branches;
    }

    public String getLeaves() {
        return leaves;
    }
}
