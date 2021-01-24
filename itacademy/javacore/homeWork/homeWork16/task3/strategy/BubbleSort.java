package com.itacademy.javacore.homeWork.homeWork16.task3.strategy;

public class BubbleSort implements SortStrategy {
    @Override
    public void sort(int[] ints) {
        int j;
        boolean flag = true;   // ������������� ��� ���� � true ��� ������� ������� �� �������
        int temp;   // ��������������� ����������

        while (flag) {
            flag = false;    // ������������� ���� � false � �������� ���������� ����� (������ �������)
            for (j = 0; j < ints.length - 1; j++) {
                if (ints[j] > ints[j + 1]) { // �������� �� < ��� ���������� �� ��������
                    temp = ints[j];         // ������ �������� �������
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                    flag = true;  // true ��������, ��� ������ ������� ���� ���������
                }
            }
        }
    }
}
