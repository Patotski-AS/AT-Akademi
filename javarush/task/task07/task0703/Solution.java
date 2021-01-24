package com.javarush.task.task07.task0703;

/*
Общение одиноких массивов
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String [] strings = new String[10];
        int [] ints = new int[10];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < strings.length; i++) {
            strings[i] = bufferedReader.readLine();
        }

        for (int i = 0; i < ints.length; i++) {
            ints[i] = strings[i].length();
        }

        for (int x :ints)
            System.out.println(x);
        //напишите тут ваш код
    }
}






























