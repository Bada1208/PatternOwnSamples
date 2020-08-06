package com.patterns.structural.composite;

public class CircusPerformance {
    public static void main(String[] args) {
        Circus circus = new Circus();
        Bear firstBear = new Bear();
        Bear secondBear = new Bear();
        Tiger tiger = new Tiger();
        circus.addAnimal(firstBear);
        circus.addAnimal(secondBear);
        circus.addAnimal(tiger);
        circus.createCircus();
    }
}
