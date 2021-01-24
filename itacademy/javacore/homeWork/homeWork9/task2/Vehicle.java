package com.itacademy.javacore.homeWork.homeWork9.task2;

public class Vehicle {
   private String name ;
   private String color;
   private double width;
   private double length;


    public Vehicle(String name, String color, double width, double length) {
        this.name = name;
        this.color = color;
        this.width = width;
        this.length = length;
    }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "(" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ')';
    }
}
