package com.patterns.creational.abstractfactory.meeting;

import com.patterns.creational.abstractfactory.GermanNationality;
import com.patterns.creational.abstractfactory.NationalityFactory;
import com.patterns.creational.abstractfactory.RussianNationality;
import com.patterns.creational.abstractfactory.UkrainianNationality;

public class NationalityMeetingFactory implements NationalityFactory {
    @Override
    public UkrainianNationality getUkrainianNationality() {
        return new Ukrainian();
    }

    @Override
    public RussianNationality getRussianNationality() {
        return new Russian();
    }

    @Override
    public GermanNationality getGermanNationality() {
        return new German();
    }
}
