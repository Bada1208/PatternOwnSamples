package com.patterns.behavioral.iterator;

public class HumanSpecialtiesDemo {
    public static void main(String[] args) {
        String[] specialties = {"driver", "cooker", "coder"};
        Human human = new Human("Vasia", specialties);

        Iterator iterator = human.getIterator();
        System.out.println("Human: " + human.getName());

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
