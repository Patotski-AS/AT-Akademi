package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.

Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> createMap = new HashMap<>();
        createMap.put("До", "Саша");
        createMap.put("Ре", "Коля");
        createMap.put("Ми", "Коля");
        createMap.put("Фа", "Рома");
        createMap.put("Соль", "Рома");
        createMap.put("Ля", "Рома");
        createMap.put("Си", "Коля");
        createMap.put("Иванов", "Миша");
        createMap.put("Петров", "Саша");
        createMap.put("Сидоров", "Саша");
        //напишите тут ваш код
        return createMap;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int n = 0;
        for (Map.Entry<String, String> stringEntry : map.entrySet()) {
            if (stringEntry.getValue().equals(name))
                n++;
        }
        return n;
        //напишите тут ваш код

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int n = 0;
        for (Map.Entry<String, String> stringEntry : map.entrySet()) {
            if (stringEntry.getKey().equals(lastName))
                n++;
        }
        return n;
    }

    public static void main(String[] args) {

    }
}





























