package com.patterns.abstractfactory;

public interface NationalityFactory {
    UkrainianNationality getUkrainianNationality();

    RussianNationality getRussianNationality();

    GermanNationality getGermanNationality();
}
