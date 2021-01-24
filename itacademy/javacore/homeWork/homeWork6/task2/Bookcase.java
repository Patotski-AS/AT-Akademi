package com.itacademy.javacore.homeWork.homeWork6.task2;

public class Bookcase extends Cupboard {
    Color color;
    int shelf;              // количество полок
    int doors;

    public Bookcase(int width, int height, int depth, int shelf, String material, Color color) {
        super(width, height, depth, material);
        this.shelf = shelf;
        this.doors=0;
    }

    public Bookcase(int width, int height, int depth, String material, Color color, int shelf, int doors) {
        super(width, height, depth, material);
        this.color = color;
        this.shelf = shelf;
        this.doors = doors;
    }
}
