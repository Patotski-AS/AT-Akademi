package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Омовение Рамы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.


Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать строку с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна заменять в тексте первые буквы всех слов на заглавные.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String[] strings = string.split(" "); // преобразуем строку в массив строк, удаляя пробелы.

        for (int i = 0; i < strings.length; i++) {
            char[] chars = strings[i].toCharArray();// преобразуем строку в массив символов.
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == ' ') continue;
                else {
                    chars[j] = Character.toUpperCase(chars[j]); // преобразуем первый символ к верхнему регистру.
                    strings[i] = String.valueOf(chars); // пересохраняем исправленую строку.
                    break;
                }
            }
        }
        //напишите тут ваш ко
        System.out.println((String.join(" ", strings)));
    }
}






























