package com.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Circus {
    private List<Animal> list = new ArrayList<>();

    public void addAnimal(Animal animal) {
        list.add(animal);
    }

    public void removeAnimal(Animal animal) {
        list.remove(animal);
    }

    public void createCircus() {
        System.out.println("Circus team was created...");
        for (Animal animal : list) {
            animal.showProgramme();
        }
    }
}
