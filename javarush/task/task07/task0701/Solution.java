package com.javarush.task.task07.task0701;

//1. В методе initializeArray():
//1.1. Создайте массив на 20 чисел
//1.2. Считайте с консоли 20 чисел и заполните ими массив
//2. Метод max(int[] array) должен находить максимальное число из элементов массива

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int [] array = new int [20];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i< array.length;i++){
            array [i] = Integer.parseInt(bufferedReader.readLine());
        }
        // создай и заполни массив
        return array;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i =1 ; i<array.length;i++){
            if (max<array[i])
                max = array[i];
            else continue;

        }
        // найди максимальное значение
        return max;
    }
}






























