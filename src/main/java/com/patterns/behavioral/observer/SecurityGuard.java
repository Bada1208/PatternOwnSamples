package com.patterns.behavioral.observer;

import java.util.List;

public class SecurityGuard implements Observer {
    String name;

    public SecurityGuard(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> people) {
        System.out.println("Security guard " + name + " is observing people : " + people);
    }
}