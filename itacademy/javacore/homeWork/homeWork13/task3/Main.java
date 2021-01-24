package com.itacademy.javacore.homeWork.homeWork13.task3;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Создать пул из 3 потоков. Создать массив из 10 случайных чисел от 1 до 100 и
//        создать пустой массив для 10 чисел результатов.
//        Создать и запустить Runnable для каждого i-го элемента массива,
//        который считает сумму элементов от 0-го элемента до этого элемента и
//        записывает ее в i-ый элемент массива результатов. После выполнения всех заданий вывести результирующий массив.


public class Main {
    static int[] firstArray = new int[10];
    static int[] secondArray = new int[10];

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = new Random().nextInt(100) + 1;
        }

        System.out.println(Arrays.toString(firstArray));

        for (int i = 0; i < firstArray.length; i++) {
            service.execute(new MyRunnable(i));
        }
        service.execute(() -> System.out.println(Arrays.toString(secondArray)));
        service.shutdown();
    }

    public static class MyRunnable implements Runnable {
        private final int x;

        public MyRunnable(int x) {
            this.x = x;
        }

        @Override
        public void run() {
            int result = 0;
            for (int i = 0; i <= x; i++) {
                result += firstArray[i];
            }
            secondArray[x] = result;
        }
    }

}
