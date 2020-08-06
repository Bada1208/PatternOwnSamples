package com.patterns.structural.flyweight;

public class Cooker implements Worker {
    @Override
    public void doWork() {
        System.out.println("Cooker do his work");
    }
}
