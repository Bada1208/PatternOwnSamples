package com.patterns.behavioral.iterator;

public class Human implements Collection{
    private String name;
    private String[] specialties;

    public Human(String name, String[] specialties) {
        this.name = name;
        this.specialties = specialties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSpecialties() {
        return specialties;
    }

    public void setSpecialties(String[] specialties) {
        this.specialties = specialties;
    }

    @Override
    public Iterator getIterator() {
        return new SpecialtiesIterator();
    }

    private class SpecialtiesIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < specialties.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return specialties[index++];
        }
    }
}
