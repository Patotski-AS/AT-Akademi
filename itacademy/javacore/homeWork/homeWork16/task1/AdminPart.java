package com.itacademy.javacore.homeWork.homeWork16.task1;

import java.util.LinkedList;
import java.util.List;

public class AdminPart implements Locality {
    String name;
    private int populations;
    private final List<Locality> localities = new LinkedList<>();

    public AdminPart(String name) {
        this.name = name;
    }

    public void add (Locality adminPart){
        localities.add(adminPart);
    }

    public void remove (Locality adminPart){
        localities.remove(adminPart);
    }

    @Override
    public int countPopulation() {
        for (Locality locality : localities)
            populations += locality.countPopulation();
        return populations;
    }

}
