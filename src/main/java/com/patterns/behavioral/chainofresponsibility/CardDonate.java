package com.patterns.behavioral.chainofresponsibility;

public class CardDonate implements Donate{
    private Donate donate;

    public void setNext(Donate donate) {
        this.donate = donate;
    }

    public void pay() {
        System.out.println("Card donate");
    }
}
