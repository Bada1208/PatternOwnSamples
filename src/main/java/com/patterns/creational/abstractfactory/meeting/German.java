package com.patterns.creational.abstractfactory.meeting;

import com.patterns.creational.abstractfactory.GermanNationality;

public class German implements GermanNationality {
    @Override
    public void getGermanTraditions() {
        System.out.println("German traditions");
    }
}
