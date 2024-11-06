package com.kurylek;

import com.kurylek.trees.ConiferousTree;
import com.kurylek.trees.DeciduousTree;
import com.kurylek.trees.Forest;
import com.kurylek.trees.parts.Branch;
import com.kurylek.trees.parts.Fruit;
import com.kurylek.trees.parts.Trunk;
import java.util.ArrayList;
import java.util.List;

import static com.kurylek.trees.parts.ConeType.SHORT;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(new DeciduousTree("Oak", 3, 3,
                new Fruit("Acorn", false), "spirally arranged"));
        forest.plantTree(new ConiferousTree("Pinus cembra", 1, 5, 5, SHORT));

        forest.lookAround();
        forest.waterTrees();
        forest.lookAround();
    }
}