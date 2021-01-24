package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;


//Написать программу, которая:
//1. считывает с консоли число N, которое должно быть больше 0
//2. потом считывает N чисел с консоли
//3. выводит на экран максимальное из введенных N чисел.

/*
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        if (N > 0) {
            int n = Integer.parseInt(reader.readLine());
            int maximum = n;
            for (int i = 1; i < N; i++) {
                n = Integer.parseInt(reader.readLine());
                if (maximum < n)
                    maximum = n;
                else continue;
            }
            System.out.println(maximum);
        }
    }
}





























