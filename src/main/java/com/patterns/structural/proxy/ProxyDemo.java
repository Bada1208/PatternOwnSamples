package com.patterns.structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Connection con = new ProxyConnection("124");
        con.connect();
    }
}