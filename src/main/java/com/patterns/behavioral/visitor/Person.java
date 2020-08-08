package com.patterns.behavioral.visitor;

public class Person implements Human {
    @Override
    public void eat(Breakfast breakfast) {
        System.out.println("person eats breakfast");
    }

    @Override
    public void eat(Dinner dinner) {
        System.out.println("person eats dinner");
    }

    @Override
    public void eat(Supper supper) {
        System.out.println("person eats supper");
    }
}
