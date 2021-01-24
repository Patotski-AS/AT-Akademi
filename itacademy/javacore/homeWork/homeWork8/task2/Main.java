package com.itacademy.javacore.homeWork.homeWork8.task2;

import java.util.Deque;
import java.util.LinkedList;

//Ввести число, занести его цифры в стек. Вывести цифры числа в обратном порядке.
//        Для стека использовать интерфейс Deque и его реализацию LinkedList.
//
public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        int number = 10;
        for (int i = 1; i <= number; i++) {
            deque.push(i);
        }
        for (int i = 0; i < number; i++) {
            System.out.print(deque.pop() + " ");
        }

    }


}
