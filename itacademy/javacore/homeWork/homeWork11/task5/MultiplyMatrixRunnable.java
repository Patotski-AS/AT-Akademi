package com.itacademy.javacore.homeWork.homeWork11.task5;

public class MultiplyMatrixRunnable implements Runnable {
    private final int[][] first;
    private final int[][] second;
    private static volatile int[][] result;

    public MultiplyMatrixRunnable(int[][] first, int[][] second) {
        this.first = first;
        this.second = second;
        result = new int[first.length][second[0].length];
    }

    @Override
    public void run() {
        int countThread = Integer.parseInt(Thread.currentThread().getName().replace("Thread-", ""));
        for (int i = 0; i < first.length; i++) {
            if (i % 5 == countThread) {
                for (int j = 0; j < first[0].length; j++) {
                    int value = 0;
                    for (int k = 0; k < second[0].length; k++) {
                        value += first[i][j] * second[k][i];
                    }
                    result[i][j] = value;
                }
            }
        }
    }

    public int[][] getResult() {
        return result;
    }
}
