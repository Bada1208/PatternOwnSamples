package com.patterns.abstractfactory;

import com.patterns.abstractfactory.meeting.NationalityMeetingFactory;

public class MeetingDemo {
    public static void main(String[] args) {
        NationalityFactory nationalityFactory = new NationalityMeetingFactory();
        UkrainianNationality ukrainianNationality = nationalityFactory.getUkrainianNationality();
        RussianNationality russianNationality = nationalityFactory.getRussianNationality();
        GermanNationality germanNationality = nationalityFactory.getGermanNationality();
        ukrainianNationality.getUkrainianTraditions();
        russianNationality.getRussianTraditions();
        germanNationality.getGermanTraditions();

    }
}
