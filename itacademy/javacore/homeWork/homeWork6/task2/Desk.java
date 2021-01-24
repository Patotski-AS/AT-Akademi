package com.itacademy.javacore.homeWork.homeWork6.task2;

//Письменный стол
public class Desk extends Table {
    int numberOfBedsideTables;

    public Desk(int width, int height, int length, int tableLeg, String material, Color color,int numberOfBedsideTables) {
        super(width, height, length, tableLeg, material, color);
        this.numberOfBedsideTables = numberOfBedsideTables;
    }
}
