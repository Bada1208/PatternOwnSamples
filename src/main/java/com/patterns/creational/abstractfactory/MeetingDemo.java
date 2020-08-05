package com.patterns.creational.abstractfactory;

import com.patterns.creational.abstractfactory.meeting.NationalityMeetingFactory;

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
