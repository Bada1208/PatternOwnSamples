package com.patterns.behavioral.chainofresponsibility;

public class CashDonate implements Donate {
    private Donate donate;

    public void setNext(Donate donate) {
        this.donate = donate;
    }

    public void pay() {
        System.out.println("Cash donate");
    }
}