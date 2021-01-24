package com.itacademy.javacore.homeWork.homeWork16.task3.strategy;

public class BubbleSort implements SortStrategy {
    @Override
    public void sort(int[] ints) {
        int j;
        boolean flag = true;   // устанавливаем наш флаг в true для первого прохода по массиву
        int temp;   // вспомогательная переменная

        while (flag) {
            flag = false;    // устанавливаем флаг в false в ожидании возможного свопа (замены местами)
            for (j = 0; j < ints.length - 1; j++) {
                if (ints[j] > ints[j + 1]) { // измените на < для сортировки по убыванию
                    temp = ints[j];         // меняем элементы местами
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                    flag = true;  // true означает, что замена местами была проведена
                }
            }
        }
    }
}
