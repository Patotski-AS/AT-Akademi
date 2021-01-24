package com.itacademy.javacore.homeWork.homeWork11.task1;


//Создать класс поток, который генерирует массив случайных целых чисел из 10 элементов,
//        затем находит максимальный элемент, в этом массиве,
//        и выводит на экран в формате имя потока, максимальный элемент. Запустить 10 потоков.
public class Main {
    public static void main(String[] args) {
        Test[] tests = new Test[10];
        for (int i = 0; i < tests.length; i++) {
            tests[i] = new Test();
        }
        for (Test test : tests) {
            test.start();
        }
    }


}
