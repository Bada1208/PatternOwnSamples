package com.patterns.behavioral.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        TextChat textChat = new TextChat();
        User elena = new User("Elena", textChat);
        User ivan = new User("Ivan", textChat);
        elena.sendMessage("Hello");
        ivan.sendMessage("Hi!))");
    }
}





