package com.patterns.abstractfactory.meeting;

import com.patterns.abstractfactory.UkrainianNationality;

public class Ukrainian implements UkrainianNationality {
    @Override
    public void getUkrainianTraditions() {
        System.out.println("Ukrainian traditions");
    }
}
