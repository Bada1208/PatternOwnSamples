package com.patterns.behavioral.memento;

public class Signal {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String newState) {
        state = newState;
    }

    public SignalMemento createSignal() {
        return new SignalMemento(state);
    }

    public void setMemento(SignalMemento memento) {
        state = memento.getState();
    }

    public void printState(){
        System.out.println(state);
    }
}
