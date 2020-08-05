package com.patterns.structural.bridge;

class Reptile extends Animal {
    public Reptile(Type type) {
        super(type);
    }

    void showType() {
        System.out.println("Reptile");
    }
}