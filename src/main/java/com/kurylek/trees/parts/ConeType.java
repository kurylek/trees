package com.kurylek.trees.parts;

public enum ConeType {
    LONG("long"),
    SHORT("short"),
    TINY("tiny");

    private final String coneType;

    ConeType(String coneType) {
        this.coneType = coneType;
    }

    @Override
    public String toString() {
        return coneType;
    }
}
