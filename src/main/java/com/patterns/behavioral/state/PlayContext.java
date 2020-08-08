package com.patterns.behavioral.state;

public class PlayContext implements ChangeState {
    private ChangeState state;

    public void setState(ChangeState state) {
        this.state = state;
    }

    public void doAction() {
        this.state.doAction();
    }
}
