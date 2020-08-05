package com.patterns.creational.factorymethod;

public class DriverSpecialtyFactory implements SpecialtyFactory {
    @Override
    public Specialty createSpecialty() {
        return new Driver();
    }
}
