package com.patterns.structural.flyweight;

public class Driver implements Worker {
    @Override
    public void doWork() {
        System.out.println("Driver do his work");
    }
}
