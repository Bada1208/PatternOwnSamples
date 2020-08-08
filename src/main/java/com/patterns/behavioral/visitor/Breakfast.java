package com.patterns.behavioral.visitor;

public class Breakfast implements Meal{
    @Override
    public void beEaten(Human human) {
        human.eat(this);
    }
}
