package com.patterns.behavioral.memento;

public class SignalMemento {

    private String state;

    public SignalMemento(String newState) {
        state = newState;
    }

    public String getState() {
        return state;
    }

}
