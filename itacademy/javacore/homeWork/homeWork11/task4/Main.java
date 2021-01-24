package com.itacademy.javacore.homeWork.homeWork11.task4;


import java.util.Arrays;

//(*-�������������� ������) ������� 2 ������� ��������� ����� ������� 500*500.
//        ������� 5 �������, ������ ����� ���������� ��������������� ������ �������
//        (� � ������, ������� n%5 == t, ��� t - ����� ������, n - ����� ������).
//        � ����� � main ������� ��������� �������� ������.
//        ������ �����, ������� ���� �� ����� �������� (System.currentTimeMillis()).
//        ����������� �������� ��� �� ������ � main � ��������� �����, ����������� �� ��������.
public class Main {
    public static void main(String[] args) {
        int[][] first = randomMatrix(500, 500);
        int[][] second = randomMatrix(500, 500);

// ����� ��������� ����������������� ������� �� ������ ��������
//        System.out.println(Arrays.deepToString(first));
//        System.out.println(Arrays.deepToString(second));
//        System.out.println(Arrays.deepToString(threadMethod(first,second)));
//        System.out.println(Arrays.deepToString(usualMethod(first,second)));

        long a = System.currentTimeMillis();
        threadMethod(first, second);
        System.out.println("threadMethod " + (System.currentTimeMillis() - a) + " ms");
        long b = System.currentTimeMillis();
        usualMethod(first, second);
        System.out.println("usualMethod " + (System.currentTimeMillis() - b) + " ms");

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

    public static int[][] threadMethod(int[][] first, int[][] second) {
        SumMatrixRunnable matrix = new SumMatrixRunnable(first, second);
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(matrix);
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        return matrix.getResult();
    }

    public static int[][] usualMethod(int[][] first, int[][] second) {
        int[][] result = new int[first.length][first[0].length];
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }
        return result;
    }
}
