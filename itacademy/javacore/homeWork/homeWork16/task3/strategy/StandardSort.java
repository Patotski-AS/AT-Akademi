package com.itacademy.javacore.homeWork.homeWork16.task3.strategy;

import java.util.Arrays;

public class StandardSort implements SortStrategy {
    @Override
    public void sort(int[] ints) {
        Arrays.sort(ints);
    }
}
