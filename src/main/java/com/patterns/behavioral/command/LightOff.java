package com.patterns.behavioral.command;

public class LightOff implements LightCommand{
    private Light light;

    public LightOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOff();
    }
}
