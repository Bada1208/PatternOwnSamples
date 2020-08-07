package com.patterns.behavioral.command;

public class LightDemo {
    public static void main(String[] args) {
        Light light = new Light();
        LightCommand pressed = new LightOn(light);
        LightCommand depressed = new LightOff(light);

        PressButton button = new PressButton(pressed, depressed);
        button.setButtonPressed();
        button.setButtonDepressed();
    }
}
