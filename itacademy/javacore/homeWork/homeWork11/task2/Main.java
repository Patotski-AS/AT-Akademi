package com.itacademy.javacore.homeWork.homeWork11.task2;



//������� ����� �����, ������� ���� 3 ������� � ����� ��������� ���� 10-� ������ �������.
//        ������� ������ ����� �����, ������� ������ ����� �� ����� � ������� �� ������� ��������������.
//        ��������� ��� ������ � main.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        String path = "D:\\JAVA\\RUSH\\src\\com\\itacademy\\javacore\\homeWork\\homeWork11\\task2\\";
        Writer writer = new Writer(  path + "File1.txt");
        writer.setPriority(Thread.MAX_PRIORITY);
        Reader reader = new Reader(path+ "File1.txt");
        writer.start();
        writer.join();
        reader.start();

    }

}
