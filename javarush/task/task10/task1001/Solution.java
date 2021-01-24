package com.javarush.task.task10.task1001;

/*
Задача №1 на преобразование целых типов
Расставьте правильно операторы приведения типа, чтобы получился ответ: d > 0
int a = 0;
int b = (byte) a + 46;
byte c = (byte) (a*b);
double f = (char) 1234.15;
long d = (short) (a + f / c + b);
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b =  a + 46;  // 4
        byte c = (byte) (a * b);  // 0
        double f = (char) 1234.15; // '1'
        long d = (long) (a + f / c + b);
        System.out.println(d);
    }
}






























