package com.patterns.structural.bridge;

public class AppBridge {
    public static void main(String[] args) {
        Animal animal = new Mammal(new Cat());

        animal.typeOfAnimal();
    }
}