package com.itacademy.javacore.homeWork.homeWork6.task2;
//Щкаф
public abstract class Cupboard implements Furniture {
    int width;              // высота
    int height;             // ширина
    int depth;              // глубина
    String material;        // материал шкафа


    public Cupboard(int width, int height, int depth, String material) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.material = material;
    }
}
