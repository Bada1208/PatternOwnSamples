package com.patterns.creational.abstractfactory.meeting;

import com.patterns.creational.abstractfactory.RussianNationality;

public class Russian implements RussianNationality {
    @Override
    public void getRussianTraditions() {
        System.out.println("Russian traditions");
    }
}
