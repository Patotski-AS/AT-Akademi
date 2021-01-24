package com.itacademy.javacore.homeWork.homeWork9.task1;


//Взять домашнее задание 5.2 про треугольник.
//        Создать для него исключения, соответствующие ситуациям: такого треугольника не существует,
//        отрицательная длина стороны не возможна. В исключении про отрицательную длину стороны хранить список отрицательных сторон.
//        Сделать в main ввод трех сторон треугольника с клавиатуры.
//        При обработке этих исключений выводить соответствующее сообщение и предлагать заново ввести стороны треугольника.
//        Использовать logger для исключений и в начале каждого метода (выводить имя метода и параметры, с которыми он был вызван).


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean b = true;
        while (b) {
            b = false;
            System.out.println("Введите стороны треугольника: ");
            try {
                Triangle triangle = new Triangle(Integer.parseInt(reader.readLine()),
                        Integer.parseInt(reader.readLine()),
                        Integer.parseInt(reader.readLine()));

//                Triangle triangle2 = new Triangle(Integer.parseInt(reader.readLine()));

                System.out.println(triangle.perimeter());
                System.out.println(triangle.area());
                System.out.println(triangle.equilateral());
                System.out.println(triangle.isosceles());
                System.out.println(triangle.rectangular());

            } catch (TriangleException e) {
                System.err.println(e.getMessage());
                b = true;
            }
        }
    }
}