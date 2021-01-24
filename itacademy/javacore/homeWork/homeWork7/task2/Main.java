package com.itacademy.javacore.homeWork.homeWork7.task2;

//2) Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle.
//        Создать поле name в классе Vehicle и проинициализировать его через конструктор.
//        Создать generic класс Garage, который может хранить только объекты типа наследуемого от Vehicle.
//        Создать 2 объекта класса Garage (все поля ввести с клавиатуры)
//        и вывести на экран имя хранимого транспортного средства.
//


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter name and color motorcycle in first garage: ");
        Garage<Vehicle> garage1 = new Garage<>(new Motorcycle(reader.readLine(),reader.readLine()));

        System.out.println("Enter name and color car in second garage: ");
        Garage<Vehicle> garage2 = new Garage<>(new Car(reader.readLine(),reader.readLine()));

        System.out.println( garage1);
        System.out.println( garage2);

    }


}
