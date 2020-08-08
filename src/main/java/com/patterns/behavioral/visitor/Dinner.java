package com.patterns.behavioral.visitor;

public class Dinner implements Meal {
    @Override
    public void beEaten(Human human) {
        human.eat(this);
    }
}
