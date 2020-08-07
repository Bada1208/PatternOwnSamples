package com.patterns.behavioral.interpreter;

public class ToUpperCaseExpression implements Expression {
    private String lineStr;

    public ToUpperCaseExpression(String line) {
        this.lineStr = line;
    }

    @Override
    public String interpret(Line line) {
        return line.toUpperCaseLine(lineStr);
    }
}


