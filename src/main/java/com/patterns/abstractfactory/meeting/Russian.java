package com.patterns.abstractfactory.meeting;

import com.patterns.abstractfactory.RussianNationality;

public class Russian implements RussianNationality {
    @Override
    public void getRussianTraditions() {
        System.out.println("Russian traditions");
    }
}
