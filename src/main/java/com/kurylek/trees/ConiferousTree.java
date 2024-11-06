package com.kurylek.trees;


import com.kurylek.trees.parts.Cone;
import com.kurylek.trees.parts.ConeType;
import com.kurylek.trees.parts.NeedleLeaf;

public class ConiferousTree extends Tree {

    private final Cone cone;

    public ConiferousTree(String name, int trunkDiameter, int branchesCount, int numberOfNeedlesInBundle,
                          ConeType coneType) {
        super(name, trunkDiameter, branchesCount, new NeedleLeaf(numberOfNeedlesInBundle));
        this.cone = new Cone(coneType);
    }

    @Override
    public String toString() {
        return String.format("%s, and its cones are %s", super.toString(), cone.getConeType().toString());
    }
}
