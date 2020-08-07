package com.patterns.behavioral.interpreter;

public class Line {
    public String toUpperCaseLine(String line){
        return new StringBuilder(line.toUpperCase()).toString();
    }
}
