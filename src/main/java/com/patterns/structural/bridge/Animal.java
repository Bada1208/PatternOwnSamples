package com.patterns.structural.bridge;



abstract class Animal {
    Type type;

    public Animal(Type type) {
        this.type = type;
    }

    abstract void showType();

    void typeOfAnimal() {
        showType();
        type.setType();
    }
}











