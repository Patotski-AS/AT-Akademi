package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*

Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.

Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> integerSet = new HashSet<>();
        while (integerSet.size()<20) {
            integerSet.add((int) (Math.random() * 30 + 1));
//            if (integerSet.size()==20)
//                break;
        }
        return integerSet;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 10)
                iterator.remove();
        }

 //       set.removeIf(integer -> integer > 10);

        return set;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(createSet());
        for (int s:set1)
            System.out.print(s + " ");

        System.out.println();

        for (int s:removeAllNumbersGreaterThan10(createSet()))
            System.out.print(s + " ");


    }
}






























