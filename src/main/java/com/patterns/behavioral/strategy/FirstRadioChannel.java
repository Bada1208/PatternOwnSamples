package com.patterns.behavioral.strategy;


public class FirstRadioChannel implements ChangeState {
    public void doAction() {
        System.out.println("1 radio channel is playing");
    }
}