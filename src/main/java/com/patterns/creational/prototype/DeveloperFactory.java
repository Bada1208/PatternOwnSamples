package com.patterns.creational.prototype;

public class DeveloperFactory {
    Developer developer;

    public DeveloperFactory(Developer developer) {
        this.developer = developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    Developer cloneDeveloper() {
        return (Developer) developer.copy();
    }
}
