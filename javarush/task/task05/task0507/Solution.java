package com.javarush.task.task05.task0507;

//Вводить с клавиатуры числа и вычислить среднее арифметическое.
//        Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
//        -1 не должно учитываться.
//
//        Примеры:
//        а) при вводе чисел
//        1
//        2
//        2
//        4
//        5
//        -1
//        получим вывод
//        2.8
//
//        б) при вводе чисел
//        4
//        3
//        2
//        1
//        -1
//        получим вывод
//        2.5
//
//        Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
//
//        while (true) {
//        int number = считываем число;
//        if (проверяем, что number -1)
//        break;
//      }

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double result = 0;
        int i = 0;
        while (true) {
            int number = Integer.parseInt(bufferedReader.readLine());
            if (number == -1)
                break;
            else
                result += number;
            i++;
        }
        System.out.println ( result/ i);

    }
}
