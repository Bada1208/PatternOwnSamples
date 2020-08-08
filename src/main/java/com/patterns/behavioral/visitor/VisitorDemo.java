package com.patterns.behavioral.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        Nutrition nutrition = new Nutrition();
        Human person = new Person();
        nutrition.beEaten(person);
    }
}
