package com.kurylek.trees;

import com.kurylek.trees.parts.Fruit;
import com.kurylek.trees.parts.SoftLeaf;

public class DeciduousTree extends Tree {

    private final Fruit fruit;

    public DeciduousTree(String name, int trunkDiameter, int branchesCount, Fruit fruit, String leafShape) {
        super(name, trunkDiameter, branchesCount, new SoftLeaf(leafShape));
        this.fruit = fruit;
    }

    @Override
    public String toString() {
        return String.format("%s, and its fruit is called %s", super.toString(), fruit.toString());
    }
}
