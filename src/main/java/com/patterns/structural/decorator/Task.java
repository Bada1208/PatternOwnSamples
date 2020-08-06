package com.patterns.structural.decorator;

public class Task {
    public static void main(String[] args) {
        Worker worker = new ExperiencedDriver(new Driver());
        System.out.println(worker.makeJob());
    }
}
