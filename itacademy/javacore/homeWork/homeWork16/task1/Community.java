package com.itacademy.javacore.homeWork.homeWork16.task1;

public class Community implements Locality {
    private String name;
    private int populations;

    public Community(String name, int populations) {
        this.name = name;
        this.populations = populations;
    }

    @Override
    public int countPopulation() {
        return populations;
    }


}
