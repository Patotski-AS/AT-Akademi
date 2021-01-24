package com.javarush.task.task07.task0713;

//1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
//Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
//Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
//Порядок объявления списков очень важен.
//2. Метод printList должен выводить на экран все элементы списка с новой строки.
//3. Используя метод printList выведи эти три списка на экран. Сначала тот,
//который для x%3, потом тот, который для x%2, потом последний.

import javafx.scene.chart.BubbleChart;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }

        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) % 3) == 0) {
                if ((list.get(i) % 2) == 0) {
                    list1.add(list.get(i));
                    list2.add(list.get(i));
                } else list1.add(list.get(i));
            } else if (((list.get(i) % 2) == 0))
                list2.add(list.get(i));
            else
                list3.add(list.get(i));
        }

        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int s : list) {
            System.out.println(s);
        }
    }
}






























