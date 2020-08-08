package com.patterns.behavioral.memento;

public class MementoDemo {
    public static void main(String[] args) {
        Signal signal = new Signal();
        signal.setState("dzzzzz");
        signal.printState();

        MasterOfHouse master = new MasterOfHouse();
        master.setMemento(signal.createSignal());
        signal.setState("signal was off");
        signal.printState();

    }
}
