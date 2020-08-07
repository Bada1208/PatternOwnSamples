package com.patterns.behavioral.command;

public class PressButton {
    private LightCommand buttonPressed;
    private LightCommand buttonDepressed;

    public PressButton(LightCommand buttonPressed, LightCommand buttonDepressed) {
        this.buttonPressed = buttonPressed;
        this.buttonDepressed = buttonDepressed;
    }

    public void setButtonPressed() {
        buttonPressed.execute();
    }

    public void setButtonDepressed() {
        buttonDepressed.execute();
    }
}
