package com.itacademy.javacore.homeWork.homeWork11.task3;

import java.util.Arrays;

//—оздать 2 матрицы случайных чисел размера 5*5, вывести их на консоль.
//        —оздать 5 потоков, каждый поток складывает соответствующие строки матрицы.
//        ¬ конце в main вывести результат сложени€ матриц.

public class Main {
    public static void main(String[] args) {
        int[][] first = randomMatrix(5, 5);
        int[][] second = randomMatrix(5, 5);
        int[][] result;
        System.out.println( "First: " + Arrays.deepToString(first));
        System.out.println( "Second: " +  Arrays.deepToString(second));

        SumMatrixThread[] sumMatrices = new SumMatrixThread[5];

        for (int i = 0; i < sumMatrices.length; i++) {
            sumMatrices[i] = new SumMatrixThread(first[i], second[i]);
        }

        for (SumMatrixThread sumMatrixThread : sumMatrices) {
            sumMatrixThread.start();
        }

        for (SumMatrixThread sumMatrixThread : sumMatrices) {
            try {
                sumMatrixThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        result = new int[5][5];
        for (int i = 0; i < result.length; i++) {
            result[i] = sumMatrices[i].getResult();
        }
        System.out.println( "Result: " +  Arrays.deepToString(result));
    }

    public static int[][] randomMatrix(int x, int y) {
        int[][] ints = new int[x][y];

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[0].length; j++) {
                ints[i][j] = (int) (Math.random() * 50 + 1);
            }
        }
        return ints;
    }
}


