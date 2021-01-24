package com.javarush.task.task04.task0424;

//Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
// Вывести на экран порядковый номер числа, отличного от остальных.
//Пример для чисел 4 6 6:
//1
//Пример для чисел 6 6 3:
//3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if (a != b && a == c)
            System.out.println("2");
        else if (a == b && a != c)
            System.out.println("3");
        else if (c == b && a != c)
            System.out.println("1");
    }
}


