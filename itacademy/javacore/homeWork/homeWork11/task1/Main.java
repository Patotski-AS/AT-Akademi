package com.itacademy.javacore.homeWork.homeWork11.task1;


//������� ����� �����, ������� ���������� ������ ��������� ����� ����� �� 10 ���������,
//        ����� ������� ������������ �������, � ���� �������,
//        � ������� �� ����� � ������� ��� ������, ������������ �������. ��������� 10 �������.
public class Main {
    public static void main(String[] args) {
        Test[] tests = new Test[10];
        for (int i = 0; i < tests.length; i++) {
            tests[i] = new Test();
        }
        for (Test test : tests) {
            test.start();
        }
    }


}
