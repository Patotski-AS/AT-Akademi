package com.itacademy.javacore.homeWork.homeWork12.task1;

//������� 3 ������, ������ �� ������� � ����� � 5 ���������� ������������ �� ������ ��������
//        ������� ������ � ���� � ��� �� ���� ������, ������� ��� ������� � ����������� ������� ������,
//        ���� 1 �������,
//        ����� ������ �� ������ � ����-�� ����� � ������� �� ������� ������������ � ����� ������.
//        ���������������� ������ c ������� synchronized..

import java.io.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        String path = "D://JAVA//RUSH//src//com//itacademy//javacore//homeWork//homeWork12//task1//";
        File file = new File( path + "File.txt");

        Thread thread1 = new Thread(new WriterReader("First",file),"First thread");
        Thread thread2 = new Thread(new WriterReader("Second",file),"Second thread");
        Thread thread3 = new Thread(new WriterReader("Third",file),"Third thread");

        thread1.start();
        thread2.start();
        thread3.start();
    }

    public static class WriterReader implements Runnable {
        private final String string;
        private final File file;

        public WriterReader(String string, File file) {
            this.string = string;
            this.file = file;
        }

        @Override
        public void run() {
            synchronized (file) {
                try (FileWriter writer = new FileWriter(file);
                     BufferedWriter bw = new BufferedWriter(writer)) {
                    for (int i = 0; i < 5; i++) {
                        bw.write(string + "-" + i + " ");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try (FileReader fr = new FileReader(file);
                     BufferedReader br = new BufferedReader(fr)) {
                    Thread.sleep(1000);
                    String s = "";
                    while ((s = br.readLine())!=null) {
                        System.out.println(s + " - " + Thread.currentThread().getName());
                    }
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
