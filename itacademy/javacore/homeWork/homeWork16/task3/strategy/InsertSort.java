package com.itacademy.javacore.homeWork.homeWork16.task3.strategy;

public class InsertSort implements SortStrategy {
    @Override
    public void sort(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++)
            for (int j = 0; j < ints.length - i - 1; j++)
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
    }
}
