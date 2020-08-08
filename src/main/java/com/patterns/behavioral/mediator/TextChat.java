package com.patterns.behavioral.mediator;

public class TextChat implements Chat {
    public void sendMessage(User user, String message) {
        System.out.println(user.getName() + " said: " + message);
    }
}