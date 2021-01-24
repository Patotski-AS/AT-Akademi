package com.itacademy.javacore.homeWork.homeWork7.task2;

public class Vehicle {
    String name ;
    String color;


    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "(" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ')';
    }
}
