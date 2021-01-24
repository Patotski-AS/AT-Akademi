package com.itacademy.javacore.homeWork.homeWork11.task3;

import java.util.Arrays;

public class SumMatrixThread extends Thread {
   private final int [] first;
   private final int [] second;
   private int [] result;

    public SumMatrixThread(int[] first, int[] second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public void run() {
        result = new int[first.length];
        for (int i = 0; i < first.length;i++) {
            result[i] = first[i] + second[i];
        }
        System.out.println(currentThread().getName() +
                Arrays.toString(result));
    }

    public int[] getResult() {
        return result;
    }
}
