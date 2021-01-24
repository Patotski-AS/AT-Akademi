package com.itacademy.javacore.homeWork.homeWork8.task5;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//( * - необязательная задача) Создать Map, в котором хранятся дороги между городами.
//        Т. е. в качестве ключа будет город, а в качестве значения
//        список пар "город - расстояние в км"(для хранения пар можно использовать Pair<K,V> в Java).
//        В списке лежат города, в которые есть прямые дороги из города, лежащего в ключе Map.
//        Заполнить этот Map значениями в коде, вывести его.
//        Попросить пользователя ввести 2 города и посчитать расстояние,
//        которое нужно проехать из первого города во второй, используя Map.
//        Пример заполнения:
//        Минск - (Витебск, 279), (Брест, 350), (Гродно - 276), (Гомель  - 313), (Могилев, 201)
//        Могилев - (Минск, 201)
//        Витебск - (Минск, 279)
//        Брест - (Минск, 350)
//        И т.д.
//        Для городов Витебск  и Брест, введенных пользователем, выводится расстояние 629, т к добраться можно через Минск.


public class Main {
    public static void main(String[] args) {

        System.out.println(distance("Минск", "Брест"));
        System.out.println(distance("Могилев", "Брест"));

    }

    public static int distance(String x, String y) {
        Map<String, List<Pair>> distanceMap = new HashMap<>();
        distanceMap.put("Минск", new ArrayList<>());
        distanceMap.get("Минск").add(new Pair<>("Витебск", 279));
        distanceMap.get("Минск").add(new Pair<>("Брест", 350));
        distanceMap.get("Минск").add(new Pair<>("Гродно", 276));
        distanceMap.get("Минск").add(new Pair<>("Гомель", 313));
        distanceMap.get("Минск").add(new Pair<>("Могилев", 201));
        distanceMap.put("Могилев", new ArrayList<>());
        distanceMap.get("Могилев").add(new Pair<>("Минск", 201));
        distanceMap.put("Витебск", new ArrayList<>());
        distanceMap.get("Витебск").add(new Pair<>("Минск", 279));
        distanceMap.put("Брест", new ArrayList<>());
        distanceMap.get("Брест").add(new Pair<>("Минск", 350));

        if (x.equals("Минск") || y.equals("Минск")) {
            for (Pair pair : distanceMap.get(x)) {
                if (pair.getKey().equals(y))
                    return (int) pair.getValue();
            }
        }
        return (int) distanceMap.get(x).get(0).getValue() + (int) distanceMap.get(y).get(0).getValue();

    }
}
