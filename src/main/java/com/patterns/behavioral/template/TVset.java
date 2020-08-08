package com.patterns.behavioral.template;

public abstract class TVset {
    public void showChannel() {
        System.out.println("Title of channel");
        showChannelContent();
    }

    public abstract void showChannelContent();
}
