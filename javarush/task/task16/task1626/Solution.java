package com.javarush.task.task16.task1626;

//Разберись, как работает программа.
//По образу и подобию CountdownRunnable создай нить CountUpRunnable,
//которая выводит значения в нормальном порядке - от 1 до number.

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable {
        private int contIndexDown = 1;

        @Override
        public void run() {
            try {
                while (contIndexDown<=5) {
                    System.out.println(toString());
                    contIndexDown += 1;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }


        }

        @Override
        public String toString() {
            return Thread.currentThread().getName() + ": " + contIndexDown;
        }


        //Add your code here - добавь код тут
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}






























