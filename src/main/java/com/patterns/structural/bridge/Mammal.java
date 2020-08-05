package com.patterns.structural.bridge;

class Mammal extends Animal {
    public Mammal(Type type) {
        super(type);
    }

    void showType() {
        System.out.println("Mammal");
    }
}