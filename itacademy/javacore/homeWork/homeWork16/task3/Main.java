package com.itacademy.javacore.homeWork.homeWork16.task3;

import java.util.Arrays;

/**
 * (*- �������������� ������) ������� Strategy.
 * ����������� ������ ������ �������� ���������� ����� �����: ������� ����� sort,
 * ������� ��������� �����, ������������ � ����������� ��������,
 * ������� ����� ��������. ��� ����� ����������� ���������
 * ���������� ����������(��������, ���������, ��������,
 * �������, ��������, ������� ���������� �����; ��� ���������� �������� � ���������)
 * � ������������ ����������� ���������� java,
 * ��� ������� �������� ���������� ����� ��������������� �����-���������.
 */
public class Main {
    public static void main(String[] args) {
        int [] ints = {8,0,3,4,6,9,2,5,1};
        Sorted sorted = new Sorted();
        sorted.setSorted(NameSorted.HOARE);
        sorted.sort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
