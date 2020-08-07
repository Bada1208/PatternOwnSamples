package com.patterns.behavioral.chainofresponsibility;

public class Demo {
    public static void main(String[] args) {
        Donate cardDonate = new CardDonate();
        Donate cashDonate = new CashDonate();
        cardDonate.setNext(cashDonate);
        cardDonate.pay();
    }

}
