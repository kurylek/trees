package com.kurylek.trees;

import com.kurylek.trees.parts.Branch;
import com.kurylek.trees.parts.Leaf;
import com.kurylek.trees.parts.Trunk;
import java.util.ArrayList;
import java.util.List;

public abstract class Tree {
    private final String name;
    private final Trunk trunk;
    private final List<Branch> branches;
    private final Leaf leaves;

    public Tree(String name, int trunkDiameter, int branchesCount, Leaf leaves) {
        this.name = name;
        this.trunk = new Trunk(trunkDiameter);
        this.branches = new ArrayList<>();
        this.leaves = leaves;

        growNewBranches(branchesCount);
    }

    public final void grow() {
        System.out.printf("Tree %s is growing.. \n", name);
        trunk.grow();
        branches.forEach(branch -> branch.grow());
    }

    public String getName() {
        return name;
    }

    public void growNewBranches(int count) {
        for (int i = 1; i <= count; i++) {
            branches.add(new Branch());
        }
    }

    @Override
    public String toString() {
        return String.format("This tree is called %s, its diameter equals %scm, length of all its branches" +
                        "equals %.2fcm, %s",
                name, trunk.getDiameter(), branches.stream().mapToDouble(Branch::getLength).sum(), leaves.toString());
    }
}
