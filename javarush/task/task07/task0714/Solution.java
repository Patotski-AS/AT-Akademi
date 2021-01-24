package com.javarush.task.task07.task0714;

//Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.

/*
Слова в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(bufferedReader.readLine());
        }

        list.remove(2);

        for (int i = 1; i <= list.size(); i++) {
            System.out.println(list.get(list.size() - i));
        }
        //напишите тут ваш код
    }
}






























