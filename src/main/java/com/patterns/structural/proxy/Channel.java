package com.patterns.structural.proxy;

public class Channel implements Connection {

    private String numberOfChannel;

    public Channel(String numberOfChannel) {
        this.numberOfChannel = numberOfChannel;
        load(numberOfChannel);
    }

    private void load(String numberOfChannel) {
        System.out.println("Connection is established " + numberOfChannel);
    }

    public void connect() {
        System.out.println("Channel connected " + numberOfChannel);
    }
}
