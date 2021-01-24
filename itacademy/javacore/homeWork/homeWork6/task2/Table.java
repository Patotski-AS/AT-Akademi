package com.itacademy.javacore.homeWork.homeWork6.task2;
//стол
public abstract class Table implements Furniture {
   protected int width;              // высота
   protected int height;             // ширина
   protected int length;             // длина
   protected int tableLeg;           // количество ножек стола
   protected String material;        // материал стола
    Color color ;                    // цвет

    public Table(int width, int height, int length, int tableLeg, String material, Color color) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.tableLeg = tableLeg;
        this.material = material;
        this.color = color;
    }

}
