package com.kurylek.trees;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private final List<Tree> trees;

    public Forest() {
        this.trees = new ArrayList<>();
    }

    public void plantTree(Tree tree) {
        printSpacing();
        System.out.printf("You planted new %s tree!\n", tree.getName());
        trees.add(tree);
        printSpacing();
    }

    public void waterTrees() {
        printSpacing();
        System.out.println("You are watering forest..");
        trees.forEach(tree -> tree.grow());
        printSpacing();
    }

    public void lookAround() {
        printSpacing();
        System.out.println("You look around forest and look at trees..");
        trees.forEach(System.out::println);
        printSpacing();
    }

    private void printSpacing() {
        System.out.println("------");
    }
}
