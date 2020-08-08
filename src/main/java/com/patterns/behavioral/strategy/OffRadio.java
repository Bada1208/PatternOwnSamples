package com.patterns.behavioral.strategy;

public class OffRadio implements ChangeState {
    @Override
    public void doAction() {
        System.out.println("Radio was off");
    }
}
