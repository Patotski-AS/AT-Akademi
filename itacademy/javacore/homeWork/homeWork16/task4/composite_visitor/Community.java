package com.itacademy.javacore.homeWork.homeWork16.task4.composite_visitor;

import com.itacademy.javacore.homeWork.homeWork16.task4.visitor.Visitor;

public class Community implements Locality {
    private String name;
    private int populations;

    public Community(String name, int populations) {
        this.name = name;
        this.populations = populations;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


    @Override
    public int countPopulation() {
        return populations;
    }

    @Override
    public String getName() {
        return name;
    }
}
