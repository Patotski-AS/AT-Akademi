package com.itacademy.javacore.homeWork.homeWork15.task2;

import java.time.LocalDate;

/**
 * �������� ���������� ������ � �������, ������� ������� �� ����� ������� ����.
 * �������� ��� Singleton � ����������� � �������� ���� ���������.
 */


public class CurrentDate {
    private final LocalDate date;
    private static CurrentDate currentDate;

    private CurrentDate() {
        this.date = LocalDate.now();
    }
    public static synchronized CurrentDate newDate() {
        if (currentDate == null) {
            return currentDate = new CurrentDate();
        }
        return currentDate;
    }

    public void getDate() {
        System.out.println(date);
    }
}
