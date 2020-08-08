package com.patterns.behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        PeopleOnCameras cameras = new PeopleOnCameras();
        cameras.addPerson(" first person ");
        cameras.addPerson(" second person ");
        Observer firstGuard = new SecurityGuard("Tim");
        Observer secondGuard = new SecurityGuard("Johnny");
        cameras.addObserver(firstGuard);
        cameras.addObserver(secondGuard);

        cameras.addPerson(" third person ");
        cameras.removePerson(" second person ");
    }
}
