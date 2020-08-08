package com.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class PeopleOnCameras implements Observed {
    List<String> people = new ArrayList<>();

    List<Observer> guardians = new ArrayList<>();

    public void addPerson(String person) {
        this.people.add(person);
        notifyObservers();
    }

    public void removePerson(String person) {
        this.people.remove(person);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.guardians.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.guardians.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : guardians) {
            obs.handleEvent(this.people);
        }
    }
}
