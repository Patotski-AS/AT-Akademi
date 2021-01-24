package com.itacademy.javacore.homeWork.homeWork7.task1;


// Создать объект класса Цветок и классы Лепесток, Бутон, Стебель, Лист.
// Методы: расцвести, завять, расти, вывести на консоль цвет бутона. Использовать вложенные классы.

public  class Main {
    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.grow();
        Flower.Bud bud = flower.new Bud("Red");

        System.out.println(flower.getColorBud());
    }
}

