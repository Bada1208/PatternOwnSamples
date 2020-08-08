package com.patterns.behavioral.state;

public class LaunchRadio implements ChangeState{
    @Override
    public void doAction() {
        System.out.println("Radio is on");
    }
}
