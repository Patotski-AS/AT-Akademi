package com.javarush.task.task07.task0718;

//1. Введи с клавиатуры 10 слов в список строк.
//2. Определить, является ли список упорядоченным по возрастанию длины строки.
//3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/*
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(bufferedReader.readLine());
        }

        boolean x = true;
        int i = 0;
        while (x && i<(list.size())-1) {
            if (list.get(i).length() > list.get(i + 1).length()) {
                System.out.println(i + 1);
                x = false;
            } else i++;
        }
        //напишите тут ваш код
    }
}































