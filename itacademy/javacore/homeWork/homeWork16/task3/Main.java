package com.itacademy.javacore.homeWork.homeWork16.task3;

import java.util.Arrays;

/**
 * (*- необ€зательна€ задача) ѕаттерн Strategy.
 * –азработать модель выбора способов сортировки целых чисел: создать метод sort,
 * который принимает класс, обозначающий и реализующий алгоритм,
 * который будет применен. ƒл€ этого реализовать несколько
 * алгоритмов сортировки(например, пузырьком, вставкой,
 * выбором, сли€нием, быструю сортировку ’оара; все реализации доступны в интернете)
 * и использовать стандартную сортировку java,
 * дл€ каждого варианта сортировки иметь соответствующий класс-стратегию.
 */
public class Main {
    public static void main(String[] args) {
        int [] ints = {8,0,3,4,6,9,2,5,1};
        Sorted sorted = new Sorted();
        sorted.setSorted(NameSorted.HOARE);
        sorted.sort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
