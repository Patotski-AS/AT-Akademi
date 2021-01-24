package com.javarush.task.task07.task0712;

//1. Создай список строк.
//2. Добавь в него 10 строчек с клавиатуры.
//3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
//Если таких строк несколько, то должны быть учтены самые первые из них.
//4. Выведи на экран строку из п.3. Должна быть выведена одна строка.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(bufferedReader.readLine());
        }
        String min = list.get(0);
        String max = list.get(list.size() - 1);
        for (int i = 0; i < list.size(); i++) {
            if (min.length() > list.get(i).length())
                min = list.get(i);
            if (max.length() < list.get(i).length())
                max = list.get(i);
        }
        for (int i = 0; i < list.size(); i++) {
            if (min.length() == list.get(i).length()) {
                System.out.println(list.get(i));
                break;
            } else if (max.length() == list.get(i).length()) {
                System.out.println(list.get(i));
                break;
            } else continue;
        }
    }
}
//напишите тут ваш код





























