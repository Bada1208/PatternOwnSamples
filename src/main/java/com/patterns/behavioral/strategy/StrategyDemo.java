package com.patterns.behavioral.strategy;


public class StrategyDemo {
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







