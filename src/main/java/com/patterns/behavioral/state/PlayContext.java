package com.patterns.behavioral.state;

public class PlayContext implements ChangeState {
    private ChangeState state;

    public void setState(ChangeState state) {
        this.state = state;
    }

    public void changeFunction() {
        if (state instanceof OffRadio) {
            setState(new LaunchRadio());
        } else if (state instanceof LaunchRadio) {
            setState(new FirstRadioChannel());
        } else if (state instanceof FirstRadioChannel) {
            setState(new SecondRadioChannel());
        } else if (state instanceof SecondRadioChannel) {
            setState(new OffRadio());
        }
    }

    public void doAction() {
        this.state.doAction();
    }
}
