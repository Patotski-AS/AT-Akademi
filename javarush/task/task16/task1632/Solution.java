package com.javarush.task.task16.task1632;

//1. Создай 5 различных своих нитей c отличным от Thread типом:
//1.1. Нить 1 должна бесконечно выполняться;
//1.2. Нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
//1.3. Нить 3 должна каждые полсекунды выводить "Ура";
//1.4. Нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
//1.5. Нить 5 должна читать с консоли числа пока не введено слово "N", а потом вывести в консоль сумму введенных чисел.
//2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
//3. Нити не должны стартовать автоматически.
//
//        Подсказка:
//Нить 4 можно проверить методом isAlive()


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(0,new Thread1());
        threads.add(1,new Thread2());
        threads.add(2,new Thread3());
        threads.add(3,new Thread4());
        threads.add(4,new Thread5());
    }


    public static void main(String[] args) throws InterruptedException {

    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Проверка");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }


    public static class Thread3 extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Thread4 extends Thread implements Message {

        @Override
        public void run() {
            while (!isInterrupted()) {
                System.out.println("Проверка");
            }
        }

        @Override
        public void showWarning() {
            if (this.isAlive())
            this.interrupt();
        }
    }


    public static class Thread5 extends Thread {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int result = 0;


        @Override
        public void run() {
            try {
                while (!((s = reader.readLine()).equals("N")))
                    result += Integer.parseInt(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(result);
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


























































