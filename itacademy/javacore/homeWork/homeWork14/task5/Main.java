package com.itacademy.javacore.homeWork.homeWork14.task5;


import java.util.Random;

//(* - со звездочкой) Создать функциональный интерфейс,
//        который принимает сколько угодно элементов типа T и возвращает случайный элемент из них.
//        Создать экземпляр этого интерфейса с помощью лямбда-выражения,
//        которое реализует возвращение случайного элемента,
//        применить этот экземпляр к объектам Integer, String, Double.
//
public class Main {
    public static void main(String[] args) {

        System.out.println( myMethod(q -> q[new Random().nextInt(q.length)], 10, 20, 3, 5, 7));
        System.out.println( myMethod(q -> q[new Random().nextInt(q.length)], "Вася", "Петя", "Коля", "Антон"));
        System.out.println( myMethod(q -> q[new Random().nextInt(q.length)], 10.78, 20.55, 3.00, 5.78, 7.32));
    }

    @SafeVarargs
    public static <T> T myMethod(Qwerty<T> qwerty, T... args) {
        return qwerty.method(args);
    }

    @FunctionalInterface
    interface Qwerty<T> {
        T method(T... args);
    }

}