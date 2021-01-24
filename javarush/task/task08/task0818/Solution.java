package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.

Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> createMap = new HashMap<>();
        createMap.put("До", 1000);
        createMap.put("Ре", 500);
        createMap.put("Ми", 630);
        createMap.put("Фа", 300);
        createMap.put("Соль", 398);
        createMap.put("Ля", 900);
        createMap.put("Си", 1020);
        createMap.put("Иванов", 302);
        createMap.put("Петров", 807);
        createMap.put("Сидоров", 333);

        return createMap;

        //напишите тут ваш код
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> x = iterator.next();
            if (x.getValue() < 500)
                iterator.remove();
        }
    }



    public static void main(String[] args) {

        removeItemFromMap(createMap());
    }
}


