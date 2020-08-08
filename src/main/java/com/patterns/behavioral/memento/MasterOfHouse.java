package com.patterns.behavioral.memento;

public class MasterOfHouse {
    private SignalMemento memento;

    public SignalMemento getMemento() {
        return memento;
    }

    public void setMemento(SignalMemento newMemento) {
        memento = newMemento;
    }
}
