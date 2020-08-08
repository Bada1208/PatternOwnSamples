package com.patterns.behavioral.visitor;

public interface Human {
     void eat(Breakfast breakfast);

     void eat(Dinner dinner);

     void eat(Supper supper);
}
