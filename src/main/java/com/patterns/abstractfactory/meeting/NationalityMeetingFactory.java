package com.patterns.abstractfactory.meeting;

import com.patterns.abstractfactory.GermanNationality;
import com.patterns.abstractfactory.NationalityFactory;
import com.patterns.abstractfactory.RussianNationality;
import com.patterns.abstractfactory.UkrainianNationality;

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
