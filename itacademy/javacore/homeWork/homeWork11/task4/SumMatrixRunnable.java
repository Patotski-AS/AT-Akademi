package com.itacademy.javacore.homeWork.homeWork11.task4;


public class SumMatrixRunnable implements Runnable {
    private final int[][] first;
    private final int[][] second;
    private  volatile int[][] result;

    public SumMatrixRunnable(int[][] first, int[][] second) {
        this.first = first;
        this.second = second;
        result = new int[first.length][first[0].length];
    }
    @Override
    public void run() {
        int countThread=Integer.parseInt( Thread.currentThread().getName().replace("Thread-", ""));
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[0].length; j++) {
                if (j % 5 == countThread) {
                    result[i][j] = first[i][j] + second[i][j];
                }
            }
        }
    }

    public int[][] getResult() {
        return result;
    }

}
