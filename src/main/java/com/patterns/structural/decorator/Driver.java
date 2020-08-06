package com.patterns.structural.decorator;

public class Driver implements Worker {
    @Override
    public String makeJob() {
        return "Driver do his job";
    }
}
