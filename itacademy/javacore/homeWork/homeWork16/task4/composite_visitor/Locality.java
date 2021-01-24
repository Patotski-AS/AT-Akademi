package com.itacademy.javacore.homeWork.homeWork16.task4.composite_visitor;

import com.itacademy.javacore.homeWork.homeWork16.task4.visitor.Visitor;

public interface Locality {
    String getName();
    void accept (Visitor visitor);
    int countPopulation();
}

