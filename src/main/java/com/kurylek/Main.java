package com.kurylek;

import com.kurylek.trees.ConiferousTree;
import com.kurylek.trees.DeciduousTree;

public class Main {
    public static void main(String[] args) {
        ConiferousTree pinusCembra = new ConiferousTree("wide", "narrow", "needles", 5);
        DeciduousTree oak = new DeciduousTree("massive", "wide", "spirally arranged", false);

        System.out.printf("Oak trunk is %s, and it has %s branches, you %s eat its fruits.\n",
                oak.getTrunk(), oak.getBranches(), oak.hasEdibleFruits() ? "can" : "can't");
        System.out.printf("Pinus Cembra trunk is %s, and it has %s branches, it has %s needles in one bundle!",
                pinusCembra.getTrunk(), pinusCembra.getBranches(), pinusCembra.getNumberOfNeedlesInBundle());
    }
}