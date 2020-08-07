package com.patterns.behavioral.interpreter;

public class ExpressionDemo {
    public static void main(String[] args) {
        String s = "kooosrsrsrs";
        Line line = new Line();
        Expression expression = new ToUpperCaseExpression(s);
        s = expression.interpret(line);
        System.out.println(s);
    }
}
