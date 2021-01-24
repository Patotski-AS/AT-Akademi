package com.itacademy.javacore.homeWork.homeWork14.task1;


//—оздать функциональный интерфейс с методом, который принимает Integer и String,
//        возвращает String. —оздать экземпл€р этого интерфейса с помощью л€мбда-выражени€,
//        которое добавл€ет в конец переданной строки пробел и переданный Integer.
//
public class Solution_14_1 {
    public static void main(String[] args) {
        test(1, "String", (x, s) -> s + " " + x);
    }

    @FunctionalInterface
    public interface MyFunction {
         String apply(Integer i, String s);
    }

    public static void test(int x, String s, MyFunction function) {
        System.out.println(function.apply(x, s));
    }


}
