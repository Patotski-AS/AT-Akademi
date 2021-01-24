package com.itacademy.javacore.homeWork.homeWork11.task5;


import java.util.Arrays;

// Создать 2 матрицы случайных чисел размера 5*5, вывести их на консоль.
//         Создать 5 потоков, каждый из которых вычисляет строку новой матрицы
//         - произведения этих матриц.
//         В конце в main вывести результат произведения матриц.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[][] first = randomMatrix(5, 5);
        int[][] second = randomMatrix(5, 5);


        MultiplyMatrixRunnable matrix = new MultiplyMatrixRunnable(first,second);

        Thread [] threads = new Thread[5];

        for (int i = 0; i < threads.length ; i++) {
            threads[i] = new Thread(matrix);
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        printMatrix(second);
        System.out.println();
        printMatrix(first);
        System.out.println();
        printMatrix(matrix.getResult());



    }

    public static int[][] randomMatrix(int x, int y) {
        int[][] ints = new int[x][y];

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[0].length; j++) {
//               ints[i][j] = (int) (Math.random() * 10 - 5);
                ints[i][j] = i+1;
            }
        }
        return ints;
    }

    public static void printMatrix (int [][] matrix){
        for (int [] x: matrix){
            System.out.println(Arrays.toString(x));
        }
    }


}
