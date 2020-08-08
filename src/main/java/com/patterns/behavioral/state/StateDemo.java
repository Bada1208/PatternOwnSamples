package com.patterns.behavioral.state;

public class StateDemo {
    public static void main(String[] args) {
        ChangeState state = new OffRadio();
        PlayContext context = new PlayContext();
        context.setState(state);

        for (int i = 0; i < 10; i++) {
            context.doAction();
            context.changeFunction();
        }
    }
}





