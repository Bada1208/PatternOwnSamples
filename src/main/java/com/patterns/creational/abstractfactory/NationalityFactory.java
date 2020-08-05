package com.patterns.creational.abstractfactory;

public interface NationalityFactory {
    UkrainianNationality getUkrainianNationality();

    RussianNationality getRussianNationality();

    GermanNationality getGermanNationality();
}
