package com.javarush.task.task07.task0715;

//1. Создай список из слов "мама", "мыла", "раму".
//2. После каждого слова вставь в список строку, содержащую слово "именно".
//3. Вывести результат на экран, каждый элемент списка с новой строки.

/*
Продолжаем мыть раму
*/

import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        String x = "именно";

        list.add(1,x);
        list.add(3,x);
        list.add(5,x);

//
//        for (int i = 0; i < list.size(); i++) {
//            list.add(list.get(i));
//            list.remove(0);
//            list.add(x);
//        }

        for (String s : list) {
            System.out.println(s);
        }

        //напишите тут ваш код
    }
}






























