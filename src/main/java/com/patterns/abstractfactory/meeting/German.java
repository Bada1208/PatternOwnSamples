package com.patterns.abstractfactory.meeting;

import com.patterns.abstractfactory.GermanNationality;

public class German implements GermanNationality {
    @Override
    public void getGermanTraditions() {
        System.out.println("German traditions");
    }
}
