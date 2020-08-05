package com.patterns.creational.prototype;

public class App {
    public static void main(String[] args) {
        Developer developer = new Developer(23, "Bank", "some code");
        System.out.println(developer);

        DeveloperFactory factory = new DeveloperFactory(developer);
        Developer developerClone = factory.cloneDeveloper();
        System.out.println(developerClone);
    }
}
