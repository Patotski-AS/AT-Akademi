package com.itacademy.javacore.homeWork.homeWork16.task1;

import java.util.LinkedList;
import java.util.List;

public class Country implements Locality {
    String name;
    private int populations;
    private final List<Locality> adminParts = new LinkedList<>();

    public Country(String name) {
        this.name = name;
    }

    public void add (Locality adminPart){
        adminParts.add(adminPart);
    }

    public void remove (Locality adminPart){
        adminParts.remove(adminPart);
    }

    @Override
    public int countPopulation() {
        for (Locality adminPart : adminParts)
            populations += adminPart.countPopulation();
        return populations;
    }

}
