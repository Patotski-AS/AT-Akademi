package com.javarush.task.task07.task0721;

//Создать массив на 20 чисел.
//Заполнить его числами с клавиатуры.
//Найти максимальное и минимальное числа в массиве.
//Вывести на экран максимальное и минимальное числа через пробел.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        int maximum = array[0];
        int minimum = array[0];


        for (int i = 1; i < array.length ; i++) {
            if (maximum < array[i])
                maximum = array[i];
            if (minimum > array[i])
                minimum = array[i];
        }

        System.out.println( maximum + " " + minimum);
        //напишите тут ваш код


    }
}






























