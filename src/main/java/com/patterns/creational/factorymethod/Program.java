package com.patterns.creational.factorymethod;

public class Program {
    public static void main(String[] args) {
        SpecialtyFactory specialtyFactory = createNewSpecialty("driver");
        Specialty specialty = specialtyFactory.createSpecialty();
        specialty.mySpecialty();
    }

    public static SpecialtyFactory createNewSpecialty(String s) {
        if (s.equalsIgnoreCase("cooker")) return new CookerSpecialtyFactory();
        else if (s.equalsIgnoreCase("driver")) return new DriverSpecialtyFactory();
        else throw new RuntimeException(s + " there is no such specialty");
    }
}
