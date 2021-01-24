package com.javarush.task.task08.task0805;

import java.util.HashMap;
import java.util.Map;

/*
Есть коллекция Map<String, String> (реализация HashMap), туда занесли 10 различных строк.
Вывести на экран список значений, каждый элемент с новой строки.

На экране — значения!
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printValues(map);
    }

    public static void printValues(Map<String, String> map) {
        for (Map.Entry<String ,String >  s : map.entrySet()) {
            String value = s.getValue();
            System.out.println(value);
        }

//        map.forEach((key,value)->System.out.println(value));
        //напишите тут ваш код
    }
}






























