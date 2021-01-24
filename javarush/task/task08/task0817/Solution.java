package com.javarush.task.task08.task0817;

import java.util.*;

/*

Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.

Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> createMap = new HashMap<>();
        createMap.put("До", "Саша");
        createMap.put("Ре", "Коля");
        createMap.put("Ми", "Миша");
        createMap.put("Фа", "Миша");
        createMap.put("Соль", "Андрей");
        createMap.put("Ля", "Витя");
        createMap.put("Си", "Муся");
        createMap.put("Иванов", "Миша");
        createMap.put("Петров", "Рома");
        createMap.put("Сидоров", "Саша");

        //напишите тут ваш код
        return createMap;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        List<String> listValue = new ArrayList<>();
        for (Map.Entry<String, String> x : map.entrySet()) {
            listValue.add(x.getValue());
        }

        for (int i = 0; i < listValue.size(); i++) {
            for (int j = i + 1; j < listValue.size(); j++) {
                if (listValue.get(i).equals(listValue.get(j))) {
                    removeItemFromMapByValue(map, listValue.get(i));
                }
            }
        }

    }

    //напишите тут ваш код
    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}





























