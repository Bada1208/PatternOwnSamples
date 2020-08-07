package com.patterns.behavioral.chainofresponsibility;

public interface Donate {
    void setNext(Donate donate);

    void pay();
}
