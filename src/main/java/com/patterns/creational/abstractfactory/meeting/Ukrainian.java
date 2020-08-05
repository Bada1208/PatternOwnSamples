package com.patterns.creational.abstractfactory.meeting;

import com.patterns.creational.abstractfactory.UkrainianNationality;

public class Ukrainian implements UkrainianNationality {
    @Override
    public void getUkrainianTraditions() {
        System.out.println("Ukrainian traditions");
    }
}
