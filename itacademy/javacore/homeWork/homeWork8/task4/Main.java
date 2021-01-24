package com.itacademy.javacore.homeWork.homeWork8.task4;

import java.util.HashMap;
import java.util.Map;

/**
 * Ввести текст с клавиатуры. Для текста создать Map, где ключом будет слово,
 * а значение – количество повторений этого слова в тексте.
 * Можно использовать метод String.split для разделения строки на слова.
 */

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String string = "Саша Маша Артем Антон Андрей Коля Маша Артем Антон Андрей Коля Маша Саша Антон Андрей Коля Маша Артем";
        String[] strings = string.trim().split(" ");

        for (String x : strings) {
            if (map.containsKey(x))
                map.put(x, map.get(x) + 1);
            else
                map.put(x, 1);
        }

        System.out.println(map);
    }
}
