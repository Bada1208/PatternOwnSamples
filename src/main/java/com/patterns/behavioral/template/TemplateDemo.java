package com.patterns.behavioral.template;

public class TemplateDemo {
    public static void main(String[] args) {
        TVset news = new News();
        TVset sports = new Sports();
        news.showChannel();
        sports.showChannel();
    }
}
