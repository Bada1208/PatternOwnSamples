package com.patterns.behavioral.state;

public class StateDemo {
    public static void main(String[] args) {
        PlayContext playContext = new PlayContext();
        ChangeState radioOn = new LaunchRadio();
        ChangeState firstChannel = new FirstRadioChannel();
        ChangeState secondChannel = new SecondRadioChannel();
        ChangeState radioOff = new OffRadio();
        playContext.setState(radioOn);
        playContext.doAction();
        playContext.setState(firstChannel);
        playContext.doAction();
        playContext.setState(secondChannel);
        playContext.doAction();
        playContext.setState(radioOff);
        playContext.doAction();
    }
}








