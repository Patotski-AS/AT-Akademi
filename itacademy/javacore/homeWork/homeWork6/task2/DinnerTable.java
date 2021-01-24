package com.itacademy.javacore.homeWork.homeWork6.task2;

public class DinnerTable extends Table {
    Color colorTabletop;

    public DinnerTable(int width, int height, int length, int tableLeg, String material, Color color) {
        super(width, height, length, tableLeg, material, color);
        this.colorTabletop = color;
    }

    public DinnerTable(int width, int height, int length, int tableLeg, String material, Color color,Color color2) {
        super(width, height, length, tableLeg, material, color);
        this.colorTabletop = color2;
    }



}
