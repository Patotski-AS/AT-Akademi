package com.javarush.task.task04.task0428;

//Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.
//
//        Примеры:
//        а) при вводе чисел
//        -4
//        6
//        6
//        получим вывод
//        2
//
//        б) при вводе чисел
//        -6
//        -6
//        -3
//        получим вывод
//        0
//        в) при вводе чисел
//        0
//        1
//        2
//        получим вывод
//        2
//

/*
Положительное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] number = new int[3];
        for (int i = 0; i < 3; i++) {
            number[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int x = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 0)
                x++;
        }
        System.out.println(x);
        //напишите тут ваш код

    }
}






























