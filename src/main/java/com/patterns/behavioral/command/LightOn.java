package com.patterns.behavioral.command;

public class LightOn  implements LightCommand{
    private Light light;

    public LightOn(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }
}
