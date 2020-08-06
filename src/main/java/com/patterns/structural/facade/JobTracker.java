package com.patterns.structural.facade;

public class JobTracker {
    private boolean activeness;

    public boolean isActiveness() {
        return activeness;
    }

    public void beginActiveness() {
        System.out.println("Activeness starts");
        activeness = true;
    }

    public void finishActiveness() {
        System.out.println("Activeness finished");
        activeness = false;
    }
}
