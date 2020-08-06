package com.patterns.structural.proxy;

public class ProxyConnection implements Connection {
    private String numberOfChannelForProxy;
    private Channel channel;

    public ProxyConnection(String numberOfChannelForProxy) {
        this.numberOfChannelForProxy = numberOfChannelForProxy;
    }

    public void connect() {
        if (channel == null) {
            channel = new Channel(numberOfChannelForProxy);
        }
        channel.connect();
    }
}