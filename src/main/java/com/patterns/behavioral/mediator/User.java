package com.patterns.behavioral.mediator;

public class User {
    private Chat chat;
    private String name;

    public User(String name, Chat chat) {
        this.name = name;
        this.chat = chat;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String msg) {
        chat.sendMessage(this, msg);
    }
}