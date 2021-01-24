package com.itacademy.javacore.homeWork.homeWork11.task2;



//Создать класс поток, который спит 3 секунды и затем заполняет файл 10-ю целыми числами.
//        Создать другой класс поток, который читает числа из файла и находит их среднее арифметическое.
//        Запустить оба потока в main.
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
