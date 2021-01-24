package com.itacademy.javacore.homeWork.homeWork13.task6;


//Создать пул из 5 потоков. Создать 2 матрицы случайных чисел от 0 до 20 размера 500*500,
//        реализовать их сложение с помощью пула потоков. Создать для пула потоков задачи,
//        каждая из которых складывает i-e строки этих матриц и записывает результат.
//        После выполнения сложения матриц посчитать сумму всех элементов результирующей матрицы.
//        Для этого создать задачи, каждая из которых складывает все числа в i-m столбце этой матрицы.
//        Затем собрать и сложить результаты этих задач.
//


import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        MatrixHandler handler = new MatrixHandler();
        int[][] first = handler.randomMatrix(500, 500);
        int[][] second = handler.randomMatrix(500, 500);
        int[][] sumMatrix = handler.sumMatrix(first, second);

        //для проверки использовал маленькие матрицы 5х5;

//        System.out.println(Arrays.deepToString(first));
//        System.out.println(Arrays.deepToString(second));
//        System.out.println(Arrays.deepToString(sumMatrix));

        System.out.println(handler.sumElements(sumMatrix));

    }

    public static class MatrixHandler {

        public int[][] randomMatrix(int x, int y) {
            int[][] ints = new int[x][y];

            for (int i = 0; i < ints.length; i++) {
                for (int j = 0; j < ints[0].length; j++) {
                    ints[i][j] = new Random().nextInt(20);
                }
            }
            return ints;
        }

        public int[][] sumMatrix(int[][] first, int[][] second) {
            ExecutorService service = Executors.newFixedThreadPool(5);
            int[][] result = new int[first.length][first[0].length];
            for (int i = 0; i < first.length; i++) {
                int x = i;
                service.execute(() -> {
                    for (int j = 0; j < first[x].length; j++) {
                        result[x][j] = first[x][j] + second[x][j];
                    }
                });
            }
            service.shutdown();
            if (!service.isTerminated()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return result;
        }

        public long sumElements(int[][] matrix) {
            ExecutorService service = Executors.newFixedThreadPool(5);
            AtomicInteger sum = new AtomicInteger();
            List<Future<Integer>> list = new LinkedList<>();
            for (int i = 0; i < matrix[0].length; i++) {
                int x = i;
                list.add(service.submit(() -> {
                    int result = 0;
                    for (int[] ints : matrix) {
                        result += ints[x];
                    }
                    return result;
                }));
            }
            service.shutdown();
            for (Future<Integer> x : list) {
                try {
                    sum.addAndGet(x.get());
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
            return sum.get();
        }
    }
}