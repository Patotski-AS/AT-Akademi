package com.javarush.task.task04.task0427;

//Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
//        "четное однозначное число" - если число четное и имеет одну цифру,
//        "нечетное однозначное число" - если число нечетное и имеет одну цифру,
//        "четное двузначное число" - если число четное и имеет две цифры,
//        "нечетное двузначное число" - если число нечетное и имеет две цифры,
//        "четное трехзначное число" - если число четное и имеет три цифры,
//        "нечетное трехзначное число" - если число нечетное и имеет три цифры.
//        Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
//
//        Пример для числа 100:
//        четное трехзначное число
//
//        Пример для числа 51:
//        нечетное двузначное число
//
/*
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String stringNumber = bufferedReader.readLine();
        int intNumber = Integer.parseInt(stringNumber);
        if (intNumber >= 1 && intNumber <= 999)
            if (stringNumber.length() == 1) {
                if (intNumber % 2 == 0)
                    System.out.println("четное однозначное число");
                else
                    System.out.println("нечетное однозначное число");
            } else if (stringNumber.length() == 2) {
                if (intNumber % 2 == 0)
                    System.out.println("четное двузначное число");
                else
                    System.out.println("нечетное двузначное число");
            } else if (stringNumber.length() == 3) {
                if (intNumber % 2 == 0)
                    System.out.println("четное трехзначное число");
                else
                    System.out.println("нечетное трехзначное число");
            }
        //напишите тут ваш код

    }
}






























