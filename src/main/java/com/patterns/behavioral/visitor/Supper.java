package com.patterns.behavioral.visitor;

public class Supper implements Meal {
    @Override
    public void beEaten(Human human) {
        human.eat(this);
    }
}
