package com.patterns.behavioral.visitor;

public class Nutrition implements Meal {
    Meal[] meals;

    public Nutrition() {
        this.meals = new Meal[]{
                new Breakfast(),
                new Dinner(),
                new Supper()
        };
    }

    @Override
    public void beEaten(Human human) {
        for (Meal m : meals) {
            m.beEaten(human);
        }
    }
}
