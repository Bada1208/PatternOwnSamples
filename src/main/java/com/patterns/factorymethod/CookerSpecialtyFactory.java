package com.patterns.factorymethod;

public class CookerSpecialtyFactory implements SpecialtyFactory {
    @Override
    public Specialty createSpecialty() {
        return new Cooker();
    }
}
